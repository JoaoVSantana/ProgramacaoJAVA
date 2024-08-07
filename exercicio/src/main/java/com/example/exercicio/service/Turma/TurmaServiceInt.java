package com.example.exercicio.service.Turma;

import com.example.exercicio.controller.DTO.EscolaDTO;
import com.example.exercicio.controller.DTO.TurmaDTO;
import com.example.exercicio.model.Escola;
import com.example.exercicio.model.Turma;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TurmaServiceInt {

    List<Turma> buscarTodasTurmas();
    Turma buscarTurmaPorId(Long id) throws Exception;
    Turma salvarTurma(Turma turma, TurmaDTO dto);
    Turma cadastrarTurma(TurmaDTO dto);
    Turma editarTurma(TurmaDTO dto, Long id) throws Exception;
    String deletarTurma(Long id);
}
