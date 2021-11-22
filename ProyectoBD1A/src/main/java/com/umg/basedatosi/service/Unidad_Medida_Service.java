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

import com.umg.basedatosi.entity.Unidad_Medida;
import com.umg.basedatosi.repository.Unidad_Medida_Repo;

@RestController
@RequestMapping("/UnidadM")
@CrossOrigin
public class Unidad_Medida_Service {

	@Autowired
	Unidad_Medida_Repo unidadM;
	
	@GetMapping(path = "/buscar")
	public List<Unidad_Medida> getAllUnidad(){
		return unidadM.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Unidad_Medida saveUnidad(@RequestBody Unidad_Medida medida1) {
		return unidadM.save(medida1);
	
	}
	
	@GetMapping(path = "/buscar/{idunidad}")
	public List<Unidad_Medida> getAllUnidad(@PathVariable("idunidad") Integer idunidad){
		return unidadM.findByIdunidad(idunidad);
	}
	
	@DeleteMapping(path = "/eliminar/{cod_unidad_medida}")
	public void deleteMovimiento(@PathVariable("cod_unidad_medida") Integer cod_unidad_medida) {
     
		Optional<Unidad_Medida> unidad;
		unidad = unidadM.findById(cod_unidad_medida);
		if(unidad.isPresent()) {
			unidadM.delete(unidad.get());
		}
	}
}
