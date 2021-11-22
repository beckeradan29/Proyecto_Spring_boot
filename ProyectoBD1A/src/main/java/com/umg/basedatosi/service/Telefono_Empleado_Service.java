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

import com.umg.basedatosi.entity.Telefono_Empleado;
import com.umg.basedatosi.repository.Telefono_Empleado_Repo;

@RestController
@RequestMapping("/TelefonoEmp")
@CrossOrigin
public class Telefono_Empleado_Service {

	@Autowired
	Telefono_Empleado_Repo telefono;
	
	@GetMapping(path = "/buscar")
	public List<Telefono_Empleado> getAllTelefono(){
		return telefono.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Telefono_Empleado saveTipo(@RequestBody Telefono_Empleado tipo1) {
		return telefono.save(tipo1);
	
	}	
	@GetMapping(path = "/buscar/{idtelefono}")
	public List<Telefono_Empleado> getAllTelefono(@PathVariable("idtelefono") Integer idtelefono){
		return telefono.findByIdtelefono(idtelefono);
	}
	@DeleteMapping(path = "/eliminar/{idtelefono}")
	public void deleteTelefono(@PathVariable("idtelefono") Integer idtelefono) {
     
		Optional<Telefono_Empleado> TipoI;
		TipoI = telefono.findById(idtelefono);
		if(TipoI.isPresent()) {
			telefono.delete(TipoI.get());
		}
	}
}
