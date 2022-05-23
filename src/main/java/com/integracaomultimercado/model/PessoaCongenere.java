package com.integracaomultimercado.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * MODEL REFERENTE AOS CONGÊNERES
 *
 * @author Wenner
 */

@Data
public class PessoaCongenere implements Serializable {

    private Long codigoSusepCongenere;
    private String nomeLegalPessoa;
    private Long codigoPessoa;
}
