package com.integracaomultimercado.model.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Orcamento implements Serializable {

    private Integer codigo;
    private String inicioVigencia;
    private String fimVigencia;
    private Integer empresa;
    private BigDecimal valorPremioFinal;
    private BigDecimal valorPremioFinalCartao;
    private BigDecimal valorPremioSemIOF;
    private BigDecimal valorMonetarioIOF;
    private Item item;
}
