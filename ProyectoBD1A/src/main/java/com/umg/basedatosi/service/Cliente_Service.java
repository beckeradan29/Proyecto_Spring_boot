package com.umg.basedatosi.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.basedatosi.entity.Cliente;
import com.umg.basedatosi.entity.Direccion_Cliente;
import com.umg.basedatosi.entity.Factura;
import com.umg.basedatosi.entity.Telefono_Cliente;
import com.umg.basedatosi.repository.Cliente_Repo;
import com.umg.basedatosi.repository.Direccion_Cliente_Repo;
import com.umg.basedatosi.repository.Factura_Repo;
import com.umg.basedatosi.repository.Telefono_Cliente_Repo;

@RestController
@RequestMapping("/Cliente")
@CrossOrigin
public class Cliente_Service {

	@Autowired
    Cliente_Repo cliente;
	
	@Autowired
    Direccion_Cliente_Repo direccion;
	
	@Autowired
	Telefono_Cliente_Repo telefono;
	
	@Autowired
	Factura_Repo factura;
	
	@GetMapping(path = "/buscar")
	public List<Cliente> getAllCliente(){
		return cliente.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Cliente saveCliente(@RequestBody Cliente clientes) {
		
		List<Telefono_Cliente> telefonos= clientes.getTcliente();
		List<Direccion_Cliente> direccioness= clientes.getDcliente();
		
		clientes.setTcliente(null);
		clientes.setDcliente(null);
		
		clientes = cliente.save(clientes);
		
		clientes.setTcliente(new LinkedList<>());
		clientes.setDcliente(new LinkedList<>());
		
		if(telefonos!=null) {
			for(Telefono_Cliente t: telefonos) {
				t.setCodCliente(clientes.getCodcliente());
				telefono.save(t);
				clientes.getTcliente().add(t);
			}
		}
		
		if(direccioness!=null) {
			for(Direccion_Cliente d: direccioness) {
				d.setCodCliente(clientes.getCodcliente());
				direccion.save(d);
				clientes.getDcliente().add(d);
			}
		}
		return clientes;
	}
	
	@DeleteMapping(path = "/eliminar/{codcliente}")
	public String deleteCliente(@PathVariable("codcliente") Integer codcliente) {
    
		Optional<Cliente> clientes;
		clientes = cliente.findById(codcliente);
		if(clientes.isPresent()) {
	         Cliente borrar = clientes.get();
	         for(Factura t: borrar.getFcliente()) {
	        	 factura.delete(t);
	         }
	         for(Telefono_Cliente d: borrar.getTcliente()) {
	        	 telefono.delete(d);
	         }
	         for(Direccion_Cliente d: borrar.getDcliente()) {
	        	 direccion.delete(d);
	         }
	         
	         cliente.delete(clientes.get());
		}
		return "BORRADO";
	}
	@PostMapping(path = "/login")
	public Cliente login(@RequestBody Cliente cliente1) {
		
		List<Cliente> clientes = cliente.findByNombreAndCorreo(cliente1.getNombre(), cliente1.getCorreo());
		
		if(!clientes.isEmpty()) {
			return clientes.get(0);
		}
		
			return null;
	}
	
	@GetMapping(path = "/buscar/{codcliente}")
	public List<Cliente> getAllClientes(@PathVariable("codcliente") Integer codcliente){
		return cliente.findByCodcliente(codcliente);
	}
	
}
