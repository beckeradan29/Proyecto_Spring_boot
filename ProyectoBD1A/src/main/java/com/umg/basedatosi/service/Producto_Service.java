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

import com.umg.basedatosi.entity.Producto;
import com.umg.basedatosi.repository.Producto_Repo;

@RestController
@RequestMapping("/Producto")
@CrossOrigin
public class Producto_Service {
	
	@Autowired 
	Producto_Repo producto;
	

	@GetMapping(path = "/buscar")
	public List<Producto> getAllProducto(){
		return producto.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Producto saveProducto(@RequestBody Producto producto1) {
		return producto.save(producto1);
	}

	@GetMapping(path = "/buscar/{codproducto}")
	public List<Producto> getAllProductos(@PathVariable("codproducto") Integer codproducto){
		return producto.findByCodproducto(codproducto);
	}
	@DeleteMapping(path = "/eliminar/{codproducto}")
	public void deleteProducto(@PathVariable("codproducto") Integer codproducto) {
     
		Optional<Producto> produ;
		produ = producto.findById(codproducto);
		if(produ.isPresent()) {
			producto.delete(produ.get());
		}
	}
	
}
 