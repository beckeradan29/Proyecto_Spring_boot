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
@Table(name = "municipio")
public class Municipio implements  Serializable{

    private static final long serialVersionUID = 11L;
	
	@Id
	@SequenceGenerator(name = "SqcMunicipio",sequenceName = "SQC_MUNICIPIO",allocationSize = 1)
	@GeneratedValue(generator = "SqcMunicipio", strategy=GenerationType.TABLE)
	@Column(name = "cod_municipio")
    private Integer codmunicipio;
	
	@Column(name = "cod_departamento")
	private Integer codDepartamento;

	@Column(name = "municipio")
    private String municipios;
	
	@OneToMany(mappedBy = "codMunicipio")
	private List<Sucursal> municipio;
	
	public List<Sucursal> getMunicipio() {
		return municipio;
	}

	public void setMunicipio(List<Sucursal> municipio) {
		this.municipio = municipio;
	}

	public Integer getCodmunicipio() {
		return codmunicipio;
	}

	public void setCodmunicipio(Integer codmunicipio) {
		this.codmunicipio = codmunicipio;
	}

	public Integer getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(Integer codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public String getMunicipios() {
		return municipios;
	}

	public void setMunicipios(String municipios) {
		this.municipios = municipios;
	}

	
	
}
