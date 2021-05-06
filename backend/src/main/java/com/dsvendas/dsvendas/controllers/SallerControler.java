package com.dsvendas.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsvendas.dsvendas.dto.SallerDto;
import com.dsvendas.dsvendas.services.SallerService;

@RestController
@RequestMapping(value = "/sallers")
public class SallerControler {
	@Autowired
	SallerService service;
	
	@GetMapping()
	public ResponseEntity<List<SallerDto>> findAll(){
		return ResponseEntity.ok( service.findAll());
	}

}
