package com.example.exercicio.controller;

import com.example.exercicio.controller.DTO.AlunoDTO;
import com.example.exercicio.controller.DTO.DisciplinaDTO;
import com.example.exercicio.model.Aluno;
import com.example.exercicio.model.Disciplina;
import com.example.exercicio.service.Disciplina.DisciplinaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/disciplina")
public class DisciplinaController {

    private DisciplinaServiceImpl disciplinaService;

    @GetMapping
    public List<Disciplina> buscarTodasDisciplinas(){
        return disciplinaService.buscarTodasDisciplinas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> buscarDisciplinaPorId(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(disciplinaService.buscarDisciplinaPorId(id), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<Disciplina> cadastrarDisciplina(@RequestBody DisciplinaDTO dto){
        return new ResponseEntity<>(disciplinaService.cadastrarDisciplina(dto), HttpStatusCode.valueOf(200));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Disciplina> editarDisciplina(@PathVariable Long id, @RequestBody DisciplinaDTO dto) throws Exception {
        Disciplina disciplina = disciplinaService.editarDisciplina(dto, id);
        return new ResponseEntity<>(disciplina, HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarDisciplina(@PathVariable Long id){
        return new ResponseEntity<>(disciplinaService.deletarDisciplina(id), HttpStatusCode.valueOf(200));
    }
}
