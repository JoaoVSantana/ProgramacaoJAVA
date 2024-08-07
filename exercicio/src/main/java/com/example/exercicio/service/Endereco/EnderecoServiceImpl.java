package com.example.exercicio.service.Endereco;

import com.example.exercicio.controller.DTO.EnderecoDTO;
import com.example.exercicio.model.Endereco;
import com.example.exercicio.repository.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EnderecoServiceImpl implements EnderecoServiceInt {

    private EnderecoRepository enderecoRepository;
    public List<Endereco> buscarTodosEnderecos(){
        return enderecoRepository.findAll();
    }

    public Endereco buscarEnderecoPorId(Long id) throws Exception {
        Optional<Endereco> optional =  enderecoRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Endereço não encontrado!");
        }
    }

    public Endereco cadastrarEndereco(EnderecoDTO dto){
        Endereco endereco = new Endereco();
        return salvarEndereco(endereco, dto);
    }

    @Override
    public Endereco editarEndereco(EnderecoDTO dto, Long id) throws Exception {
        Endereco endereco = buscarEnderecoPorId(id);
        return salvarEndereco(endereco, dto);
    }

    public Endereco salvarEndereco(Endereco endereco, EnderecoDTO dto) {
        endereco.setRua(dto.rua());
        endereco.setNumero(dto.numero());
        endereco.setCidade(dto.cidade());
        endereco.setEstado(dto.estado());
        endereco.setBairro(dto.bairro());
        endereco.setCep(dto.cep());

        return enderecoRepository.save(endereco);
    }

    public String deletarEndereco(Long id){
        if (enderecoRepository.existsById(id)){
            enderecoRepository.deleteById(id);
            return "Endereço deletado";
        } else {
            return "Endereço nao encontrado!";
        }

    }
}
