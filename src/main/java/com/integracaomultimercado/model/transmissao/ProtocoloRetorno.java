package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProtocoloRetorno implements Serializable {

    private String status;
    private Proposta proposta;
    //private Apolice apolice;

}
