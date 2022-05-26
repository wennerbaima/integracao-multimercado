package com.integracaomultimercado.model.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class StatusCotacao implements Serializable {

    private Integer codigo;
    private String descricao;
    private String fonte;
}
