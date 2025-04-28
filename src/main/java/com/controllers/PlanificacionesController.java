package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PlanificacionesController {
    
    @GetMapping("/controller")
    public String hola() {
        return "Soy el controlador";
    }
    
}
