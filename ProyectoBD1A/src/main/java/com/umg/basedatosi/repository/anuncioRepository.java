package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.anuncio;

@Repository
public interface anuncioRepository extends JpaRepository<anuncio, Serializable> {
	
 public List<anuncio> findByIdanuncio(Integer idanuncio);
}
