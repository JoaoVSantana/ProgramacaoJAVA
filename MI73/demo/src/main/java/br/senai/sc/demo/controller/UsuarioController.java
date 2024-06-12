package br.senai.sc.demo.controller;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//notação que determina o esteriótipo da classe e permite que o Spring interfira nela
@RestController

//determina a rota comum que todos os endpoints terão em comum
@RequestMapping("/usuario")

public class UsuarioController {

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    //EndPoints são interfaces que permitem a comunicação com o exterior
    //Request body trabalha com informação bruta que recebemos ou enviamos
    //Apenas o GET e o DELETE não podem ter body

    //O GET retorna o que está sendo solicitado, podendo ser um objeto ou uma lista filtrada
    // ou completa de objetos (List.of)

    @GetMapping("{id}")
    public Usuario buscarUsuario(@PathVariable Integer id){
        return usuarioService.buscarUsuario(id);
    }

//    @Autowired serve para transformar um atributo baseado em agregação
    private final UsuarioService usuarioService;
    //POST serve para receber e salvar informações em algum lugar
    @PostMapping
    public String cadastroUsuario(@RequestBody Usuario usuario){
        usuarioService.cadastroUsuario(usuario);
        return "Olá " + usuario.getNome()  + ".\n" + usuario;
    }

    //PathVariable são variáveis de caminho
    //O nome do pathVariable não precisa ser o mesmo que a variável de caminho

//    @PutMapping("/{id}")
//    public String endpointPut(@PathVariable int id, @RequestBody String nome){
//        return "Olá " + nome + " de ID = " + id + ".";
//    }
    //PATCH serve para pequenas quantias de alterações, como 1 ou 2.

//    @PatchMapping
//    public String endpointPatch(@RequestParam int id, @RequestBody String nome) {
//        return "Olá " + nome + " de ID = " + id + ".";
//    }

    //DELETE serve para desabilitar algo, deixando de exibir isso ao usuário

//    @DeleteMapping("/{id}")
//    public String endpointDelete(@PathVariable int id){
//        return "Objeto de ID " + id + " deletado.";
//    }
}
