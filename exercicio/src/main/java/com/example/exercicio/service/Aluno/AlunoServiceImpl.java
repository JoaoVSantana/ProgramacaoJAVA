package com.example.exercicio.service.Aluno;

import com.example.exercicio.controller.DTO.AlunoDTO;
import com.example.exercicio.model.Aluno;
import com.example.exercicio.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AlunoServiceImpl implements AlunoServiceInt {

    private AlunoRepository alunoRepository;
    public List<Aluno> buscarTodosAlunos(){
        return alunoRepository.findAll();
    }
    public Aluno buscarAlunoPorId(Long id) throws Exception {
        Optional<Aluno> optional =  alunoRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Aluno não encontrado!");
        }
    }
    public Aluno cadastrarAluno(AlunoDTO dto){
        Aluno aluno = new Aluno();
        return salvarAluno(aluno, dto);
    }
    @Override
    public Aluno editarAluno(AlunoDTO dto, Long id) throws Exception {
        Aluno aluno = buscarAlunoPorId(id);
        return salvarAluno(aluno, dto);
    }
    public Aluno salvarAluno(Aluno aluno, AlunoDTO dto) {
        aluno.setNome(dto.nome());
        aluno.setEmail(dto.email());
        aluno.setTelefone(dto.telefone());
        aluno.setEndereco(dto.endereco());

        return alunoRepository.save(aluno);
    }
    public String deletarAluno(Long id){
        if (alunoRepository.existsById(id)){
            alunoRepository.deleteById(id);
            return "Aluno deletado";
        } else {
            return "Aluno nao encontrado!";
        }

    }
}
