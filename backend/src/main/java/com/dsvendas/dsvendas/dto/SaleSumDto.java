package com.dsvendas.dsvendas.dto;

import java.io.Serializable;

import com.dsvendas.dsvendas.entyties.Saller;

public class SaleSumDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String saleName;
	private Double sum;
	
	public SaleSumDto() {
		
	}

	public SaleSumDto(Saller saller, Double sum) {
		this.saleName = saller.getName();
		this.sum = sum;
	}

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	

}
