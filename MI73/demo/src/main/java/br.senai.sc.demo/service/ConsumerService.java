package br.senai.sc.demo.service;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerService {

    private final List<String> mensagens = new ArrayList<>();

    @KafkaListener(topics = "meu_topico", groupId = "my_group")
    public void listenGroup(String message) {
        synchronized (mensagens) {
            mensagens.add(message);
        }
        System.out.println("Mensagem recebida: " + message);
    }

    public List<String> getUnreadMessages() {
        synchronized (mensagens) {
            List<String> unread = new ArrayList<>(mensagens);
            mensagens.clear();
            return unread;
        }
    }
}
