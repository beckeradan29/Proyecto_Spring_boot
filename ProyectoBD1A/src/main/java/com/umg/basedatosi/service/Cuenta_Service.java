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

import com.umg.basedatosi.entity.Compra;
import com.umg.basedatosi.repository.Compra_Repo;

@RestController
@RequestMapping("/Compra")
@CrossOrigin
public class Cuenta_Service {
	@Autowired
	Compra_Repo compra;
	
	@GetMapping(path = "/buscar")
	public List<Compra> getAllCompra(){
		return compra.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Compra saveCompra(@RequestBody Compra cuenta1) {
		return compra.save(cuenta1);
	}
	
	@GetMapping(path = "/buscar/{idcompra}")
	public List<Compra> getAllCompras(@PathVariable("idcompra") Integer idcompra){
		return compra.findByIdcompra(idcompra);
	}

	@DeleteMapping(path = "/eliminar/{idcompra}")
	public void deleteCompra(@PathVariable("idcompra") Integer idcompra) {
     
		Optional<Compra> cuenta1;
		cuenta1 = compra.findById(idcompra);
		if(cuenta1.isPresent()) {
			compra.delete(cuenta1.get());
		}
	}
}
