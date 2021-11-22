package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Direccion_Empleado;

@Repository
public interface Direccion_Empleado_Repo extends JpaRepository<Direccion_Empleado, Serializable>{

	public List<Direccion_Empleado> findByIddireccion(Integer iddireccion);
}
