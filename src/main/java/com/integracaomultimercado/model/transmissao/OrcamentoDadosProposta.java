package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrcamentoDadosProposta implements Serializable {

    private Integer codigo;
    private ItemDadosProposta itens;
    private FormaPagamentoEscolhidaDadosProposta formaPagamentoEscolhida;
}
