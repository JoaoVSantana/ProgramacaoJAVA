package com.example.exercicio.controller;

import com.example.exercicio.controller.DTO.EscolaDTO;
import com.example.exercicio.controller.DTO.TurmaDTO;
import com.example.exercicio.model.Escola;
import com.example.exercicio.model.Turma;
import com.example.exercicio.service.Escola.EscolaServiceImpl;
import com.example.exercicio.service.Turma.TurmaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/turma")
public class TurmaController {

    private TurmaServiceImpl turmaService;

    @GetMapping
    public List<Turma> buscarTodasTurmas(){
        return turmaService.buscarTodasTurmas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> buscarTurmaPorId(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(turmaService.buscarTurmaPorId(id), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<Turma> cadastrarTurma(@RequestBody TurmaDTO dto){
        return new ResponseEntity<>(turmaService.cadastrarTurma(dto), HttpStatusCode.valueOf(200));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Turma> editarTurma(@PathVariable Long id, @RequestBody TurmaDTO dto) throws Exception {
        Turma turma = turmaService.editarTurma(dto, id);
        return new ResponseEntity<>(turma, HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarTurma(@PathVariable Long id){
        return new ResponseEntity<>(turmaService.deletarTurma(id), HttpStatusCode.valueOf(200));
    }
}
