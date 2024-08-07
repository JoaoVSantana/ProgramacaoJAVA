package com.example.exercicio.service.Turma;

import com.example.exercicio.controller.DTO.TurmaDTO;
import com.example.exercicio.model.Escola;
import com.example.exercicio.model.Turma;
import com.example.exercicio.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TurmaServiceImpl implements TurmaServiceInt{

    private TurmaRepository turmaRepository;
    @Override
    public List<Turma> buscarTodasTurmas() {
        return turmaRepository.findAll();
    }

    @Override
    public Turma buscarTurmaPorId(Long id) throws Exception {
        Optional<Turma> optional =  turmaRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Turma não encontrada!");
        }
    }

    @Override
    public Turma salvarTurma(Turma turma, TurmaDTO dto) {
        turma.setNome(dto.nome());
        turma.setEscola(dto.escola());
        turma.setListaDeAlunos(dto.listaDeAlunos());

        return turmaRepository.save(turma);
    }

    @Override
    public Turma cadastrarTurma(TurmaDTO dto) {
        Turma turma  = new Turma();
        return salvarTurma(turma, dto);
    }

    @Override
    public Turma editarTurma(TurmaDTO dto, Long id) throws Exception {
        Turma turma  = buscarTurmaPorId(id);
        return salvarTurma(turma, dto);
    }

    @Override
    public String deletarTurma(Long id) {
        if (turmaRepository.existsById(id)){
            turmaRepository.deleteById(id);
            return "Turma deletada";
        } else {
            return "Turma nao encontrada!";
        }
    }
}
