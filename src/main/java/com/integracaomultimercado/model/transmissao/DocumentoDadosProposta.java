package com.integracaomultimercado.model.transmissao;

import com.integracaomultimercado.model.Dominio;
import lombok.Data;

import java.io.Serializable;

@Data
public class DocumentoDadosProposta implements Serializable {

    private Dominio tipoIdentificacao;
    private String numeroDocumento;
    private Dominio orgaoEmissor;
    private String dataExpedicao;
}
