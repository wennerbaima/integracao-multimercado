package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class RastreadorPropostaRetorno implements Serializable {

    private String mensagem;
    private String link;
}
