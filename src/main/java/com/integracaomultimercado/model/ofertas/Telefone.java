package com.integracaomultimercado.model.ofertas;

import lombok.Data;

import java.io.Serializable;

@Data
public class Telefone implements Serializable {

    private Integer tipoFinalidade;
    private Integer ddd;
    private Long numero;
}
