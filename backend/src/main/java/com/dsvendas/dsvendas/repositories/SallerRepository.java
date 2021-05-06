package com.dsvendas.dsvendas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsvendas.dsvendas.entyties.Saller;

@Repository
public interface SallerRepository extends JpaRepository<Saller, Long> {
	
	
		
	

}
