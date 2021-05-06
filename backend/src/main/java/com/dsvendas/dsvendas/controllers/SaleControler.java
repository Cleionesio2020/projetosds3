package com.dsvendas.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsvendas.dsvendas.dto.SaleDto;
import com.dsvendas.dsvendas.dto.SaleSucessDto;
import com.dsvendas.dsvendas.dto.SaleSumDto;
import com.dsvendas.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleControler {
	@Autowired
	SaleService service;
	
	@GetMapping()
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
		return ResponseEntity.ok( service.findAll(pageable));
	}
	
	@GetMapping("/amount-by-sales")
	public ResponseEntity<List<SaleSumDto>> findAllSaleSumDto(){
		return ResponseEntity.ok(service.amountGroupbySale());
	}
	
	@GetMapping("/success-by-sales")
	public ResponseEntity<List<SaleSucessDto>> findAllSaleSuccessDto(){
		return ResponseEntity.ok(service.successGroupbySale());
	}

}
