package com.dsvendas.dsvendas.entyties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_sellers")
public class Saller implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany( mappedBy = "seller" )
	private List<Sale>sales = new ArrayList<>();
	
	public Saller() {
	}

	public Saller(Long id, String nome) {
		this.id = id;
		this.name = nome;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String nome) {
		this.name = nome;
	}

	public List<Sale> getSales() {
		return sales;
	}

	
	
}
