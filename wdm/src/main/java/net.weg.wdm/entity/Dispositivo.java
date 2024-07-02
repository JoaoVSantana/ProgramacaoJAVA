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
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long numero;
    @ManyToOne
    @Column(nullable = false)
    private TipoDispositivo tipo;
    @Column(nullable = false, length = 50)
    private String marca;
    @Column(nullable = false, length = 50)
    private String modelo;
    //mappedBy serve para classes que possuem "ligações duplas" onde ambas se referenciam
    //Colocando mappedBy na classe que for considerada Many, o sistema faz apenas uma ligação
    /* Com o mappedBy, quando "dispositivo" for registrado ele usa o próprio Id para procurar
    na tabela do banco e se encontrar algo que é seu, ele registra na sua classe */
    @OneToMany(mappedBy = "dispositivo")
    private List<DispositivoReservado> reservasDoDispositivo;
    @OneToMany(mappedBy = "dispositivo")
    private List<Manutencao> manutencoes;
    private String descricao;
    private Boolean habilitado = true;
}
