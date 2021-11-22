package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CUENTA")
public class Cuenta implements Serializable{

	private static final long serialVersionUID = 21;

	@Id
	@SequenceGenerator(name = "SqcCuenta",sequenceName = "SQC_CUENTA",allocationSize = 1)
	@GeneratedValue(generator = "SqcCuenta", strategy=GenerationType.TABLE)
	@Column(name = "IDCUENTA")
	private Integer idcuenta;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "TOTAL")
	private Double total;
	
	@Column(name = "TOTAL1")
	private Double total1;
	
	@Column(name = "INGRESO")
	private Double ingreso;
	
	@Column(name = "GANANCIA")
	private Double ganancia;

	public Integer getIdcuenta() {
		return idcuenta;
	}

	public void setIdcuenta(Integer idcuenta) {
		this.idcuenta = idcuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getTotal1() {
		return total1;
	}

	public void setTotal1(Double total1) {
		this.total1 = total1;
	}

	public Double getIngreso() {
		return ingreso;
	}

	public void setIngreso(Double ingreso) {
		this.ingreso = ingreso;
	}

	public Double getGanancia() {
		return ganancia;
	}

	public void setGanancia(Double ganancia) {
		this.ganancia = ganancia;
	}
	
	
	
}
