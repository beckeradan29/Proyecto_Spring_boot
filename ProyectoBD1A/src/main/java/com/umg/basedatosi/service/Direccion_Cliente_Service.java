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

import com.umg.basedatosi.entity.Direccion_Cliente;
import com.umg.basedatosi.repository.Direccion_Cliente_Repo;

@RestController
@RequestMapping("/Direccion_Cliente")
@CrossOrigin
public class Direccion_Cliente_Service{

	@Autowired
    Direccion_Cliente_Repo direccion;
	
	@GetMapping(path = "/buscar")
	public List<Direccion_Cliente> getAllDireccion(){
		return direccion.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Direccion_Cliente saveDireccion(@RequestBody Direccion_Cliente direccion1) {
		return direccion.save(direccion1);
	
	}	
	@GetMapping(path = "/buscar/{iddireccion}")
	public List<Direccion_Cliente> getAllDireccion(@PathVariable("iddireccion") Integer iddireccion){
		return direccion.findByIddireccion(iddireccion);
	}
	@DeleteMapping(path = "/eliminar/{iddireccion}")
	public void deleteDireccion(@PathVariable("iddireccion") Integer iddireccion) {
     
		Optional<Direccion_Cliente> direccio;
		direccio = direccion.findById(iddireccion);
		if(direccio.isPresent()) {
			direccion.delete(direccio.get());
		}
}
}
