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
@Table(name = "unidad_medida")
public class Unidad_Medida implements  Serializable{

    private static final long serialVersionUID = 19L;
	
	@Id
	@SequenceGenerator(name = "SqcUnidad",sequenceName = "SQC_UNIDAD_MEDIDA",allocationSize = 1)
	@GeneratedValue(generator = "SqcUnidad", strategy=GenerationType.TABLE)
    private Integer idunidad;
	
	@Column(name = "unidad")
    private String unidad;
	
	@OneToMany(mappedBy = "codUnidad")
	private List<Producto> producto;

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	public Integer getIdunidad() {
		return idunidad;
	}

	public void setIdunidad(Integer idunidad) {
		this.idunidad = idunidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	
}
