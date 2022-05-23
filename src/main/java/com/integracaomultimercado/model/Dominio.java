package com.integracaomultimercado.model;

import lombok.Data;

import java.io.Serializable;

/**
 * MODEL REFERENTE AOS DOMÍNIOS
 *
 * @author Wenner
 */

@Data
public class Dominio implements Serializable {

    private Integer codigo;
    private String descricao;
}
