package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Telefono_Empleado;

@Repository
public interface Telefono_Empleado_Repo extends JpaRepository<Telefono_Empleado, Serializable>{

	public List<Telefono_Empleado> findByIdtelefono(Integer idtelefono);
	
}
