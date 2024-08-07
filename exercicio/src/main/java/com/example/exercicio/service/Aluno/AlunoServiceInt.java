package com.example.exercicio.service.Aluno;

import com.example.exercicio.controller.DTO.AlunoDTO;
import com.example.exercicio.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlunoServiceInt {

    public List<Aluno> buscarTodosAlunos();
    public Aluno buscarAlunoPorId(Long id) throws Exception;
    public Aluno salvarAluno(Aluno aluno, AlunoDTO dto);
    public Aluno cadastrarAluno(AlunoDTO dto);
    public Aluno editarAluno(AlunoDTO dto, Long id) throws Exception;
    public String deletarAluno(Long id);
}
