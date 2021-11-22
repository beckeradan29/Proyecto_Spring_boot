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

import com.umg.basedatosi.entity.anuncio;
import com.umg.basedatosi.repository.anuncioRepository;

@RestController
@RequestMapping("/anuncio")
@CrossOrigin
public class anuncioService {

	@Autowired
	anuncioRepository AnuncioRepositorio;
	
	@GetMapping(path = "/buscar")
	public List<anuncio> getAllAnuncio(){
		return AnuncioRepositorio.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public anuncio saveAnuncio(@RequestBody anuncio Anuncio) {
		return AnuncioRepositorio.save(Anuncio);
	}
	
	@GetMapping(path = "/buscar/{idanuncio}")
	public List<anuncio> getAllAnuncios(@PathVariable("idanuncio") Integer idanuncio){
		return AnuncioRepositorio.findByIdanuncio(idanuncio);
	}
	
	@DeleteMapping(path = "/eliminar/{cod_anuncio}")
	public void deleteSucursal(@PathVariable("cod_anuncio") Integer cod_anuncio) {
     
		Optional<anuncio> anuncio;
		anuncio = AnuncioRepositorio.findById(cod_anuncio);
		if(anuncio.isPresent()) {
			AnuncioRepositorio.delete(anuncio.get());
		}
	}
}
