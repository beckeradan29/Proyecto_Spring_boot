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

import com.umg.basedatosi.entity.Puesto;
import com.umg.basedatosi.repository.Puesto_Repo;

@RestController
@RequestMapping("/Puesto")
@CrossOrigin
public class Puesto_Service{

	@Autowired
	Puesto_Repo puesto;
	
	@GetMapping(path = "/buscar")
	public List<Puesto> getAllPuesto(){
		return puesto.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Puesto savePuesto(@RequestBody Puesto puesto1) {
		return puesto.save(puesto1);
	
	}	
	@GetMapping(path = "/buscar/{ipuesuto}")
	public List<Puesto> getAlluPuesto(@PathVariable("ipuesuto") Integer idpuesto){
		return puesto.findByIdpuesto(idpuesto);
	}
	
	@DeleteMapping(path = "/eliminar/{idpuesto}")
	public void deletePueto(@PathVariable("idpuesto") Integer idpuesto) {
     
		Optional<Puesto> turn;
		turn = puesto.findById(idpuesto);
		if(turn.isPresent()) {
			puesto.delete(turn.get());
		}
	}

}
