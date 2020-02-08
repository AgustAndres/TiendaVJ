package com.firstApproach.videjuegos.service;

import com.firstApproach.videjuegos.domain.Videojuego;
import com.firstApproach.videjuegos.repository.VideojuegoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {
    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }
    
    public List<Videojuego> buscarDestacados(){
     return videojuegoRepository.buscarTodos();
    }
    
    public List<Videojuego> buscarPorDistribuidor(int distribuidorId){
     return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }
    
    public List<Videojuego> buscarPorNombre(String nombre){
     return videojuegoRepository.buscarPorNombre(nombre);
    }
    
    public List<Videojuego> buscarPorDistribuidorYNombre(int distribuidorId, String nombre){
     return videojuegoRepository.buscarPorDistribuidorYNombre(distribuidorId, nombre);
    }
}
