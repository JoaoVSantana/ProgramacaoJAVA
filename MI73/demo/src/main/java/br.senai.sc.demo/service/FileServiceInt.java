package br.senai.sc.demo.service;

import br.senai.sc.demo.controller.dto.FileRequestPostDTO;
import br.senai.sc.demo.model.File;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileServiceInt {

    boolean criar(Long id, MultipartFile file);

    String buscarFile(Integer id);

    List<String> buscarImagens(Long id);


}
