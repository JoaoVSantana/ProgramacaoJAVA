package com.example.exercicio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @OneToOne
    private Endereco endereco;
    @Column(unique = true)
    private String email;
    @OneToMany(mappedBy = "escola")
    private List<Professor> listaDeProfessores;
    @ManyToMany
    private List<Curso> listaDeCursos;

}
