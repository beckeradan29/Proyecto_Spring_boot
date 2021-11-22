package com.umg.basedatosi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.umg.basedatosi.entity.Factura;

@Repository
public interface Factura_Repo extends JpaRepository<Factura, Serializable>{

	 public List<Factura> findByCodfactura(Integer codfactura);
	 
	 
	 @Query(value = "SELECT COUNT(*) FROM FACTURA WHERE PRODUCTO = ?1", nativeQuery = true)
     public int BuscarPro(String gasolina);
	 
	 @Query(value = "SELECT COUNT(*) FROM FACTURA WHERE COD_EMPLEADO = ?1", nativeQuery = true)
     public int BuscarPro1(Integer empleado );
	 
	 @Query(value = "SELECT COUNT(*) FROM FACTURA WHERE COD_CLIENTE = ?1", nativeQuery = true)
     public int BuscarPro2(Integer cliente);
	 
}