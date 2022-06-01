package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class ItemDadosProposta implements Serializable {

    private VeiculoDadosProposta veiculo;
    private ApoliceBonusDadosProposta apoliceBonus;
}
