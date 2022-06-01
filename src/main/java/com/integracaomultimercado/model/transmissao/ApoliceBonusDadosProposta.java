package com.integracaomultimercado.model.transmissao;

import com.integracaomultimercado.model.ofertas.Documento;
import lombok.Data;

import java.io.Serializable;

@Data
public class ApoliceBonusDadosProposta implements Serializable {

    private Integer sucursal;
    private Long apolice;
    private Integer item;
    private String ci;
    private String inicioVigencia;
    private String fimVigencia;
    private Documento documentoSegurado;
}
