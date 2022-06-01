package com.integracaomultimercado.model.parcelas;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ParcelamentoImpressao implements Serializable {
    private Integer numero;
    private String valor;
    private String descricao;
    private BigDecimal juros;
    private BigDecimal encargos;
}
