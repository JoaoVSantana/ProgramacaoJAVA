package br.senai.sc.demo.controller;

import br.senai.sc.demo.service.ConsumerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/consumer")
public class ConsumerController {

    private ConsumerService consumerService;
    @GetMapping("/messages")
    public ResponseEntity<List<String>> getMessages() {
        List<String> mensagens = consumerService.getMessages();
        return ResponseEntity.ok(mensagens);
    }
}
