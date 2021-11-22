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
@Table(name = "DIRECCION_CLIENTE")
public class Direccion_Cliente implements  Serializable{

    private static final long serialVersionUID = 6L;
	
	@Id
	@SequenceGenerator(name = "SqcDireccion",sequenceName = "SQC_DIRECCION_CLIENTE",allocationSize = 1)
	@GeneratedValue(generator = "SqcDireccion", strategy=GenerationType.TABLE)
    private Integer iddireccion;
	
	@Column(name = "COD_CLIENTE")
    private Integer codCliente;
	
	@Column(name = "DIRECCION")
    private String direccion;

	public Integer getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(Integer iddireccion) {
		this.iddireccion = iddireccion;
	}

	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
