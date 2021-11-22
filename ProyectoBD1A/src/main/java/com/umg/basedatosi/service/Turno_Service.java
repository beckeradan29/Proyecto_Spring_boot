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

import com.umg.basedatosi.entity.Turno;
import com.umg.basedatosi.repository.TurnoRepo;

@RestController
@RequestMapping("/Turno")
@CrossOrigin
public class Turno_Service {

	@Autowired
	TurnoRepo  turno;
	
	@GetMapping(path = "/buscar")
	public List<Turno> getAllTurno(){
		return turno.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Turno saveTurno(@RequestBody Turno turno1) {
		return turno.save(turno1);
	
	}	
	@GetMapping(path = "/buscar/{idturno}")
	public List<Turno> getAllTurno(@PathVariable("idturno") Integer idturno){
		return turno.findByIdturno(idturno);
	}
	@DeleteMapping(path = "/eliminar/{cod_turno}")
	public void deleteMenu(@PathVariable("cod_turno") Integer cod_turno) {
     
		Optional<Turno> turn;
		turn = turno.findById(cod_turno);
		if(turn.isPresent()) {
			turno.delete(turn.get());
		}
	}
}
