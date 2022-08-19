package com.idat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name="pizerria")
@Table
@Data
@NoArgsConstructor
public class Pizerria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizerria;
	private String direccion;
	private String sede;
	

	@ManyToMany(mappedBy = "pizerria", cascade = {CascadeType.PERSIST,CascadeType.MERGE}) 
	private List<Pizza> pizza = new ArrayList<Pizza>();
	
	
	public Pizerria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getIdPizerria() {
		return idPizerria;
	}
	public void setIdPizerria(Integer idPizerria) {
		this.idPizerria = idPizerria;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	
}
