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

import com.umg.basedatosi.entity.Direccion_Empleado;
import com.umg.basedatosi.repository.Direccion_Empleado_Repo;

@RestController
@RequestMapping("/DireccionEmp")
@CrossOrigin
public class Direccion_Empleado_Service{

	@Autowired
	Direccion_Empleado_Repo direccion;
	
	@GetMapping(path = "/buscar")
	public List<Direccion_Empleado> getAllDireccion(){
		return direccion.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Direccion_Empleado saveDireccion(@RequestBody Direccion_Empleado direccion1) {
		return direccion.save(direccion1);
	
	}	
	@GetMapping(path = "/buscar/{iddireccion}")
	public List<Direccion_Empleado> getAllDireccion(@PathVariable("iddireccion") Integer iddireccion){
		return direccion.findByIddireccion(iddireccion);
	}
	@DeleteMapping(path = "/eliminar/{iddireccion}")
	public void deleteGenero(@PathVariable("iddireccion") Integer iddireccion) {
     
		Optional<Direccion_Empleado> dire;
		dire = direccion.findById(iddireccion);
		if(dire.isPresent()) {
			direccion.delete(dire.get());
		}
}
}











