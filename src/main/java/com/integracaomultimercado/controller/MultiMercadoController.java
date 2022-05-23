package com.integracaomultimercado.controller;

import com.integracaomultimercado.client.MultiMercadoClient;
import com.integracaomultimercado.model.Dominio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * CLASSE RESPONSÁVEL POR CONTROLAR AS REQUISIÇÕES REFERENTES ÀS CLASSES DE BÔNUS
 *
 * @author Wenner
 */

@RestController
public class MultiMercadoController {

    private final MultiMercadoClient multiMercadoClient;

    public MultiMercadoController(MultiMercadoClient multiMercadoClient) {
        this.multiMercadoClient = multiMercadoClient;
    }

    @GetMapping
    public String getClasseBonus() {
        return multiMercadoClient.getClasseBonus();
    }
}
