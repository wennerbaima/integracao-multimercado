package com.integracaomultimercado.model.ofertas;

import lombok.Data;

import java.io.Serializable;

@Data
public class PessoaCondutor implements Serializable {

    private Integer tipo;
    private Documento documento;
}
