package com.example.exercicio.controller.DTO;

import com.example.exercicio.model.Disciplina;
import com.example.exercicio.model.Endereco;
import com.example.exercicio.model.Escola;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.util.List;

public record ProfessorDTO(
        String nome,
        String email,
        String telefone,
        Escola escola,
        List<Disciplina> listaDeDisciplinas,
        Endereco endereco
) {
}
