package com.integracaomultimercado.model.transmissao;

import lombok.Data;

import java.io.Serializable;

@Data
public class SeguradoDadosProposta implements Serializable {

    private PessoaDadosProposta pessoa;
}
