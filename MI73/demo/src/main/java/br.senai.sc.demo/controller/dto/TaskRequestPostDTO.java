package br.senai.sc.demo.controller.dto;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskRequestPostDTO {

    private String titulo;
}
