package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Categoria_Producto;

@Repository
public interface Categoria_Producto_Repo extends JpaRepository<Categoria_Producto, Serializable>{

public	List<Categoria_Producto> findByIdcategoria(Integer idcategoria);
}
