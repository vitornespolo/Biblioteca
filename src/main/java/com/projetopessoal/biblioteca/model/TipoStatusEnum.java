package com.projetopessoal.biblioteca.model;

public enum TipoStatusEnum {

    LIDO(1),
    LENDO(2),
    QUERO_LER(3);

    public int codigo;

    TipoStatusEnum(int idTipoStaus) {
        codigo = idTipoStaus;
    }
}
