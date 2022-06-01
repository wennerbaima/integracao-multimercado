package com.integracaomultimercado.model.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Franquia implements Serializable {

    private Integer codigo;
    private BigDecimal valorFranquia;
}
