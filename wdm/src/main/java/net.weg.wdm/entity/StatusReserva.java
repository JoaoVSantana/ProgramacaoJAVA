package net.weg.wdm.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusReserva {
    EM_ABERTO("Em aberto"),
    AGUARDANDO_RETIRADA("Aguardando Retirada"),
    AGUARDANDO_DEVOLUCAO("Aguardando Devolução"),
    ATRASADA("Atrasada"),
    CONCLUIDA("Concluída"),
    CANCELADA("Cancelada");

    private final String NOME;
}
