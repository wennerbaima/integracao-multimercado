package com.integracaomultimercado.model.ofertas;

import lombok.Data;

import java.io.Serializable;

@Data
public class Documento implements Serializable {
    private Integer tipo;
    private String numero;
}
