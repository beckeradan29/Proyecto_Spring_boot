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
@Table(name = "turno")
public class Turno implements  Serializable{

    private static final long serialVersionUID = 18L;
	
	@Id
	@SequenceGenerator(name = "SqcTurno",sequenceName = "SQC_TURNO",allocationSize = 1)
	@GeneratedValue(generator = "SqcTurno", strategy=GenerationType.TABLE)
    private Integer idturno;
	
	@Column(name = "turno")
    private String turno;

	@OneToMany(mappedBy = "idTurno")
	private List<Empleado> idTurno;
	
	public List<Empleado> getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(List<Empleado> idTurno) {
		this.idTurno = idTurno;
	}

	public Integer getIdturno() {
		return idturno;
	}

	public void setIdturno(Integer idturno) {
		this.idturno = idturno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
}
