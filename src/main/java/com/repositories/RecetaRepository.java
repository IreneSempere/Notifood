package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Receta;

public interface RecetaRepository extends JpaRepository<Receta, Integer> {
}