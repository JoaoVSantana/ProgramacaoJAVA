package com.example.exercicio.controller;

import com.example.exercicio.controller.DTO.ProfessorDTO;
import com.example.exercicio.controller.DTO.TurmaDTO;
import com.example.exercicio.model.Professor;
import com.example.exercicio.model.Turma;
import com.example.exercicio.service.Professor.ProfessorServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {

    private ProfessorServiceImpl professorService;

    @GetMapping
    public List<Professor> buscarTodosProfessores(){
        return professorService.buscarTodosProfessores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> buscarProfessorPorId(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(professorService.buscarProfessorPorId(id), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<Professor> cadastrarProfessor(@RequestBody ProfessorDTO dto){
        return new ResponseEntity<>(professorService.cadastrarProfessor(dto), HttpStatusCode.valueOf(200));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Professor> editarProfessor(@PathVariable Long id, @RequestBody ProfessorDTO dto) throws Exception {
        Professor professor = professorService.editarProfessor(dto, id);
        return new ResponseEntity<>(professor, HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarTurma(@PathVariable Long id){
        return new ResponseEntity<>(professorService.deletarProfessor(id), HttpStatusCode.valueOf(200));
    }
}
