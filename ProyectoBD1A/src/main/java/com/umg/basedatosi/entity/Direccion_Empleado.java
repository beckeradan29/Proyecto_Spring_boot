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
@Table(name = "DIRECCION_EMPLEADO")
public class Direccion_Empleado implements  Serializable{

    private static final long serialVersionUID = 7L;
	
	@Id
	@SequenceGenerator(name = "SqcDireEmp",sequenceName = "SQC_DIRECCION_EMPLEADO",allocationSize = 1)
	@GeneratedValue(generator = "SqcDireEmp", strategy=GenerationType.TABLE)
    private Integer iddireccion;
	
	@Column(name = "COD_EMPLEADO")
	private Integer codEmpleado;
	
	@Column(name = "DIRECCION")
    private String direccion;

	public Integer getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(Integer iddireccion) {
		this.iddireccion = iddireccion;
	}

	public Integer getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(Integer codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
