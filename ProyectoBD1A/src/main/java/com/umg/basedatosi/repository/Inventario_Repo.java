package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Inventario;

@Repository
public interface Inventario_Repo extends JpaRepository<Inventario, Serializable>{
 
	public List<Inventario> findByCodinventario(Integer codinventario);
}