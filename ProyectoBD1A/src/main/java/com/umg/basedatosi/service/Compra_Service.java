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

import com.umg.basedatosi.entity.Cuenta;
import com.umg.basedatosi.repository.Cuenta_Repo;

@RestController
@RequestMapping("/Cuenta")
@CrossOrigin
public class Compra_Service {
	@Autowired
	Cuenta_Repo cuenta;
	
	@GetMapping(path = "/buscar")
	public List<Cuenta> getAllCuenta(){
		return cuenta.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Cuenta saveCuenta(@RequestBody Cuenta cuenta1) {
		return cuenta.save(cuenta1);
	}
	
	
	@GetMapping(path = "/buscar/{idcuenta}")
	public List<Cuenta> getAllCuentas(@PathVariable("idcuenta") Integer idcuenta){
		return cuenta.findByIdcuenta(idcuenta);
	}
	
	@DeleteMapping(path = "/eliminar/{idcuenta}")
	public void deleteCuenta(@PathVariable("idcuenta") Integer idcuenta) {
     
		Optional<Cuenta> cuenta1;
		cuenta1 = cuenta.findById(idcuenta);
		if(cuenta1.isPresent()) {
			cuenta.delete(cuenta1.get());
		}
	}
}
