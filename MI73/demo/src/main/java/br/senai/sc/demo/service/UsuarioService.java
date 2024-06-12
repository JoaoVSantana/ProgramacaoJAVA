package br.senai.sc.demo.service;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

//Serve para acionar a lógica das validações e regras de negocio do sistema
@Service
//Faz um construtor automaticamente com todos os atributos da classe
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    public Usuario cadastroUsuario(Usuario usuario){
//      usuario.validarIdade();
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuario(Integer id) {
        Optional<Usuario> optional =  usuarioRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException();
        }
    }
}
