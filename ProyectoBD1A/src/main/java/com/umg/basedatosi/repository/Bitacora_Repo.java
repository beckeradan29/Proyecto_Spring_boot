package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Bitacora;

@Repository
public interface Bitacora_Repo extends JpaRepository<Bitacora, Serializable>{

	public List<Bitacora> findByIdbitacora(Integer idbitacora);
	
}
