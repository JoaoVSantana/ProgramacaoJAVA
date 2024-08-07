package com.example.exercicio.controller.DTO;

import com.example.exercicio.model.Aluno;
import com.example.exercicio.model.Escola;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

public record TurmaDTO(
        String nome,
        Escola escola,
        List<Aluno>listaDeAlunos
) {
}
