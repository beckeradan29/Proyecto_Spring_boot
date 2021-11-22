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

import com.umg.basedatosi.entity.Departamento;
import com.umg.basedatosi.repository.Departamento_Repo;

@RestController
@RequestMapping("/Departamento")
@CrossOrigin
public class Departamento_Service {

	@Autowired
	Departamento_Repo departamento;
	
	@GetMapping(path = "/buscar")
	public List<Departamento> getAllDepartamento(){
		return departamento.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Departamento saveDepartamento(@RequestBody Departamento departamento1) {
		return departamento.save(departamento1);
	}
	@GetMapping(path = "/buscar/{coddepartamento}")
	public List<Departamento> getAllDireccion(@PathVariable("coddepartamento") Integer coddepartamento){
		return departamento.findByCoddepartamento(coddepartamento);
	}
	
	@DeleteMapping(path = "/eliminar/{coddepartamento}")
	public void deleteEstado(@PathVariable("coddepartamento") Integer coddepartamento) {
     
		Optional<Departamento> depa;
		depa = departamento.findById(coddepartamento);
		if(depa.isPresent()) {
			departamento.delete(depa.get());
		}
	}
	
}
