package com.integracaomultimercado.model.ofertas;

import lombok.Data;

import java.io.Serializable;

@Data
public class Veiculo implements Serializable {

    private Long codigoVersao;
    private Integer anoModelo;
    private Integer anoFabricacao;
    private String placa;
    private String flagZeroKm;
}
