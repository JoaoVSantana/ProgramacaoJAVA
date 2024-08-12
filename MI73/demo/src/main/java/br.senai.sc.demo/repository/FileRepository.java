package br.senai.sc.demo.repository;

import br.senai.sc.demo.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository extends JpaRepository<File, Integer> {

    List<File>findAllByTask_Id(Long id);
}
