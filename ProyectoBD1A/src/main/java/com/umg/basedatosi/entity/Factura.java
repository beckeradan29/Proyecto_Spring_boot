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
@Table(name = "factura")
public class Factura implements  Serializable{

    private static final long serialVersionUID = 9L;
	
	@Id
	@SequenceGenerator(name = "SqcFactura",sequenceName = "SQC_FACTURA",allocationSize = 1)
	@GeneratedValue(generator = "SqcFactura", strategy=GenerationType.TABLE)
	@Column(name = "cod_factura")
    private Integer codfactura;
	
	@Column(name = "COD_CLIENTE")
	private Integer codCliente;
	
	@Column(name = "COD_EMPLEADO")
	private Integer codEmpleado;
	
	@Column(name = "NOMBRE")
    private String nombre;

	@Column(name = "NIT")
    private String nit;
	
	@Column(name = "TELEFONO")
    private String telefono;
	
	@Column(name = "PRODUCTO")
	private String producto;
	
	@Column(name = "CANTIDAD")
	private Integer cantidad;
	
	@Column(name = "COSTO")
	private Double costo;
	
	@Column(name = "TIPO_PAGO")
	private String tipoPago;
	
	@Column(name = "FECHA_EMISION")
	private String fechaEmision;

	public Integer getCodfactura() {
		return codfactura;
	}

	public void setCodfactura(Integer codfactura) {
		this.codfactura = codfactura;
	}

	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

	public Integer getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(Integer codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}


	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	
}
