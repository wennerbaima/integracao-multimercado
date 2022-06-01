package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class CotacaoDadosProposta implements Serializable {

    private Long numeroCotacao;
    private SeguradoDadosProposta segurado;
    private OrcamentoDadosProposta orcamento;
}
