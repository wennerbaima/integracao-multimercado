package com.integracaomultimercado.model.ofertas;

import lombok.Data;

import java.io.Serializable;

@Data
public class Bonus implements Serializable {

    private Integer valor;
    private Integer origem;
}
