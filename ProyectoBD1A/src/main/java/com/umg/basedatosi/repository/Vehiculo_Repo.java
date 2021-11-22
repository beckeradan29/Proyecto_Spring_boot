package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Vehiculo;

@Repository
public interface Vehiculo_Repo extends JpaRepository<Vehiculo, Serializable>{

	public List<Vehiculo> findByIdvehiculo(Integer idvehiculo);
}
