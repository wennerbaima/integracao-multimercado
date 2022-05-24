package com.integracaomultimercado.controller;

import com.integracaomultimercado.client.MultiMercadoClient;
import com.integracaomultimercado.model.Dominio;
import com.integracaomultimercado.model.DominioNPaginado;
import com.integracaomultimercado.model.DominioPaginado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * CLASSE RESPONSÁVEL POR CONTROLAR AS REQUISIÇÕES REFERENTES AOS DOMÍNIOS GERAIS
 *
 * @author Wenner
 */

@RestController
public class DominiosGeraisController {

    private final MultiMercadoClient multiMercadoClient;

    public DominiosGeraisController(MultiMercadoClient multiMercadoClient) {
        this.multiMercadoClient = multiMercadoClient;
    }

    @GetMapping("/dominios/tipos-seguros")
    public DominioPaginado getTiposSeguros() {
        return multiMercadoClient.getTiposSeguros();
    }
}
