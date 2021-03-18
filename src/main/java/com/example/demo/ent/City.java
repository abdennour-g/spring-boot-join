package com.example.demo.ent;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_city")
	private Long idCity;
	@Column(length = 20)
	private String design;
/*	@OneToMany(mappedBy="city",fetch = FetchType.LAZY)
	List<Person> pers;
	
	public List<Person> getPers() {
		return pers;
	}
	public void setPers(List<Person> pers) {
		this.pers = pers;
	}*/
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(Long idCity, String design) {
		super();
		this.idCity = idCity;
		this.design = design;
	}
	public Long getIdCity() {
		return idCity;
	}
	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	@Override
	public String toString() {
		return "City [idCity=" + idCity + ", design=" + design + "]";
	}
}
