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

import com.umg.basedatosi.entity.Inventario;
import com.umg.basedatosi.repository.Inventario_Repo;

@RestController
@RequestMapping("/InventarioService")
@CrossOrigin
public class Inventario_Service {

	@Autowired
	Inventario_Repo inventario;
	
	@GetMapping(path = "/buscar")
	public List<Inventario> getAllInventario(){
		return inventario.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Inventario saveInventario(@RequestBody Inventario inventario1) {
		return inventario.save(inventario1);
	
	}	
	
	@GetMapping(path = "/buscar/{codinventario}")
	public List<Inventario> getAllInventarios(@PathVariable("codinventario") Integer codinventario){
		return inventario.findByCodinventario(codinventario);
	}
    
	@DeleteMapping(path = "/eliminar/{codinventario}")
	public void deleteInventario(@PathVariable("codinventario") Integer codinventario) {
     
		Optional<Inventario> inve;
		inve = inventario.findById(codinventario);
		if(inve.isPresent()) {
			inventario.delete(inve.get());
		}
	}
}
