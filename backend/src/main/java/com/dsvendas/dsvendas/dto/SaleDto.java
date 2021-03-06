package com.dsvendas.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.dsvendas.dsvendas.entyties.Sale;


public class SaleDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SallerDto seller;
	
	public SaleDto() {
		
	}

	public SaleDto(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SallerDto seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDto(Sale sale) {
		this.id = sale.getId();
		this.visited = sale.getVisited();
		this.deals = sale.getDeals();
		this.amount = sale.getAmount();
		this.date = sale.getDate();
		this.seller = new SallerDto(sale.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SallerDto getSeller() {
		return seller;
	}

	public void setSeller(SallerDto seller) {
		this.seller = seller;
	}
	
	
	

}
