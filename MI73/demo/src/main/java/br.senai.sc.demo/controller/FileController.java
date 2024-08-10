package br.senai.sc.demo.controller;

import br.senai.sc.demo.service.FileServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/aws")
public class FileController {

    private FileServiceImpl fileService;

    @PostMapping("/{id}")
    public ResponseEntity<Boolean> PostAws(@PathVariable Long id, @RequestBody MultipartFile file){
        return new ResponseEntity<>(fileService.criar(id, file), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> GetAws(@PathVariable Integer id){
        String fileUrl = fileService.buscarFile(id);
        return ResponseEntity.ok(fileUrl);
    }
}