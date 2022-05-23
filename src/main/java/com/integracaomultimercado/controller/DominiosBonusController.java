package com.integracaomultimercado.controller;

import com.integracaomultimercado.client.MultiMercadoClient;
import com.integracaomultimercado.model.DominioNPaginado;
import com.integracaomultimercado.model.DominioPaginado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * CLASSE RESPONSÁVEL POR CONTROLAR AS REQUISIÇÕES REFERENTES AOS DOMÍNIOS DE BÔNUS
 *
 * @author Wenner
 */

@RestController
public class DominiosBonusController {

    private final MultiMercadoClient multiMercadoClient;

    public DominiosBonusController(MultiMercadoClient multiMercadoClient) {
        this.multiMercadoClient = multiMercadoClient;
    }

    @GetMapping("/dominios/bonus/classes")
    public DominioNPaginado getClasseBonus() {
        return multiMercadoClient.getClasseBonus();
    }

    @GetMapping("/dominios/bonus/origens")
    public DominioPaginado getOrigemBonus() {
        return multiMercadoClient.getOrigemBonus();
    }
}
