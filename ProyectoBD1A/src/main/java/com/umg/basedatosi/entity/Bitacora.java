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
@Table(name = "VITACORA")
public class Bitacora implements  Serializable{

    private static final long serialVersionUID = 2L;
	
	@Id
	@SequenceGenerator(name = "SqcBitacora",sequenceName = "SQC_BITACORA",allocationSize = 1)
	@GeneratedValue(generator = "SqcBitacota", strategy=GenerationType.TABLE)
	@Column(name = "idbitacura")
	private Integer idbitacora;
	
	@Column(name = "tabla")
    private String tabla;
	
	@Column(name = "usuario")
    private String usuario;
	
	@Column(name = "fecha")
    private String fecha;
	
	@Column(name = "antiguo")
    private String antiguo;
	
	@Column(name = "nuevo")
    private String nuevo;
	
	@Column(name = "atributo")
    private String atributo;
	
	@Column(name = "TIPO")
    private String tipo;

	public Integer getIdbitacora() {
		return idbitacora;
	}

	public void setIdbitacora(Integer idbitacora) {
		this.idbitacora = idbitacora;
	}

	public String getTabla() {
		return tabla;
	}

	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getAntiguo() {
		return antiguo;
	}

	public void setAntiguo(String antiguo) {
		this.antiguo = antiguo;
	}

	public String getNuevo() {
		return nuevo;
	}

	public void setNuevo(String nuevo) {
		this.nuevo = nuevo;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
