package com.firstApproach.videjuegos.repository;

import com.firstApproach.videjuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
}
