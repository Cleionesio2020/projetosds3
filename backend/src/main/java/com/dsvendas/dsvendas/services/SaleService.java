package com.dsvendas.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsvendas.dsvendas.dto.SaleDto;
import com.dsvendas.dsvendas.dto.SaleSucessDto;
import com.dsvendas.dsvendas.dto.SaleSumDto;
import com.dsvendas.dsvendas.entyties.Sale;
import com.dsvendas.dsvendas.repositories.SaleRepository;
import com.dsvendas.dsvendas.repositories.SallerRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository repository;
	
	@Autowired
	SallerRepository sallerRep;

	@Transactional(readOnly = true)
	public Page<SaleDto> findAll(Pageable pageable) {
		sallerRep.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDto(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDto> amountGroupbySale() {
		return repository.amountGroupbySaller();

	}
	
	@Transactional(readOnly = true)
	public List<SaleSucessDto> successGroupbySale() {
		return repository.successGroupbySaller();

	}

}
