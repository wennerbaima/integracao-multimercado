package com.integracaomultimercado.model.ofertas;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApoliceBonus implements Serializable {

    private Integer congenere;
    private Bonus bonus;
}
