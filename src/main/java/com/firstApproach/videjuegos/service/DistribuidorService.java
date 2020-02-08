package com.firstApproach.videjuegos.service;

import com.firstApproach.videjuegos.domain.Distribuidor;
import com.firstApproach.videjuegos.repository.DistribuidorRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DistribuidorService {
    private final DistribuidorRepository distribuidorRepository;

    public DistribuidorService(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }
    
    public List<Distribuidor> buscarDestacados(){
     return distribuidorRepository.buscarTodos();
    }
}
