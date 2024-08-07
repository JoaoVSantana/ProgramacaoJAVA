package com.example.exercicio.service.Professor;

import com.example.exercicio.controller.DTO.ProfessorDTO;
import com.example.exercicio.model.Professor;
import com.example.exercicio.model.Turma;
import com.example.exercicio.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProfessorServiceImpl implements ProfessorServiceInt{

    private ProfessorRepository professorRepository;
    @Override
    public List<Professor> buscarTodosProfessores() {
        return professorRepository.findAll();
    }

    @Override
    public Professor buscarProfessorPorId(Long id) throws Exception {
        Optional<Professor> optional =  professorRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Professor não encontrado!");
        }
    }

    @Override
    public Professor salvarProfessor(Professor professor, ProfessorDTO dto) {
        professor.setNome(dto.nome());
        professor.setEmail(dto.email());
        professor.setTelefone(dto.telefone());
        professor.setEscola(dto.escola());
        professor.setEndereco(dto.endereco());

        return professorRepository.save(professor);
    }

    @Override
    public Professor cadastrarProfessor(ProfessorDTO dto) {
        Professor professor  = new Professor();
        return salvarProfessor(professor, dto);
    }

    @Override
    public Professor editarProfessor(ProfessorDTO dto, Long id) throws Exception {
        Professor professor  = buscarProfessorPorId(id);
        return salvarProfessor(professor, dto);
    }

    @Override
    public String deletarProfessor(Long id) {
        if (professorRepository.existsById(id)){
            professorRepository.deleteById(id);
            return "Professor deletado";
        } else {
            return "Professor nao encontrado!";
        }
    }
}
