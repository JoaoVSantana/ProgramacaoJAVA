package com.example.exercicio.controller.DTO;

import com.example.exercicio.model.Disciplina;
import jakarta.persistence.OneToMany;

import java.util.List;

public record CursoDTO(
        String nome,
        List<Disciplina>listaDeDisciplinas
) {
}
