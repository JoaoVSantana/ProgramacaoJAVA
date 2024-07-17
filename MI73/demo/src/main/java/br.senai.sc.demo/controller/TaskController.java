package br.senai.sc.demo.controller;

import br.senai.sc.demo.controller.dto.TaskRequestPostDTO;
import br.senai.sc.demo.model.Task;
import br.senai.sc.demo.service.TaskService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping
public class TaskController {
    private TaskService taskService;

    @PostMapping
    public Task criarTask(@RequestBody TaskRequestPostDTO taskRequest){
        return taskService.criarTask(taskRequest);
    }

    @GetMapping("/{id}")
    public Task buscarTask(@PathVariable Integer id){
        return taskService.buscarTaskPorId(id);
    }

}
