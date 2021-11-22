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
@Table(name = "departamento")
public class Departamento implements  Serializable{

    private static final long serialVersionUID = 5L;
	
	@Id
	@SequenceGenerator(name = "SqcDepartamento",sequenceName = "SQC_DEPARTAMENTO",allocationSize = 1)
	@GeneratedValue(generator = "SqcDepartamento", strategy=GenerationType.TABLE)
	@Column(name = "cod_departamento")
    private Integer coddepartamento;
	
	@Column(name = "departamento")
    private String departamento;
	
	@OneToMany(mappedBy = "codDepartamento")
	private List<Municipio> codMunicipios;	
	
	public Integer getCoddepartamento() {
		return coddepartamento;
	}

	public void setCoddepartamento(Integer coddepartamento) {
		this.coddepartamento = coddepartamento;
	}

	public List<Municipio> getCodMunicipios() {
		return codMunicipios;
	}

	public void setCodMunicipios(List<Municipio> codMunicipios) {
		this.codMunicipios = codMunicipios;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
