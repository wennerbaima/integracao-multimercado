package com.integracaomultimercado.controller;

import com.integracaomultimercado.client.MultiMercadoClient;
import com.integracaomultimercado.model.transmissao.CotacaoDadosProposta;
import com.integracaomultimercado.model.transmissao.ProtocoloRetorno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransmissaoPropostaController {

    @Autowired
    MultiMercadoClient multiMercadoClient;

    @GetMapping("/ofertas/cotacoes/{numeroCotacao}/protocolos")
    public ProtocoloRetorno consultaProtocolo(@PathVariable Integer numeroCotacao) {
        return multiMercadoClient.consultaProtocolo(numeroCotacao);
    }

    @PostMapping("/ofertas/cotacoes/{numeroCotacao}/orcamentos/{codigo}/propostas")
    public String gravaProposta(@ModelAttribute CotacaoDadosProposta cotacao, @PathVariable Integer numeroCotacao, @PathVariable Integer codigo) {
        return "";
    }

    @PutMapping("/ofertas/cotacoes/{numeroCotacao}/orcamentos/{codigo}/propostas")
    public String transmiteProposta(@PathVariable Integer numeroCotacao, @PathVariable Integer codigo) {
        return multiMercadoClient.transmiteProposta(numeroCotacao, codigo);
    }
}
