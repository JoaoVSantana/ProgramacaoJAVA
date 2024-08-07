package com.example.exercicio.service.Escola;

import com.example.exercicio.controller.DTO.EscolaDTO;
import com.example.exercicio.model.Escola;
import com.example.exercicio.repository.EscolaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EscolaServiceImpl implements EscolaServiceInt{

    private EscolaRepository escolaRepository;
    @Override
    public List<Escola> buscarTodasEscolas() {
        return escolaRepository.findAll();
    }
    @Override
    public Escola buscarEscolaPorId(Long id) throws Exception {
        Optional<Escola> optional =  escolaRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Escola não encontrada!");
        }
    }
    @Override
    public Escola salvarEscola(Escola escola, EscolaDTO dto) {
        escola.setNome(dto.nome());
        escola.setEmail(dto.email());
        escola.setEndereco(dto.endereco());
        escola.setListaDeCursos(dto.listaDeCursos());
        escola.setListaDeProfessores(dto.listaDeProfessores());

        return escolaRepository.save(escola);
    }
    @Override
    public Escola cadastrarEscola(EscolaDTO dto) {
        Escola escola  = new Escola();
        return salvarEscola(escola, dto);
    }
    @Override
    public Escola editarEscola(EscolaDTO dto, Long id) throws Exception {
        Escola escola  = buscarEscolaPorId(id);
        return salvarEscola(escola, dto);
    }

    @Override
    public String deletarEscola(Long id) {
        if (escolaRepository.existsById(id)){
            escolaRepository.deleteById(id);
            return "Escola deletada";
        } else {
            return "Escola nao encontrada!";
        }
    }
}
