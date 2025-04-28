package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // Este controlador maneja la ruta raíz de la aplicación
    @GetMapping("/")
    public String index() {
        return "index"; // Devuelve el nombre de la vista a renderizar (index.html)
    }
}
