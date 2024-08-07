package com.example.exercicio.controller.DTO;

import com.example.exercicio.model.Curso;
import com.example.exercicio.model.Endereco;
import com.example.exercicio.model.Professor;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

public record EscolaDTO(
        String nome,
        Endereco endereco,
        String email,
        List<Professor> listaDeProfessores,
        List<Curso> listaDeCursos
) {
}
