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

import com.umg.basedatosi.entity.Sucursal;
import com.umg.basedatosi.repository.Sucursal_Repo;

@RestController
@RequestMapping("/Sucursal")
@CrossOrigin
public class Sucursal_Service {

	@Autowired
	Sucursal_Repo sucursal;
	
	@GetMapping(path = "/buscar")
	public List<Sucursal> getAllSucursal(){
		return sucursal.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Sucursal saveSucursal(@RequestBody Sucursal sucursal1) {
		return sucursal.save(sucursal1);
	
	}
	@GetMapping(path = "/buscar/{codsucursal}")
	public List<Sucursal> getAllSucursal(@PathVariable("codsucursal") Integer codsucursal){
		return sucursal.findByCodsucursal(codsucursal);
	}
	@DeleteMapping(path = "/eliminar/{codsucursal}")
	public void deleteSucursal(@PathVariable("codsucursal") Integer cod_sucursal) {
     
		Optional<Sucursal> sucurs;
		sucurs = sucursal.findById(cod_sucursal);
		if(sucurs.isPresent()) {
			sucursal.delete(sucurs.get());
		}
	}
}











