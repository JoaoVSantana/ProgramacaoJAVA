package br.senai.sc.demo.repository;

import br.senai.sc.demo.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Integer> {
}