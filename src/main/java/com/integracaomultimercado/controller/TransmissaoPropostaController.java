package com.integracaomultimercado.controller;

import com.integracaomultimercado.client.MultiMercadoClient;
import com.integracaomultimercado.model.transmissao.CotacaoDadosProposta;
import com.integracaomultimercado.model.transmissao.PropostaRetorno;
import com.integracaomultimercado.model.transmissao.ProtocoloRetorno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TransmissaoPropostaController {

    @Autowired
    MultiMercadoClient multiMercadoClient;

    @GetMapping("/ofertas/cotacoes/{numeroCotacao}/protocolos")
    public String consultaProtocolo(Model model, @PathVariable Integer numeroCotacao) {
        ProtocoloRetorno protocoloRetorno = multiMercadoClient.consultaProtocolo(numeroCotacao);
        model.addAttribute("protocoloRetorno", protocoloRetorno);
        return "protocolo-retorno";
    }

    @PostMapping("/ofertas/cotacoes/{numeroCotacao}/orcamentos/{codigo}/propostas")
    public String gravaProposta(Model model, @ModelAttribute CotacaoDadosProposta cotacao, @PathVariable Integer numeroCotacao, @PathVariable Integer codigo) {
        PropostaRetorno propostaRetorno = multiMercadoClient.gravaProposta(cotacao, numeroCotacao, codigo);
        model.addAttribute("propostaRetorno", propostaRetorno);
        return "transmissao-resposta.html";
    }

    @PutMapping("/ofertas/cotacoes/{numeroCotacao}/orcamentos/{codigo}/propostas")
    public String transmiteProposta(@PathVariable Integer numeroCotacao, @PathVariable Integer codigo) {
        PropostaRetorno propostaRetorno = multiMercadoClient.transmiteProposta(numeroCotacao, codigo);
        return "";
    }

    @PostMapping("/ofertas/cotacoes/{numeroCotacao}/orcamentos/{codigo}/propostas/transmissoes")
    public String gravaTransmiteProposta(@ModelAttribute CotacaoDadosProposta cotacao, @PathVariable Integer numeroCotacao, @PathVariable Integer codigo) {
        PropostaRetorno propostaRetorno = multiMercadoClient.gravaTransmiteProposta(cotacao, numeroCotacao, codigo);
        return "";
    }
}
