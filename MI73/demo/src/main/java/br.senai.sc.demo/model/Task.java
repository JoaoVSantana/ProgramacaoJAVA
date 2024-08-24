package br.senai.sc.demo.model;

import br.senai.sc.demo.controller.dto.TaskGetDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "url", cascade = CascadeType.ALL)
    private List<File> file;

    private String titulo;

    public TaskGetDTO toGetDTO(){
        List<String> imagens = this.file.stream().map(File::getUrl).toList();
        return new TaskGetDTO(this.id, this.titulo, imagens);
    }
}
