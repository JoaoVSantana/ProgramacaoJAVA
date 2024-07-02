package net.weg.wdm.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoUsuario {
    USUARIO("Usuário"),
    ADMINISTRADOR("Administrador");
    private final String NOME;
}
