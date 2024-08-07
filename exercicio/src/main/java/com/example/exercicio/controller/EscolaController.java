package com.example.exercicio.controller;

import com.example.exercicio.controller.DTO.CursoDTO;
import com.example.exercicio.controller.DTO.EscolaDTO;
import com.example.exercicio.model.Curso;
import com.example.exercicio.model.Escola;
import com.example.exercicio.service.Escola.EscolaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/escola")
public class EscolaController {

    private EscolaServiceImpl escolaService;

    @GetMapping
    public List<Escola> buscarTodasEscolas(){
        return escolaService.buscarTodasEscolas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Escola> buscarEscolaPorId(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(escolaService.buscarEscolaPorId(id), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<Escola> cadastrarEscola(@RequestBody EscolaDTO dto){
        return new ResponseEntity<>(escolaService.cadastrarEscola(dto), HttpStatusCode.valueOf(200));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Escola> editarEscola(@PathVariable Long id, @RequestBody EscolaDTO dto) throws Exception {
        Escola escola = escolaService.editarEscola(dto, id);
        return new ResponseEntity<>(escola, HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarEscola(@PathVariable Long id){
        return new ResponseEntity<>(escolaService.deletarEscola(id), HttpStatusCode.valueOf(200));
    }
}
