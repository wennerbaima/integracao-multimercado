package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class VeiculoDadosProposta implements Serializable {
    private String placa;
    private String chassi;
    private Integer renavam;
    private String dataSaidaVeiculo;
    private String nomeBeneficiario;
}
