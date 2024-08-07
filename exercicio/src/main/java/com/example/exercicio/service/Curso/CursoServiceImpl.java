package com.example.exercicio.service.Curso;

import com.example.exercicio.controller.DTO.CursoDTO;
import com.example.exercicio.model.Curso;
import com.example.exercicio.model.Disciplina;
import com.example.exercicio.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CursoServiceImpl implements CursoServiceInt{

    private CursoRepository cursoRepository;
    @Override
    public List<Curso> buscarTodosCurso() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso buscarCursoPorId(Long id) throws Exception {
        Optional<Curso> optional =  cursoRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Curso não encontrado!");
        }
    }

    @Override
    public Curso salvarCurso(Curso curso, CursoDTO dto) {
        curso.setNome(dto.nome());
        curso.setListaDeDisciplinas(dto.listaDeDisciplinas());

        return cursoRepository.save(curso);
    }

    @Override
    public Curso cadastrarCurso(CursoDTO dto) {
        Curso curso  = new Curso();
        return salvarCurso(curso, dto);
    }

    @Override
    public Curso editarCurso(CursoDTO dto, Long id) throws Exception {
        Curso curso  = buscarCursoPorId(id);
        return salvarCurso(curso, dto);
    }

    @Override
    public String deletarCurso(Long id) {
        if (cursoRepository.existsById(id)){
            cursoRepository.deleteById(id);
            return "Disciplina deletada";
        } else {
            return "Disciplina nao encontrada!";
        }
    }
}
