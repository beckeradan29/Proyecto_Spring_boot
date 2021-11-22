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

import com.umg.basedatosi.entity.Direccion_Empleado;
import com.umg.basedatosi.entity.Empleado;
import com.umg.basedatosi.entity.Telefono_Empleado;
import com.umg.basedatosi.repository.Direccion_Empleado_Repo;
import com.umg.basedatosi.repository.Empleado_Repo;
import com.umg.basedatosi.repository.Telefono_Empleado_Repo;

@RestController
@RequestMapping("/Empleado")
@CrossOrigin
public class Empleado_Service{

	@Autowired
    Empleado_Repo empleado;
	
	@Autowired
	Direccion_Empleado_Repo direccion;
	
	@Autowired
	Telefono_Empleado_Repo telefono;
	
	
	@GetMapping(path = "/buscar")
	public List<Empleado> getAllEmpleado(){
		return empleado.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Empleado saveEmpleado(@RequestBody Empleado empleados) {
		
		List<Telefono_Empleado> telefonos= empleados.getEtelefono();
		List<Direccion_Empleado> direccioness= empleados.getEdireccion();
		
		empleados.setEtelefono(null);
		empleados.setEdireccion(null);
		
		empleados = empleado.save(empleados);
		
		empleados.setEtelefono(new LinkedList<>());
		empleados.setEdireccion(new LinkedList<>());
		
		if(telefonos!=null) {
			for(Telefono_Empleado t: telefonos) {
				t.setCodEmpleado(empleados.getCodempleado());
				telefono.save(t);
				empleados.getEtelefono().add(t);
			}
		}
		
		if(direccioness!=null) {
			for(Direccion_Empleado d: direccioness) {
				d.setCodEmpleado(empleados.getCodempleado());
				direccion.save(d);
				empleados.getEdireccion().add(d);
			}
		}
		return empleados;
	}
	
	@DeleteMapping(path = "/eliminar/{codempleado}")
	public String deleteEmpleado(@PathVariable("codempleado") Integer codempleado) {
    
		Optional<Empleado> empleados;
		empleados = empleado.findById(codempleado);
		if(empleados.isPresent()) {
	         Empleado borrar = empleados.get();
	         for(Telefono_Empleado d: borrar.getEtelefono()) {
	        	 telefono.delete(d);
	         }
	         for(Direccion_Empleado d: borrar.getEdireccion()) {
	        	 direccion.delete(d);
	         }
	         
	         empleado.delete(empleados.get());
		}
		return "BORRADO";
	}
	@GetMapping(path = "/buscar/{codempleado}")
	public List<Empleado> getAllEmpleados(@PathVariable("codempleado") Integer codempleado){
		return empleado.findByCodempleado(codempleado);
	}
    
}
