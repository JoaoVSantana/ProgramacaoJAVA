package br.senai.sc.demo.controller.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class FileRequestPostDTO {

    private Integer taskId;
    private List<MultipartFile> files;
}
