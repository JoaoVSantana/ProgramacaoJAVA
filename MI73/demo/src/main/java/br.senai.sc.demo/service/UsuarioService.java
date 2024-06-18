package br.senai.sc.demo.service;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Serve para acionar a lógica das validações e regras de negocio do sistema
@Service
//Faz um construtor automaticamente com todos os atributos da classe
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    public Usuario salvarUsuario(Usuario usuario){
//      usuario.validarIdade();
        return usuarioRepository.save(usuario);
    }
    public Usuario buscarUsuario(Integer id) throws Exception {
        Optional<Usuario> optional =  usuarioRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Usuário não encontrado!");
        }
    }
    public List<Usuario> buscarUsuarios(){
        return usuarioRepository.findAll();
    }

    private void validarUsuario(Integer id){
        if(!usuarioRepository.existsById(id)){
            throw new RuntimeException("Usuário não encontrado");
        }
    }

    public Usuario atualizarUsuario(Integer id, Usuario usuario) {
        validarUsuario(id);
        usuario.setId(id);
        return salvarUsuario(usuario);
    }

    public Usuario editarSenha(Integer id, String novaSenha) {
        Optional <Usuario> usuarioProcurado = usuarioRepository.findById(id);
        if(usuarioProcurado.isPresent()){
          Usuario usuarioAlterado = usuarioProcurado.get();
          usuarioAlterado.setSenha(novaSenha);
          return usuarioRepository.save(usuarioAlterado);
        }
       throw new RuntimeException("Usuário não encontrado!");
    }

    public void removerUsuario(Integer id) {
        if(!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado!");
        }
        usuarioRepository.deleteById(id);
        if (usuarioRepository.existsById(id)){
            throw new RuntimeException("Não foi possível deletar o usuário de Id " + id);
        }
    }
}
