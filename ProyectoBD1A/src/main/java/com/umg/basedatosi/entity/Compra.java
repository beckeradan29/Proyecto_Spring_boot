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
@Table(name = "COMPRA")
public class Compra implements Serializable{

	private static final long serialVersionUID = 1;

	@Id
	@SequenceGenerator(name = "SqcCompra",sequenceName = "SQC_COMPRA",allocationSize = 1)
	@GeneratedValue(generator = "SqcCompra", strategy=GenerationType.TABLE)
	@Column(name = "IDCOMPRA")
	private Integer idcompra;
	
	@Column(name = "PROEVEDOR")
	private String proevedor;
	
	@Column(name = "PRODUCTO")
	private String producto;
	
	@Column(name = "CANTIDAD")
	private Integer cantidad;
	
	@Column(name = "PRECIO")
	private Double precio;
	
	@Column(name = "TOTAL")
	private Double total;

	public Integer getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}

	public String getProevedor() {
		return proevedor;
	}

	public void setProevedor(String proevedor) {
		this.proevedor = proevedor;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
}
