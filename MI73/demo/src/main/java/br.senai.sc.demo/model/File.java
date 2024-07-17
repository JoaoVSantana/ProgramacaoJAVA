package br.senai.sc.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.rmi.server.UID;
import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Data
@Entity
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @CreationTimestamp
    private LocalDate data;

    @ManyToOne
    private Task task;


}
