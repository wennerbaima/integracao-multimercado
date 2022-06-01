package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class Proposta implements Serializable {

    private Integer origem;
    private Long numero;
}
