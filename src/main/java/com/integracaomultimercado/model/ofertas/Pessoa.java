package com.integracaomultimercado.model.ofertas;

import lombok.Data;

@Data
public class Pessoa {
    private Integer tipo;
    private Documento documento;
    private Telefone telefone;
    private String email;
}
