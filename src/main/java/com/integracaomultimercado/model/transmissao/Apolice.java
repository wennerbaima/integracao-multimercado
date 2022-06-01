package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class Apolice implements Serializable {

    private Integer sucursal;
    private Long numero;
    private Long numeroEndosso;
}
