package com.integracaomultimercado.model.ofertas;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RequestOfertas implements Serializable {

    private Integer codigoParceiro;
    private Integer tipoSeguro;
    private Segurado segurado;
    private List<Condutor> condutores;
    private String cepPernoite;
    private String susep;
    private Veiculo veiculo;
    private ApoliceBonus apoliceBonus;
}
