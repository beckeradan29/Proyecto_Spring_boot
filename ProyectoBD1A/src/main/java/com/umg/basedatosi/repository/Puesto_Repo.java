package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Puesto;

@Repository
public interface Puesto_Repo extends JpaRepository<Puesto, Serializable>{

	public List<Puesto> findByIdpuesto(Integer idpuesto);
}
