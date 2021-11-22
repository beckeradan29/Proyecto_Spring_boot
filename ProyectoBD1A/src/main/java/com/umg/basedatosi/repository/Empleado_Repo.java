package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Empleado;

@Repository
public interface Empleado_Repo extends JpaRepository<Empleado, Serializable>{

	 public List<Empleado> findByCodempleado(Integer codempleado);
}
