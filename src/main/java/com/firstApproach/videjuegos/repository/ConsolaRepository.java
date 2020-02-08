package com.firstApproach.videjuegos.repository;

import com.firstApproach.videjuegos.domain.Consola;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConsolaRepository extends JpaRepository <Consola, Integer>{

   @Query("select v from Consola v order by v.nombre")
   List<Consola>buscarTodos(); 
}
