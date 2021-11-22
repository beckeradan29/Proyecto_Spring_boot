package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Municipio;

@Repository
public interface Municipio_Repo extends JpaRepository<Municipio, Serializable>{

	 public List<Municipio> findByCodmunicipio(Integer codmunicipio);
}
