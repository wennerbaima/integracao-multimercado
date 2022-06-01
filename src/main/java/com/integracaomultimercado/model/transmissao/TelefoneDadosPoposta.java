package com.integracaomultimercado.model.transmissao;

import com.integracaomultimercado.model.Dominio;
import lombok.Data;

import java.io.Serializable;

@Data
public class TelefoneDadosPoposta implements Serializable {

    private Dominio tipoFinalidade;
    private Integer ddd;
    private Long numero;
}
