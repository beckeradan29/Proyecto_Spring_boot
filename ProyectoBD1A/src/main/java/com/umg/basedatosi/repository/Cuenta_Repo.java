package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Cuenta;

@Repository
public interface Cuenta_Repo extends JpaRepository<Cuenta, Serializable>{

	public List<Cuenta> findByIdcuenta(Integer idcuenta);
}
