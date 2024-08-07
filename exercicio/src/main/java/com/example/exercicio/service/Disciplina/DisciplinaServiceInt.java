package com.example.exercicio.service.Disciplina;

import com.example.exercicio.controller.DTO.AlunoDTO;
import com.example.exercicio.controller.DTO.DisciplinaDTO;
import com.example.exercicio.model.Aluno;
import com.example.exercicio.model.Disciplina;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisciplinaServiceInt {
    public List<Disciplina> buscarTodasDisciplinas();
    public Disciplina buscarDisciplinaPorId(Long id) throws Exception;
    public Disciplina salvarDisciplina(Disciplina Disciplina, DisciplinaDTO dto);
    public Disciplina cadastrarDisciplina(DisciplinaDTO dto);
    public Disciplina editarDisciplina(DisciplinaDTO dto, Long id) throws Exception;
    public String deletarDisciplina(Long id);
}
