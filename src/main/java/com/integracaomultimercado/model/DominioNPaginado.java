package com.integracaomultimercado.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * MODEL REFERENTE AOS DOMÍNIOS NÃO PAGINADOS
 *
 * @author Wenner
 */

@Data
public class DominioNPaginado implements Serializable {

    private List<Dominio> valores;
}
