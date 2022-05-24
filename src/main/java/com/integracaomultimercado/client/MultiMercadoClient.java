package com.integracaomultimercado.client;

import com.integracaomultimercado.model.DominioNPaginado;
import com.integracaomultimercado.model.DominioPaginado;
import com.integracaomultimercado.model.PessoaCongenerePaginado;
import com.integracaomultimercado.oauthfeign.OAuthFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

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
}
