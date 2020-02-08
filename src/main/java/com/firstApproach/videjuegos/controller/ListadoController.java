package com.firstApproach.videjuegos.controller;

import com.firstApproach.videjuegos.domain.Consola;
import com.firstApproach.videjuegos.domain.Distribuidor;
import com.firstApproach.videjuegos.domain.Videojuego;
import com.firstApproach.videjuegos.service.ConsolaService;
import com.firstApproach.videjuegos.service.VideojuegoService;
import com.firstApproach.videjuegos.service.DistribuidorService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListadoController {

    private final VideojuegoService videoJuegoService;
    private final ConsolaService consolaService;
    private final DistribuidorService distribuidorService;

    public ListadoController(VideojuegoService videoJuegoService, ConsolaService consolaService, DistribuidorService distribuidorService) {
        this.videoJuegoService = videoJuegoService;
        this.consolaService = consolaService;
        this.distribuidorService = distribuidorService;
    }

    @RequestMapping("/")
    public String inicio() {
        return "inicio";
    }

    @RequestMapping("/videojuegos")
    public String listarVideojuegos(Model model, @RequestParam(defaultValue="") String nombre) {
        List<Videojuego> destacados = videoJuegoService.buscarPorNombre(nombre);
        model.addAttribute("videojuegos", destacados);
        
        List<Distribuidor> distribuidor = distribuidorService.buscarDestacados();
        model.addAttribute("distribuid", distribuidor);
        return "listado";
    }

    @RequestMapping("/buscar")
    public String buscarPorNombre(Model model,@RequestParam("q") String nombre){
        List<Videojuego> juegosD = videoJuegoService.buscarPorNombre(nombre);
        model.addAttribute("videojuegos", juegosD);
        
        List<Distribuidor> distribuidor = distribuidorService.buscarDestacados();
        model.addAttribute("distribuid", distribuidor);
        
        return "listado";
    }
    
    @RequestMapping("/videojuegosPorDistribuidor")
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model) {
        List<Videojuego> juegosD = videoJuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegosD);
        
        List<Distribuidor> distribuidor = distribuidorService.buscarDestacados();
        model.addAttribute("distribuid", distribuidor);
        return "listado";
    }
    
    @RequestMapping("/videojuegosPorDistribuidorYnombre")
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model, String nombre) {
        List<Videojuego> juegosD = videoJuegoService.buscarPorDistribuidorYNombre(distribuidorId, nombre);
        model.addAttribute("videojuegos", juegosD);
        
        List<Distribuidor> distribuidor = distribuidorService.buscarDestacados();
        model.addAttribute("distribuid", distribuidor);
        return "listado";
    }
    /*
    @RequestMapping("/videojuegosPorNombre")
    public String listarVideojuegosPorDistribuidor(String nombre, Model model) {
        List<Videojuego> juegosD = videoJuegoService.buscarPorNombre(nombre);
        model.addAttribute("videojuegos", juegosD);
        
        List<Distribuidor> distribuidor = distribuidorService.buscarDestacados();
        model.addAttribute("distribuid", distribuidor);
        return "listado";
    }*/
    
    @RequestMapping("/consolas")
    public String listarConsolas(Model model) {
        List<Consola> destacadosConsolas = consolaService.buscarDestacados();
        model.addAttribute("consolas", destacadosConsolas);
        return "listadoConsolas";
    }
}
