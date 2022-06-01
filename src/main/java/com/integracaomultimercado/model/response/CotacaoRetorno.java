package com.integracaomultimercado.model.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CotacaoRetorno implements Serializable {

    private Integer numeroCotacao;
    private List<StatusCotacao> statusCotacao;
    private String dataCriacao;
    private List<Orcamento> orcamentos;
}
