package br.senai.sc.demo.service;

import br.senai.sc.demo.controller.dto.TaskGetDTO;
import br.senai.sc.demo.controller.dto.TaskRequestPostDTO;
import br.senai.sc.demo.model.Task;
import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService implements TaskServiceInt{

    public TaskRepository taskRepository;

    @Override
    public Task criarTask(TaskRequestPostDTO taskRequest) {
        Task task = new Task();
        task.setTitulo(taskRequest.titulo());
        return taskRepository.save(task);
    }
    @Override
    public Task buscarTaskPorId(Integer id) {
        Optional<Task> optional =  taskRepository.findById(id);
        Task task = optional.get();
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
