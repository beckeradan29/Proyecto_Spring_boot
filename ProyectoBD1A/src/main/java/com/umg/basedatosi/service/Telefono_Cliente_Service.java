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

import com.umg.basedatosi.entity.Telefono_Cliente;
import com.umg.basedatosi.repository.Telefono_Cliente_Repo;

@RestController
@RequestMapping("/TelefonoCli")
@CrossOrigin
public class Telefono_Cliente_Service {

	@Autowired
    Telefono_Cliente_Repo telefono;
	
	@GetMapping(path = "/buscar")
	public List<Telefono_Cliente> getAllTelefono(){
		return telefono.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Telefono_Cliente saveTelefono(@RequestBody Telefono_Cliente telefono1) {
		return telefono.save(telefono1);
	
	}	
	@GetMapping(path = "/buscar/{idtelefono}")
	public List<Telefono_Cliente> getAllTelefono(@PathVariable("idtelefono") Integer idtelefono){
		return telefono.findByIdtelefono(idtelefono);
	}
	@DeleteMapping(path = "/eliminar/{cod_telefono}")
	public void deleteTelefono(@PathVariable("cod_telefono") Integer cod_telefono) {
     
		Optional<Telefono_Cliente> telefo;
		telefo = telefono.findById(cod_telefono);
		if(telefo.isPresent()) {
			telefono.delete(telefo.get());
		}
}
}