package br.senai.sc.demo.service;

import br.senai.sc.demo.controller.dto.TaskGetDTO;
import br.senai.sc.demo.controller.dto.TaskRequestPostDTO;
import br.senai.sc.demo.model.Task;

import java.util.List;

public interface TaskServiceInt {

    public Task criarTask(TaskRequestPostDTO taskRequest);

    public Task buscarTaskPorId(Integer id);

    public List<TaskGetDTO> buscarTodasTasks();
}


