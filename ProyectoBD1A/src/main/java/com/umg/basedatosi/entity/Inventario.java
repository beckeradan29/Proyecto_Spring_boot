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
@Table(name = "inventario")
public class Inventario implements  Serializable{

    private static final long serialVersionUID = 10L;
	
	@Id
	@SequenceGenerator(name = "SqcInventario",sequenceName = "SQC_INVENTARIO",allocationSize = 1)
	@GeneratedValue(generator = "SqcInventario", strategy=GenerationType.TABLE)
	@Column(name = "cod_inventario")
    private Integer codinventario;
	
	@Column(name = "cod_producto")
	private Producto codProducto;

	public Integer getCodinventario() {
		return codinventario;
	}

	public void setCodinventario(Integer codinventario) {
		this.codinventario = codinventario;
	}

	public Producto getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(Producto codProducto) {
		this.codProducto = codProducto;
	}

	
	
}
