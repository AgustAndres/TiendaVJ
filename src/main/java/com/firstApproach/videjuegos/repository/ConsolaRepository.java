package com.firstApproach.videjuegos.repository;

import com.firstApproach.videjuegos.domain.Consola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsolaRepository extends JpaRepository <Consola, Integer>{
    
}
