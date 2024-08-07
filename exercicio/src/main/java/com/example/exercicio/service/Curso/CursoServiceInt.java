package com.example.exercicio.service.Curso;

import com.example.exercicio.controller.DTO.CursoDTO;
import com.example.exercicio.controller.DTO.DisciplinaDTO;
import com.example.exercicio.model.Curso;
import com.example.exercicio.model.Disciplina;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CursoServiceInt {
    List<Curso> buscarTodosCurso();
    Curso buscarCursoPorId(Long id) throws Exception;
    Curso salvarCurso(Curso curso, CursoDTO dto);
    Curso cadastrarCurso(CursoDTO dto);
    Curso editarCurso(CursoDTO dto, Long id) throws Exception;
    String deletarCurso(Long id);
}
