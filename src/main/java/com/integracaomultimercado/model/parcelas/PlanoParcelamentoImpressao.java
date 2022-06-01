package com.integracaomultimercado.model.parcelas;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PlanoParcelamentoImpressao implements Serializable {

    private Integer codigoFormaPagamento;
    private Integer tipoClasseCalculoPremio;
    private String descricaoFormaPagamento;
    private Integer ordenacao;
    private List<ParcelamentoImpressao> parcelamentos;
}
