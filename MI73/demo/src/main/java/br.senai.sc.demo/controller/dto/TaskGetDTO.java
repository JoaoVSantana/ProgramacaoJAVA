package br.senai.sc.demo.controller.dto;

import java.util.List;

public record TaskGetDTO(
        Long id,
        String titulo,
        List<String> imagens
) {
}
