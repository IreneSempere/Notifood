package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PlanificacionesController {
    
    @GetMapping("/controller")
    public String hola() {
        return "Soy el controlador";
    }
    
}
