package com.umg.basedatosi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "ANUNCIO")
public class anuncio implements Serializable{

	private static final long serialVersionUID = 1;

	@Id
	@SequenceGenerator(name = "SqcAnuncio",sequenceName = "SQC_ANUNCIO",allocationSize = 1)
	@GeneratedValue(generator = "SqcAnuncio", strategy=GenerationType.TABLE)
	private Integer idanuncio;
	
	@Column(name = "descripcion")
	private String anuncio;
	
	@Column(name = "fecha_inicio")
	private String fecha_incio;
	
	@Column(name = "fecha_fin")
	private String fecha_fin;

	public Integer getIdanuncio() {
		return idanuncio;
	}

	public void setIdanuncio(Integer idanuncio) {
		this.idanuncio = idanuncio;
	}

	public String getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(String anuncio) {
		this.anuncio = anuncio;
	}

	public String getFecha_incio() {
		return fecha_incio;
	}

	public void setFecha_incio(String fecha_incio) {
		this.fecha_incio = fecha_incio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	
}
