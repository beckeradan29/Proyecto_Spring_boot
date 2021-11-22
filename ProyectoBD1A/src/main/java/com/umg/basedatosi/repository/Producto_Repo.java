package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Producto;

@Repository
public interface Producto_Repo extends JpaRepository<Producto, Serializable>{

	public List<Producto> findByCodproducto(Integer codproducto);
	 
}
