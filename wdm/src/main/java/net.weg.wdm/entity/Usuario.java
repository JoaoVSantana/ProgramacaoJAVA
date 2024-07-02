package net.weg.wdm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 150)
    private String nome;
    @Column(unique = true, nullable = false, length = 200)
    private String email;
    @Column(nullable = false)
    private String senha;
    private Boolean habilidato;
    @OneToMany(mappedBy = "solicitante")
    private List<Reserva> reservas;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoUsuario tipo;
    @OneToMany
    private List<GrupoDispositivo> gruposDispositivos;

}
