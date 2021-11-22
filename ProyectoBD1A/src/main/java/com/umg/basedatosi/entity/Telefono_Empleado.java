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
@Table(name = "TELEFONO_EMPLEADO")
public class Telefono_Empleado implements  Serializable{

    private static final long serialVersionUID = 16L;
	
	@Id
	@SequenceGenerator(name = "SqcTeleEmp",sequenceName = "SQC_TELEFONO_EMPLEADO",allocationSize = 1)
	@GeneratedValue(generator = "SqcTeleEmp", strategy=GenerationType.TABLE)
    private Integer idtelefono;
	
	@Column(name = "COD_EMPLEADO")
    private Integer codEmpleado;
	
	@Column(name = "TELEFONO")
	private String telefonoo;

	public Integer getIdtelefono() {
		return idtelefono;
	}

	public void setIdtelefono(Integer idtelefono) {
		this.idtelefono = idtelefono;
	}

	public Integer getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(Integer codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getTelefonoo() {
		return telefonoo;
	}

	public void setTelefonoo(String telefonoo) {
		this.telefonoo = telefonoo;
	}
	
}
