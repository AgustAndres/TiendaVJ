package com.firstApproach.videjuegos.repository;

import com.firstApproach.videjuegos.domain.Distribuidor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DistribuidorRepository extends JpaRepository<Distribuidor, Integer>{
   @Query("select v from Distribuidor v order by v.nombre")
   List<Distribuidor>buscarTodos(); 
}
