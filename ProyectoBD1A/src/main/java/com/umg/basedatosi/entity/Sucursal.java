package com.umg.basedatosi.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "sucursal")
public class Sucursal implements  Serializable{

    private static final long serialVersionUID = 14L;
	
	@Id
	@SequenceGenerator(name = "SqcSucursal",sequenceName = "SQC_SUCURSAL",allocationSize = 1)
	@GeneratedValue(generator = "SqcSucursal", strategy=GenerationType.TABLE)
	@Column(name = "cod_sucursal")
    private Integer codsucursal;
	
	@Column(name = "cod_municipio")
	private Integer codMunicipio;
	
	@Column(name = "nombre_sucursal")
    private String nombre_sucursal;
	
	@OneToMany(mappedBy = "idCategoria")
	private List<Producto> idCategoria;
	
	@OneToMany(mappedBy = "codSucursal")
	private List<Empleado> codSucursal;
	
	public Integer getCodMunicipio() {
		return codMunicipio;
	}

	public List<Producto> getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(List<Producto> idCategoria) {
		this.idCategoria = idCategoria;
	}

	public List<Empleado> getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(List<Empleado> codSucursal) {
		this.codSucursal = codSucursal;
	}

	public void setCodMunicipio(Integer codMunicipio) {
		this.codMunicipio = codMunicipio;
	}


	public Integer getCodsucursal() {
		return codsucursal;
	}

	public void setCodsucursal(Integer codsucursal) {
		this.codsucursal = codsucursal;
	}

	public String getNombre_sucursal() {
		return nombre_sucursal;
	}

	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre_sucursal = nombre_sucursal;
	}
	
}
