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

import com.umg.basedatosi.entity.Categoria_Producto;
import com.umg.basedatosi.repository.Categoria_Producto_Repo;

@RestController
@RequestMapping("/CategoriaProd")
@CrossOrigin
public class Categoria_Producto_Service {

	@Autowired
	Categoria_Producto_Repo categoria;
	
	@GetMapping(path = "/buscar")
	public List<Categoria_Producto> getAllCategoria(){
		return categoria.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Categoria_Producto saveCategoria(@RequestBody Categoria_Producto categoria1) {
		return categoria.save(categoria1);
	}
	
	@GetMapping(path = "/buscar/{idcategoria}")
	public List<Categoria_Producto> getAllCategoria(@PathVariable("idcategoria") Integer idcategoria){
		return categoria.findByIdcategoria(idcategoria);
	}
	@DeleteMapping(path = "/eliminar/{idcategoria}")
	public void deleteSucursal(@PathVariable("idcategoria") Integer idcategoria) {
     
		Optional<Categoria_Producto> categoria1;
		categoria1 = categoria.findById(idcategoria);
		if(categoria1.isPresent()) {
			categoria.delete(categoria1.get());
		}
	}
}
