package net.weg.wdm.entity;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum StatusManutencao {
    EM_MANUTENCAO("Em manutenção"),
    CONCLUIDA("Concluída");
    private final String NOME;

}
