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

import com.umg.basedatosi.repository.Bitacora_Repo;
import com.umg.basedatosi.entity.Bitacora;
@RestController
@RequestMapping("/Bitacora")
@CrossOrigin
public class Bitacora_Service {

	@Autowired
	Bitacora_Repo Bitacora;
	
	@GetMapping(path = "/buscar")
	public List<Bitacora> getAllBitacora(){
		return Bitacora.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Bitacora saveBitacora(@RequestBody Bitacora bitacora1) {
		return Bitacora.save(bitacora1);
	}
	
	@GetMapping(path = "/buscar/{idbitacora}")
	public List<Bitacora> getAllBitacora(@PathVariable("idbitacora") Integer idbitacora){
		return Bitacora.findByIdbitacora(idbitacora);
	}
	
	@DeleteMapping(path = "/eliminar/{idbitacora}")
	public void deleteSexo(@PathVariable("idbitacora") Integer idbitacora) {
     
		Optional<Bitacora> bit;
		bit = Bitacora.findById(idbitacora);
		if(bit.isPresent()) {
			Bitacora.delete(bit.get());
		}
}
}