package com.dsvendas.dsvendas.dto;

import java.io.Serializable;

import com.dsvendas.dsvendas.entyties.Saller;

public class SaleSucessDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String saleName;
	private Long visited;
	private Long deals;
	
	public SaleSucessDto() {
		
	}

	public SaleSucessDto(Saller saller, Long visited, Long deals) {
		this.saleName = saller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	
	

}
