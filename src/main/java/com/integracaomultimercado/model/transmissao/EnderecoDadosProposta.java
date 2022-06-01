package com.integracaomultimercado.model.transmissao;

import com.integracaomultimercado.model.Dominio;
import lombok.Data;

import java.io.Serializable;

@Data
public class EnderecoDadosProposta implements Serializable {

    private Dominio tipoFinalidade;
    private String numeroCep;
    private String numeroCepComplemento;
    private Integer tipoLogradouro;
    private String nomeLogradouro;
    private String numeroImovelLogradouro;
    //private String descricaoComplementoEndereco;
    private String bairro;
    private boolean flagEndCorrespondencia;
}
