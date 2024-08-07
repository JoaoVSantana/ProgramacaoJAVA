package com.example.exercicio.service.Professor;

import com.example.exercicio.controller.DTO.ProfessorDTO;
import com.example.exercicio.controller.DTO.TurmaDTO;
import com.example.exercicio.model.Professor;
import com.example.exercicio.model.Turma;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessorServiceInt {

    List<Professor> buscarTodosProfessores();
    Professor buscarProfessorPorId(Long id) throws Exception;
    Professor salvarProfessor(Professor professor, ProfessorDTO dto);
    Professor cadastrarProfessor(ProfessorDTO dto);
    Professor editarProfessor(ProfessorDTO dto, Long id) throws Exception;
    String deletarProfessor(Long id);
}
