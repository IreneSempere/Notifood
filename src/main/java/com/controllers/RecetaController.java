package com.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.entities.Receta;
import com.repositories.RecetaRepository;

@Controller
public class RecetaController {

    private final RecetaRepository recetaRepository;

    public RecetaController(RecetaRepository recetaRepository) {
        this.recetaRepository = recetaRepository;
    }

    @GetMapping("/recetas")
    public String listarRecetas(Model model) {
        // Obtiene todas las recetas de la base de datos
        List<Receta> recetas = recetaRepository.findAll();
        // Agrega las recetas al modelo para pasarlas a la vista
        model.addAttribute("recetas", recetas);
        return "recetas"; // Renderiza el archivo recetas.html
    }
}