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
@Table(name = "CATEGORIA_PRODUCTO")
public class Categoria_Producto implements  Serializable{

    private static final long serialVersionUID = 3L;
	
	@Id
	@SequenceGenerator(name = "SqcCat",sequenceName = "SQC_CATEGORIA_PRODUCTO",allocationSize = 1)
	@GeneratedValue(generator = "SqcCat", strategy=GenerationType.TABLE)
    private Integer idcategoria;
	
	@Column(name = "CATEGORIA_PROD")
    private String categoria;

	public Integer getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
