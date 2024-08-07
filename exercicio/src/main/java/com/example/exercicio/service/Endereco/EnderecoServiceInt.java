package com.example.exercicio.service.Endereco;

import com.example.exercicio.controller.DTO.EnderecoDTO;
import com.example.exercicio.model.Aluno;
import com.example.exercicio.model.Endereco;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EnderecoServiceInt {

    public List<Endereco> buscarTodosEnderecos();

    public Endereco buscarEnderecoPorId(Long id) throws Exception;
    public Endereco salvarEndereco(Endereco endereco, EnderecoDTO dto);
    public Endereco cadastrarEndereco(EnderecoDTO dto);
    public Endereco editarEndereco(EnderecoDTO dto, Long id) throws Exception;
    public String deletarEndereco(Long id);
}
