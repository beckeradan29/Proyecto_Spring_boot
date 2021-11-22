package com.umg.basedatosi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_PRODUCTO ")
public class Tipo_Producto implements Serializable{

    private static final long serialVersionUID = 17L;
	
	@Id
	@SequenceGenerator(name = "SqcTipo",sequenceName = "SQC_TIPO_PRODUCTO",allocationSize = 1)
	@GeneratedValue(generator = "SqcTipo", strategy=GenerationType.TABLE)
    private Integer idtipo;
	
	@Column(name = "TIPO_PROD ")
    private String tipo;

	@OneToMany(mappedBy = "")
	public Integer getIdtipo() {
		return idtipo;
	}

	public void setIdtipo(Integer idtipo) {
		this.idtipo = idtipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
