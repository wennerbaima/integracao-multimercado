package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class FormaPagamentoEscolhidaDadosProposta implements Serializable {

    private Integer codigoFormaPagamento;
    private Integer quantidadeParcelas;
    //private MeioPagamentoCotacao meioPagamento;
}
