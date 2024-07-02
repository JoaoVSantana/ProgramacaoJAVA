package net.weg.wdm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reserva {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long numero;
    @ManyToOne
    @Column(nullable = false)
    private Usuario solicitante;
    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    private List<DispositivoReservado> dispositivoReservados;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusReserva status;
    @ManyToOne
    @Column(nullable = false)
    private Ambiente ambiente;
    @ManyToOne
    @Column(nullable = false)
    private Turma turma;
    @ManyToOne
    @Column(nullable = false)
    private Periodo periodo;
    @Column(nullable = false)
    private LocalDateTime dia;
    @ManyToOne
    @Column(nullable = false)
    private SolicitacaoReserva solicitacao;
    private String comentário;


}
