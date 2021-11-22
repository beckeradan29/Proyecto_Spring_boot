package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Tipo_Producto;

@Repository
public interface Tipo_Producto_Repo extends JpaRepository<Tipo_Producto, Serializable>{

	public List<Tipo_Producto> findByIdtipo(Integer idtipo);
}
