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

import com.umg.basedatosi.entity.Vehiculo;
import com.umg.basedatosi.repository.Vehiculo_Repo;

@RestController
@RequestMapping("/Vehiculo")
@CrossOrigin
public class Vehiculo_Service {

	@Autowired
    Vehiculo_Repo vehiculo;
	
	@GetMapping(path = "/buscar")
	public List<Vehiculo> getAllVehiculo(){
		return vehiculo.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Vehiculo saveMenu(@RequestBody Vehiculo vehiculo1) {
		return vehiculo.save(vehiculo1);
	
	}
	@GetMapping(path = "/buscar/{idvehiculo}")
	public List<Vehiculo> getAllVehiculos(@PathVariable("idvehiculo") Integer idvehiculo){
		return vehiculo.findByIdvehiculo(idvehiculo);
	}
	
	
	@DeleteMapping(path = "/eliminar/{idvehiculo}")
	public void deleteVehiculo(@PathVariable("idvehiculo") Integer idvehiculo) {
     
		Optional<Vehiculo> veh;
		veh = vehiculo.findById(idvehiculo);
		if(veh.isPresent()) {
			vehiculo.delete(veh.get());
		}
	}
}
