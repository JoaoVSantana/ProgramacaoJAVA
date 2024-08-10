package br.senai.sc.demo.controller;

import br.senai.sc.demo.controller.dto.TaskRequestPostDTO;
import br.senai.sc.demo.model.Task;
import br.senai.sc.demo.service.TaskService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/task")
public class TaskController {
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> criarTask(@RequestBody TaskRequestPostDTO taskRequest){
        return new ResponseEntity<>( taskService.criarTask(taskRequest), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> buscarTask(@PathVariable Integer id){
        return new ResponseEntity<>(taskService.buscarTaskPorId(id), HttpStatusCode.valueOf(200));
    }

    @GetMapping
    public ResponseEntity<List<Task>> buscarTodasTasks(){
        return new ResponseEntity<>(taskService.buscarTodasTasks(), HttpStatusCode.valueOf(200));
    }

}
