package br.senai.sc.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class FileController {

    @PostMapping("/{id}")
    public void PostAws(@PathVariable Integer id){

    }


}
