package com.example.exercicio.controller;

import com.example.exercicio.controller.DTO.EnderecoDTO;
import com.example.exercicio.model.Endereco;
import com.example.exercicio.service.Endereco.EnderecoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
@AllArgsConstructor
public class EnderecoController {

    private EnderecoServiceImpl enderecoService;

    @GetMapping
    public ResponseEntity<List<Endereco>> buscarTodosEnderecos(){
        List<Endereco> enderecos = enderecoService.buscarTodosEnderecos();
        return new ResponseEntity<>(enderecos, HttpStatusCode.valueOf(200));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> buscarEnderecoPorId(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(enderecoService.buscarEnderecoPorId(id), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<Endereco> salvarEndereco(@RequestBody EnderecoDTO dto){
        return new ResponseEntity<>(enderecoService.cadastrarEndereco(dto), HttpStatusCode.valueOf(200));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Endereco> editarEndereco(@PathVariable Long id, @RequestBody EnderecoDTO dto) throws Exception {
        Endereco endereco = enderecoService.editarEndereco(dto, id);
        return new ResponseEntity<>(endereco, HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarEndereco(@PathVariable Long id){
        return new ResponseEntity<>(enderecoService.deletarEndereco(id), HttpStatusCode.valueOf(200));
    }
}
