package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class PropostaRetorno implements Serializable {

    private VistoriaPreviaPropostaRetorno vistoriaPrevia;
    private RastreadorPropostaRetorno rastreador;
}
