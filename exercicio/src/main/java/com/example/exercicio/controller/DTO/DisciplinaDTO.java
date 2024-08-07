package com.example.exercicio.controller.DTO;

import com.example.exercicio.model.Professor;
import jakarta.persistence.ManyToMany;

import java.util.List;

public record DisciplinaDTO(
        String nome,
        List<Professor> listaDeProfessores
) {
}
