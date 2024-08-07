package com.example.exercicio.controller;

import com.example.exercicio.controller.DTO.CursoDTO;
import com.example.exercicio.controller.DTO.DisciplinaDTO;
import com.example.exercicio.model.Curso;
import com.example.exercicio.model.Disciplina;
import com.example.exercicio.service.Curso.CursoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/curso")
public class CursoController {

    private CursoServiceImpl cursoService;

    @GetMapping
    public List<Curso> buscarTodosCursos(){
        return cursoService.buscarTodosCurso();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> buscarCursoPorId(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(cursoService.buscarCursoPorId(id), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<Curso> cadastrarCurso(@RequestBody CursoDTO dto){
        return new ResponseEntity<>(cursoService.cadastrarCurso(dto), HttpStatusCode.valueOf(200));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> editarCurso(@PathVariable Long id, @RequestBody CursoDTO dto) throws Exception {
        Curso curso = cursoService.editarCurso(dto, id);
        return new ResponseEntity<>(curso, HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarCurso(@PathVariable Long id){
        return new ResponseEntity<>(cursoService.deletarCurso(id), HttpStatusCode.valueOf(200));
    }
}
