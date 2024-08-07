package com.example.exercicio.service.Escola;

import com.example.exercicio.controller.DTO.CursoDTO;
import com.example.exercicio.controller.DTO.EscolaDTO;
import com.example.exercicio.model.Curso;
import com.example.exercicio.model.Escola;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EscolaServiceInt {
    List<Escola> buscarTodasEscolas();
    Escola buscarEscolaPorId(Long id) throws Exception;
    Escola salvarEscola(Escola escola, EscolaDTO dto);
    Escola cadastrarEscola(EscolaDTO dto);
    Escola editarEscola(EscolaDTO dto, Long id) throws Exception;
    String deletarEscola(Long id);

}
