package net.weg.wdm.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.weg.wdm.entity.DiaSemana;

@AllArgsConstructor
@Data
public class PeriodoReservaCadastro {
    private Long idTurma;
    private Long idPeriodo;
    private Long idAmbiente;
    private DiaSemana diaSemana;
}
