package com.umg.basedatosi.service;

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

import com.umg.basedatosi.entity.Factura;
import com.umg.basedatosi.repository.Factura_Repo;

@RestController
@RequestMapping("/Factura")
@CrossOrigin
public class Factura_Service {

	@Autowired
	Factura_Repo factura;
	
	
	@GetMapping(path = "/buscar")
	public List<Factura> getAllFactura(){
		return factura.findAll();
	}
	@GetMapping(path = "/buscar/super/{gasolina}")
	public int getBuscarPro(@PathVariable("gasolina") String gasolina){
		return factura.BuscarPro(gasolina);
	}
	@GetMapping(path = "/buscar/empleado/{empleado}")
	public int getBuscarEmp(@PathVariable("empleado") Integer empleado){
		return factura.BuscarPro1(empleado);
	}
	@GetMapping(path = "/buscar/cliente/{cliente}")
	public int getBuscarCli(@PathVariable("cliente") Integer cliente){
		return factura.BuscarPro2(cliente);
	}

	@PostMapping(path = "/guardar")
	public Factura saveFactura(@RequestBody Factura factura1) {
		return factura.save(factura1);
	}
	
	@DeleteMapping(path = "/eliminar/{codfactura}")
	public void deleteFactura(@PathVariable("codfactura") Integer codfactura) {
     
		Optional<Factura> factura1;
		factura1 = factura.findById(codfactura);
		if(factura1.isPresent()) {
			factura.delete(factura1.get());
		}
	}
	@GetMapping(path = "/buscar/{codfactura}")
	public List<Factura> getAllFacturas(@PathVariable("codfactura") Integer codfactura){
		return factura.findByCodfactura(codfactura);
	}
	
}













