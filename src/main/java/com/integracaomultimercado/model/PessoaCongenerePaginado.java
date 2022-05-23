package com.integracaomultimercado.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * MODEL REFERENTE AOS CONGÊNERES PAGINADOS
 *
 * @author Wenner
 */

@Data
public class PessoaCongenerePaginado implements Serializable {

    private Integer page;
    private Integer perPage;
    private Integer totalPages;
    private Long totalElements;
    private List<PessoaCongenere> pessoas;
}
