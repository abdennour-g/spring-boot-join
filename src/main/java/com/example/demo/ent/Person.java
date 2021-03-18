package com.example.demo.ent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pers")
	private Long idPers;
	@Column(length = 20)
	private String name;
	@Column(length = 40)
	private String email;
	@Column(name = "id_city")
	private Long idCity;
	@ManyToOne
    @JoinColumn(name="id_city", nullable=false, insertable=false, updatable=false)
	private City city;
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Long idPers, String name, String email, Long idCity) {
		super();
		this.idPers = idPers;
		this.name = name;
		this.email = email;
		this.idCity = idCity;
	}
	
	
	public Person(Long idPers, String name) {
		super();
		this.idPers = idPers;
		this.name = name;
	}
	public Long getIdPers() {
		return idPers;
	}
	public void setIdPers(Long idPers) {
		this.idPers = idPers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getIdCity() {
		return idCity;
	}
	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}
	
	
	
}
