package br.senai.sc.demo.repository;

import br.senai.sc.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
