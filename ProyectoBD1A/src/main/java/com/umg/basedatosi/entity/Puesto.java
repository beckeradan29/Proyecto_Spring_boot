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
@Table(name = "PUESTO")
public class Puesto implements  Serializable{

    private static final long serialVersionUID = 13L;
	
	@Id
	@SequenceGenerator(name = "SqcPuesto",sequenceName = "SQC_PUESTO",allocationSize = 1)
	@GeneratedValue(generator = "SqcPuesto", strategy=GenerationType.TABLE)
    private Integer idpuesto;
	
	@Column(name = "puesto")
    private String puesto;
	
	@OneToMany(mappedBy = "idPuesto")
	private List<Empleado> epuesto;

	public Integer getIdpuesto() {
		return idpuesto;
	}

	public void setIdpuesto(Integer idpuesto) {
		this.idpuesto = idpuesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public List<Empleado> getEpuesto() {
		return epuesto;
	}

	public void setEpuesto(List<Empleado> epuesto) {
		this.epuesto = epuesto;
	}
	
}
