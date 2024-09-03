package br.senai.sc.demo.service;

import br.senai.sc.demo.controller.dto.TaskGetDTO;
import br.senai.sc.demo.controller.dto.TaskRequestPostDTO;
import br.senai.sc.demo.model.Task;
import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
@AllArgsConstructor
public class TaskService implements TaskServiceInt{

    public TaskRepository taskRepository;

    private ProducerService producerService;

    @Override
    public Task criarTask(TaskRequestPostDTO taskRequest) {
        Task task = new Task();
        task.setTitulo(taskRequest.titulo());
        taskRepository.save(task);
        producerService.sendMessage("Task criada com sucesso");
        return task;
    }
    @Override
    public Task buscarTaskPorId(Integer id) {
        Optional<Task> optional =  taskRepository.findById(id);
        Task task = optional.get();
        producerService.sendMessage("Task " + task.getTitulo() + " encontrada");
        return task;

    }
    @Override
    public List<TaskGetDTO> buscarTodasTasks(){
        List<Task> tasks = taskRepository.findAll();
        List<TaskGetDTO> dtoList = new ArrayList<>();
        for (Task task : tasks) {
            dtoList.add(task.toGetDTO());
        }
        return dtoList;
    }
}
