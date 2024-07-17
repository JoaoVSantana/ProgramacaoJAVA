package br.senai.sc.demo.controller.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public record FileRequestPostDTO(
        Long taskId,
        MultipartFile file
) {


}
