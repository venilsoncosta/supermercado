package com.supermercado.supermercado.entities;

public enum Categoria {
    BEBIDAS("bebidas"),
    ALIMENTOS("alimentos"),
    HIGIENE("higiene"),
    LIMPEZA("limpeza"),
    OUTROS("outros");

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
