package com.example.exercicio.service.Disciplina;

import com.example.exercicio.controller.DTO.DisciplinaDTO;
import com.example.exercicio.model.Aluno;
import com.example.exercicio.model.Disciplina;
import com.example.exercicio.repository.DisciplinaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DisciplinaServiceImpl implements DisciplinaServiceInt{

    private DisciplinaRepository disciplinaRepository;
    @Override
    public List<Disciplina> buscarTodasDisciplinas() {
        return disciplinaRepository.findAll();
    }
    @Override
    public Disciplina buscarDisciplinaPorId(Long id) throws Exception {
        Optional<Disciplina> optional =  disciplinaRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Disciplina não encontrada!");
        }
    }
    @Override
    public Disciplina salvarDisciplina(Disciplina disciplina, DisciplinaDTO dto) {
        disciplina.setNome(dto.nome());
        disciplina.setListaDeProfessores(dto.listaDeProfessores());

        return disciplinaRepository.save(disciplina);
    }

    @Override
    public Disciplina cadastrarDisciplina(DisciplinaDTO dto) {
        Disciplina disciplina  = new Disciplina();
        return salvarDisciplina(disciplina, dto);
    }

    @Override
    public Disciplina editarDisciplina(DisciplinaDTO dto, Long id) throws Exception {
        Disciplina disciplina = buscarDisciplinaPorId(id);
        return salvarDisciplina(disciplina, dto);
    }

    @Override
    public String deletarDisciplina(Long id) {
        if (disciplinaRepository.existsById(id)){
            disciplinaRepository.deleteById(id);
            return "Disciplina deletada";
        } else {
            return "Disciplina nao encontrada!";
        }
    }
}
