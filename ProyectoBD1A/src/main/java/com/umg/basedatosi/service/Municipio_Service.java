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

import com.umg.basedatosi.entity.Municipio;
import com.umg.basedatosi.repository.Municipio_Repo;

@RestController
@RequestMapping("/Municipio")
@CrossOrigin
public class Municipio_Service{

	@Autowired
    Municipio_Repo municipio;
	
	@GetMapping(path = "/buscar")
	public List<Municipio> getAllMunicipio(){
		return municipio.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Municipio saveMunicipio(@RequestBody Municipio municipio1) {
		return municipio.save(municipio1);
	
	}	
	@GetMapping(path = "/buscar/{codmunicipio}")
	public List<Municipio> getAllMunicipio(@PathVariable("codmunicipio") Integer codmunicipio){
		return municipio.findByCodmunicipio(codmunicipio);
	}
	
	@DeleteMapping(path = "/eliminar/{codmunicipio}")
	public void deleteMunicipio(@PathVariable("codmunicipio") Integer codmunicipio) {
     
		Optional<Municipio> munici;
		munici = municipio.findById(codmunicipio);
		if(munici.isPresent()) {
			municipio.delete(munici.get());
		}
	}
	
}
