package net.weg.wdm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DispositivoReservado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @Column(nullable = false)
    private Dispositivo dispositivo;
    private LocalDateTime retirada;
    private LocalDateTime devolucao;
    @ManyToOne
    @Column(nullable = false)
    private Reserva reserva;
}
