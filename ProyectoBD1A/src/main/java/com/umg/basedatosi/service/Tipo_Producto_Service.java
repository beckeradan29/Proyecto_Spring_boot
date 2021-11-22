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

import com.umg.basedatosi.entity.Tipo_Producto;
import com.umg.basedatosi.repository.Tipo_Producto_Repo;

@RestController
@RequestMapping("/TipoPro")
@CrossOrigin
public class Tipo_Producto_Service{

	@Autowired
	Tipo_Producto_Repo tipo;
	
	@GetMapping(path = "/buscar")
	public List<Tipo_Producto> getAllTipo(){
		return tipo.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Tipo_Producto saveTipo(@RequestBody Tipo_Producto estado1) {
		return tipo.save(estado1);
	
	}	
	@GetMapping(path = "/buscar/{idtipo}")
	public List<Tipo_Producto> getAllTipo(@PathVariable("idtipo") Integer idtipo){
		return tipo.findByIdtipo(idtipo);
	}
	@DeleteMapping(path = "/eliminar/{idtipo}")
	public void deleteTipo(@PathVariable("idtipo") Integer idtipo) {
     
		Optional<Tipo_Producto> estados;
		estados = tipo.findById(idtipo);
		if(estados.isPresent()) {
			tipo.delete(estados.get());
		}
	}
}

















