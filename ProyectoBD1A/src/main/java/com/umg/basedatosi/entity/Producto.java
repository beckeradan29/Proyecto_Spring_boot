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
@Table(name = "producto")
public class Producto implements  Serializable{

    private static final long serialVersionUID = 12L;
	
	@Id
	@SequenceGenerator(name = "SqcProducto",sequenceName = "SQC_PRODUCTO",allocationSize = 1)
	@GeneratedValue(generator = "SqcProducto", strategy=GenerationType.TABLE)
	@Column(name = "cod_producto")
    private Integer codproducto;
	
	@Column(name = "idcategoria")
    private Integer idCategoria;
	
	@Column(name = "IDTIPO")
	private Integer tipo;
	
	@Column(name = "IDUNUDAD")
	private Integer codUnidad;
	
	@Column(name = "cod_sucursal")
	private Integer codSucursal;
	
	@Column(name = "producto")
	private String producto;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "precio")
	private Double precio;
	
	@Column(name = "fecha_ingreso")
	private String  fechaIngreso;
	
	@Column(name = "estado")
	private String  estado;
	

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(Integer codSucursal) {
		this.codSucursal = codSucursal;
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

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@OneToMany(mappedBy = "codProducto")
	private List<Inventario> pinventario;

	public Integer getCodproducto() {
		return codproducto;
	}

	public void setCodproducto(Integer codproducto) {
		this.codproducto = codproducto;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public List<Inventario> getPinventario() {
		return pinventario;
	}

	public void setPinventario(List<Inventario> pinventario) {
		this.pinventario = pinventario;
	}

	public Integer getCodUnidad() {
		return codUnidad;
	}

	public void setCodUnidad(Integer codUnidad) {
		this.codUnidad = codUnidad;
	}

	
}
