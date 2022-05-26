package com.integracaomultimercado.model.ofertas;

import com.integracaomultimercado.model.response.StatusCotacao;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResponseOfertas implements Serializable {

    private Integer numeroCotacao;
    private List<StatusCotacao> statusCotacao;
    private String dataCriacao;
}
