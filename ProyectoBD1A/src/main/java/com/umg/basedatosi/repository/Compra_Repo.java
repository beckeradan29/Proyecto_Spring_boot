package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Compra;

@Repository
public interface Compra_Repo extends JpaRepository<Compra, Serializable>{
 
	public List<Compra> findByIdcompra(Integer idcompra);
}
