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
@Table(name = "TELEFONO_CLIENTE")
public class Telefono_Cliente implements  Serializable{

    private static final long serialVersionUID = 15L;
	
	@Id
	@SequenceGenerator(name = "SqcTeleCli",sequenceName = "SQC_TELEFONO_CLIENTE",allocationSize = 1)
	@GeneratedValue(generator = "SqcTeleCli", strategy=GenerationType.TABLE)
    private Integer idtelefono;
	
	@Column(name = "COD_CLIENTE")
    private Integer codCliente;
	
	@Column(name = "TELEFONO")
    private String telefono;

	public Integer getIdtelefono() {
		return idtelefono;
	}

	public void setIdtelefono(Integer idtelefono) {
		this.idtelefono = idtelefono;
	}

	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
}
