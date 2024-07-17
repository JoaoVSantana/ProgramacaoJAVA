package br.senai.sc.demo.controller.dto;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


public record TaskRequestPostDTO(
        String titulo){
}
