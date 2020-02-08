package com.firstApproach.videjuegos.repository;

import com.firstApproach.videjuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
   @Query("select v from Videojuego v order by v.nombre")
   List<Videojuego>buscarTodos(); 
   
   @Query("select v from Videojuego v where v.distribuidor.id = ?1 order by v.nombre")
   List<Videojuego>buscarPorDistribuidor(int distribuidorId);
   
   @Query("select v from Videojuego v where v.nombre like %?1% order by v.nombre")
   List<Videojuego>buscarPorNombre(String nombre);
   
   @Query("select v from Videojuego v where v.distribuidor.id = ?1 and v.nombre like %?1% order by v.nombre")
   List<Videojuego>buscarPorDistribuidorYNombre(int distribuidorId, String nombre);
}
