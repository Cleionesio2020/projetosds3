package com.dsvendas.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dsvendas.dsvendas.dto.SaleSucessDto;
import com.dsvendas.dsvendas.dto.SaleSumDto;
import com.dsvendas.dsvendas.entyties.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT  new com.dsvendas.dsvendas.dto.SaleSumDto(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDto>  amountGroupbySaller();
	
	@Query("SELECT  new com.dsvendas.dsvendas.dto.SaleSucessDto(obj.seller, SUM(obj.visited), SUM(obj.deals) ) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSucessDto>  successGroupbySaller();

}
