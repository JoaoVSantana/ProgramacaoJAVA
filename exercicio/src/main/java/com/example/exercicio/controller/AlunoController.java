package com.example.exercicio.controller;

import com.example.exercicio.controller.DTO.AlunoDTO;
import com.example.exercicio.controller.DTO.EnderecoDTO;
import com.example.exercicio.model.Aluno;
import com.example.exercicio.model.Endereco;
import com.example.exercicio.service.Aluno.AlunoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private AlunoServiceImpl alunoService;

    @GetMapping
    public List<Aluno> buscarTodosAlunos(){
        return alunoService.buscarTodosAlunos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarAlunoPorId(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(alunoService.buscarAlunoPorId(id), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody AlunoDTO dto){
        return new ResponseEntity<>(alunoService.cadastrarAluno(dto), HttpStatusCode.valueOf(200));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> editarAluno(@PathVariable Long id, @RequestBody AlunoDTO dto) throws Exception {
        Aluno aluno = alunoService.editarAluno(dto, id);
        return new ResponseEntity<>(aluno, HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarAluno(@PathVariable Long id){
        return new ResponseEntity<>(alunoService.deletarAluno(id), HttpStatusCode.valueOf(200));
    }


}
