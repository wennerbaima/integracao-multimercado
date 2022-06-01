package com.integracaomultimercado.model.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class CoberturaCotacao implements Serializable {

    private BigDecimal codigo;
    private Integer tipo;
    private BigDecimal valorImportanciaSegurada;
    private BigDecimal valorPremio;
    private List<Franquia> franquias;
}
