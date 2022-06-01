package com.integracaomultimercado.model.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class VistoriaPrevia implements Serializable {

    private Integer tipo;
    private String descricao;
}
