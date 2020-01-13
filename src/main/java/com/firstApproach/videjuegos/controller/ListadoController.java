package com.firstApproach.videjuegos.controller;

import com.firstApproach.videjuegos.domain.Consola;
import com.firstApproach.videjuegos.domain.Videojuego;
import com.firstApproach.videjuegos.service.ConsolaService;
import com.firstApproach.videjuegos.service.VideojuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
    
    private final VideojuegoService videoJuegoService;
    private final ConsolaService consolaService;

    public ListadoController(VideojuegoService videoJuegoService, ConsolaService consolaService) {
        this.videoJuegoService = videoJuegoService;
        this.consolaService = consolaService;
    }
    
    
/*
    public ListadoController(ConsolaService consolaService) {
        this.consolaService = consolaService;
    }
    
    public ListadoController(VideojuegoService videoJuegoService) {
        this.videoJuegoService = videoJuegoService;
    }*/
    @RequestMapping("/")
    public String inicio(){
        return "inicio";
    }
    @RequestMapping("/videojuegos")
    public String listarVideojuegos(Model model){
        List<Videojuego> destacados = videoJuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }
    
    @RequestMapping("/consolas")
    public String listarConsolas(Model model){
        List<Consola> destacadosConsolas = consolaService.buscarDestacados();
        model.addAttribute("consolas", destacadosConsolas);
        return "listadoConsolas";
    }
}
