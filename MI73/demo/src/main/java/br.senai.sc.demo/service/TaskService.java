package br.senai.sc.demo.service;

import br.senai.sc.demo.controller.dto.TaskRequestPostDTO;
import br.senai.sc.demo.model.Task;
import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {

    public TaskRepository taskRepository;

    public Task criarTask(TaskRequestPostDTO taskRequest) {
        Task task = new Task();
        task.setTitulo(taskRequest.titulo());
        return taskRepository.save(task);
    }
    public Task buscarTaskPorId(Integer id) {
        Optional<Task> optional =  taskRepository.findById(id);
        Task task = optional.get();
        return task;

    }

    public List<Task> buscarTodasTasks(){
        return taskRepository.findAll();
    }
}
