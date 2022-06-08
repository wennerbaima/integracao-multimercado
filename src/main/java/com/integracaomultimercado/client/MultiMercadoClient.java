package com.integracaomultimercado.client;

import com.integracaomultimercado.model.DominioNPaginado;
import com.integracaomultimercado.model.DominioPaginado;
import com.integracaomultimercado.model.PessoaCongenerePaginado;
import com.integracaomultimercado.model.ofertas.RequestOfertas;
import com.integracaomultimercado.model.parcelas.PlanoParcelamentoImpressao;
import com.integracaomultimercado.model.response.CotacaoRetorno;
import com.integracaomultimercado.model.transmissao.CotacaoDadosProposta;
import com.integracaomultimercado.model.transmissao.PropostaRetorno;
import com.integracaomultimercado.model.transmissao.ProtocoloRetorno;
import com.integracaomultimercado.oauthfeign.OAuthFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CLIENTE HTTP UTILIZANDO FEIGN
 *
 * @author Wenner
 */

@FeignClient(
        name = "cliente-multimercado",
        url = "https://portoapi-sandbox.portoseguro.com.br/automovel/parceiro-multimercado/v1",
        configuration = OAuthFeignConfig.class
)
public interface MultiMercadoClient {

    @GetMapping("/dominios/classes-bonus")
    DominioNPaginado getClasseBonus();

    @GetMapping("/dominios/origens-bonus")
    DominioPaginado getOrigemBonus();

    @GetMapping("/dominios/tipos-seguros")
    DominioPaginado getTiposSeguros();

    @GetMapping("/dominios/pessoas/tipos")
    DominioPaginado getTiposPessoas();

    @GetMapping("/dominios/documentos/tipos")
    DominioPaginado getTiposDocumentos();

    @GetMapping("/dominios/telefones/finalidades")
    DominioPaginado getFinalidadesTelefones();

    @GetMapping("/dominios/pessoas/congeneres")
    PessoaCongenerePaginado getCongeneres();

    @GetMapping("/veiculos")
    String getVeiculo();

    @PostMapping("/ofertas/cotacoes")
    CotacaoRetorno getOfertas(@RequestBody RequestOfertas requestOfertas);

    @GetMapping("/ofertas/cotacoes/{numeroCotacao}/orcamentos/{codigoOrcamento}/parcelas")
    List<PlanoParcelamentoImpressao> getParcelas(@PathVariable("numeroCotacao") Integer numeroCotacao, @PathVariable("codigoOrcamento") Integer codigoOrcamento);

    @GetMapping("/ofertas/cotacoes/{numeroCotacao}/protocolos")
    ProtocoloRetorno consultaProtocolo(@PathVariable("numeroCotacao") Integer numeroCotacao);

    @PostMapping("/ofertas/cotacoes/{numeroCotacao}/orcamentos/{codigo}/propostas")
    PropostaRetorno gravaProposta(@RequestBody CotacaoDadosProposta cotacao, @PathVariable("numeroCotacao") Integer numeroCotacao, @PathVariable("codigo") Integer codigo);

    @PutMapping("/ofertas/cotacoes/{numeroCotacao}/orcamentos/{codigo}/propostas")
    PropostaRetorno transmiteProposta(@PathVariable("numeroCotacao") Integer numeroCotacao, @PathVariable("codigo") Integer codigo);

    @PostMapping("/ofertas/cotacoes/{numeroCotacao}/orcamentos/{codigo}/propostas/transmissoes")
    PropostaRetorno gravaTransmiteProposta(@RequestBody CotacaoDadosProposta cotacao, @PathVariable("numeroCotacao") Integer numeroCotacao, @PathVariable("codigo") Integer codigo);

    @GetMapping("/ofertas/cotacoes/{numeroCotacao}/impressoes")
    String consultaOrcamentos(@PathVariable Integer numeroCotacao);

    @PostMapping("/ofertas/cotacoes/{numeroCotacao}/impressoes")
    String solicitaImpressao();
}
