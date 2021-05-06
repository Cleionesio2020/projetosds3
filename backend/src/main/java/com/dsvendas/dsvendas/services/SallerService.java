package com.dsvendas.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dsvendas.dsvendas.dto.SallerDto;
import com.dsvendas.dsvendas.entyties.Saller;
import com.dsvendas.dsvendas.repositories.SallerRepository;

@Service
public class SallerService {
	
	@Autowired
	SallerRepository repository;
	
	
	public List <SallerDto> findAll(){
		List<Saller> result =  repository.findAll();
		return result.stream().map(x -> new SallerDto(x)).collect(Collectors.toList());
	}
	
	

}
