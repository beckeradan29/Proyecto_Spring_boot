package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Telefono_Cliente;

@Repository
public interface Telefono_Cliente_Repo extends JpaRepository<Telefono_Cliente, 	Serializable>{

	public List<Telefono_Cliente> findByIdtelefono(Integer idtelefono);
}
