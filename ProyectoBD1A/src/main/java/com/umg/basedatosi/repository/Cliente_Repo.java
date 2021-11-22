package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Cliente;

@Repository
public interface Cliente_Repo extends JpaRepository<Cliente, Serializable>{
	
	public List<Cliente> findByNombreAndCorreo(String nombre, String correo);
	
	public List<Cliente> findByCodcliente(Integer codcliente);

}
