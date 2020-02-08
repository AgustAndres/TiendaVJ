package com.firstApproach.videjuegos.service;

import com.firstApproach.videjuegos.domain.Consola;
import com.firstApproach.videjuegos.repository.ConsolaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ConsolaService {
    private final ConsolaRepository consolaRepository;

    public ConsolaService(ConsolaRepository consolaRepository) {
        this.consolaRepository = consolaRepository;
    }
    
    public List<Consola> buscarDestacados(){
     return consolaRepository.buscarTodos();
    }
}
