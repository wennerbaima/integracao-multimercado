package com.integracaomultimercado.model.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Assistencia implements Serializable {

    private Integer codigo;
    private Integer tipo;
    private BigDecimal valorPremio;
}
