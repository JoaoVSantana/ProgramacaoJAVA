package br.senai.sc.demo.controller;

import br.senai.sc.demo.service.FileServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
@RequestMapping("/aws")
public class FileController {

    private FileServiceImpl fileService;

    @PostMapping("/{id}")
    public boolean PostAws(@PathVariable Long id, @RequestBody MultipartFile file){
        return fileService.criar(id, file);
    }
}