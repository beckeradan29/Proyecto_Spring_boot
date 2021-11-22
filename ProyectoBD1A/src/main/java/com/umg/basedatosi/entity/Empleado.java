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
@Table(name = "empleado")
public class Empleado implements Serializable{

    private static final long serialVersionUID = 8L;
	
	@Id
	@SequenceGenerator(name = "SqcEmpleado",sequenceName = "SQC_EMPLEADO",allocationSize = 1)
	@GeneratedValue(generator = "SqcEmpleado", strategy=GenerationType.TABLE)
	@Column(name = "cod_empleado")
    private Integer codempleado;
	
	@Column(name = "IDTURNO")
	private Integer idTurno;
	
	@Column(name = "COD_SUCURSAL")
	private Integer codSucursal;
	
	@Column(name = "IDPUESTO")
	private Integer idPuesto;
	
	@Column(name = "CUI")
	private String cui;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;
	
	@Column(name = "CORREO")
	private String correo;
	
	@Column(name = "Genero")
	private String genero;

	@Column(name = "FECHA_INGRESO")
	private String fechaIngreso;

	@OneToMany(mappedBy = "codEmpleado")
	public List<Direccion_Empleado> edireccion;
	
	@OneToMany(mappedBy = "codEmpleado")
	public List<Telefono_Empleado> etelefono;
	
	@OneToMany(mappedBy = "codEmpleado")
	public List<Factura> fempleado;
	
	public List<Factura> getFempleado() {
		return fempleado;
	}

	public void setFempleado(List<Factura> fempleado) {
		this.fempleado = fempleado;
	}

	public List<Direccion_Empleado> getEdireccion() {
		return edireccion;
	}

	public void setEdireccion(List<Direccion_Empleado> edireccion) {
		this.edireccion = edireccion;
	}

	public List<Telefono_Empleado> getEtelefono() {
		return etelefono;
	}

	public void setEtelefono(List<Telefono_Empleado> etelefono) {
		this.etelefono = etelefono;
	}

	public Integer getCodempleado() {
		return codempleado;
	}

	public void setCodempleado(Integer codempleado) {
		this.codempleado = codempleado;
	}

	public Integer getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}

	public Integer getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(Integer codSucursal) {
		this.codSucursal = codSucursal;
	}

	public Integer getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(Integer idPuesto) {
		this.idPuesto = idPuesto;
	}

	public String getCui() {
		return cui;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
}
