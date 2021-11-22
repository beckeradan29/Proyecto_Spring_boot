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
@Table(name = "cliente")
public class Cliente implements  Serializable{

    private static final long serialVersionUID = 4L;
	
	@Id
	@SequenceGenerator(name = "SqcCliente",sequenceName = "SQC_CLIENTE",allocationSize = 1)
	@GeneratedValue(generator = "SqcCliente", strategy=GenerationType.TABLE)
	@Column(name = "cod_cliente")
    private Integer codcliente;
	
	@Column(name = "IDVEHICULO")
	private Integer idvehiculo;
	
	@Column(name = "NIT")
	private String nit;
	
	@Column(name = "CUI")
	private String cui;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;
	
	@Column(name = "CORREO")
	private String correo;
	
	@Column(name = "GENERO")
	private String genero;
	
	@OneToMany(mappedBy = "codCliente")
	private List<Direccion_Cliente> dcliente;
	
	@OneToMany(mappedBy = "codCliente")
	private List<Telefono_Cliente> tcliente;
	
	@OneToMany(mappedBy = "codCliente")
	private List<Factura> fcliente;
	
	public List<Telefono_Cliente> getTcliente() {
		return tcliente;
	}

	public void setTcliente(List<Telefono_Cliente> tcliente) {
		this.tcliente = tcliente;
	}

	public List<Direccion_Cliente> getDcliente() {
		return dcliente;
	}

	public void setDcliente(List<Direccion_Cliente> dcliente) {
		this.dcliente = dcliente;
	}
	
	public Integer getCodcliente() {
		return codcliente;
	}

	public void setCodcliente(Integer codcliente) {
		this.codcliente = codcliente;
	}

	public Integer getIdvehiculo() {
		return idvehiculo;
	}

	public void setIdvehiculo(Integer idvehiculo) {
		this.idvehiculo = idvehiculo;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
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

	public List<Factura> getFcliente() {
		return fcliente;
	}

	public void setFcliente(List<Factura> fcliente) {
		this.fcliente = fcliente;
	}
	
	
}
