package br.senai.sc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage(String message) {
        CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send("meu_topico", message);
        future.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Mensagem enviada=[" + message +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Não foi possivel enviar a mensagem=[" +
                        message + "] por causa de : " + ex.getMessage());
            }
        });
    }
}
