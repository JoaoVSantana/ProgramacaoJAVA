package com.example.exercicio.controller.DTO;

import com.example.exercicio.model.Endereco;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;

public record AlunoDTO(
        String nome,
        String email,
        String telefone,
        Endereco endereco
) {
}
