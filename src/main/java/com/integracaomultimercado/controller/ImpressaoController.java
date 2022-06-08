package com.integracaomultimercado.controller;

import com.integracaomultimercado.client.MultiMercadoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImpressaoController {

    @Autowired
    MultiMercadoClient multiMercadoClient;

    @GetMapping("/ofertas/cotacoes/{numeroCotacao}/impressoes")
    public String consultaOrcamentos(@PathVariable Integer numeroCotacao) {
        return multiMercadoClient.consultaOrcamentos(numeroCotacao);
    }

    @PostMapping("/ofertas/cotacoes/{numeroCotacao}/impressoes")
    public String solicitaImpressao() {
        return multiMercadoClient.solicitaImpressao();
    }
}
