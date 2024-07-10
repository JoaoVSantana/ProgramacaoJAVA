package br.senai.sc.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.rmi.server.UID;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Data
@Entity
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private UUID url;
    @ManyToOne
    private Task task;


}
