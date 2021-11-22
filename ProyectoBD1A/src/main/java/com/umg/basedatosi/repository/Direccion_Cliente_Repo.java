package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Direccion_Cliente;

@Repository
public interface Direccion_Cliente_Repo extends JpaRepository<Direccion_Cliente, Serializable>{

	public List<Direccion_Cliente> findByIddireccion(Integer iddireccion);
}
