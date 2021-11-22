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
@Table(name = "VEHICULO")
public class Vehiculo implements  Serializable{

    private static final long serialVersionUID = 20L;
	
	@Id
	@SequenceGenerator(name = "SqcVehiculo",sequenceName = "SQC_VEHICULO",allocationSize = 1)
	@GeneratedValue(generator = "SqcVehiculo", strategy=GenerationType.TABLE)
    private Integer idvehiculo;
	
	@Column(name = "TIPO_VEHICULO")
    private String tipoVehiculo;
	
	@OneToMany(mappedBy = "idvehiculo")
	private List<Cliente> vcliente;

	public Integer getIdvehiculo() {
		return idvehiculo;
	}

	public void setIdvehiculo(Integer idvehiculo) {
		this.idvehiculo = idvehiculo;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public List<Cliente> getVcliente() {
		return vcliente;
	}

	public void setVcliente(List<Cliente> vcliente) {
		this.vcliente = vcliente;
	}
	
	
}
