package com.example.exercicio.controller.DTO;

import jakarta.persistence.Column;

public record EnderecoDTO(
        String rua,
        Integer numero,
        String cidade,
        String estado,
        String bairro,
        Long cep
) {
}
