package com.integracaomultimercado.controller;

import com.integracaomultimercado.client.MultiMercadoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeiculoController {

    @Autowired
    MultiMercadoClient multiMercadoClient;

    @GetMapping("/veiculos")
    public String getVeiculo() {
        return multiMercadoClient.getVeiculo();
    }

}
