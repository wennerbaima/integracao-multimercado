package com.integracaomultimercado.client;

import com.integracaomultimercado.model.DominioNPaginado;
import com.integracaomultimercado.model.DominioPaginado;
import com.integracaomultimercado.model.PessoaCongenerePaginado;
import com.integracaomultimercado.oauthfeign.OAuthFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * CLIENTE HTTP UTILIZANDO FEIGN
 *
 * @author Wenner
 */

@FeignClient(
        name = "multimercado-client",
        url = "https://portoapi-sandbox.portoseguro.com.br/automovel/parceiro-multimercado/v1",
        configuration = OAuthFeignConfig.class
)
public interface MultiMercadoClient {

    @RequestMapping(
            value = "/dominios/classes-bonus",
            method = RequestMethod.GET
    )
    DominioNPaginado getClasseBonus();

    @RequestMapping(
            value = "/dominios/origens-bonus",
            method = RequestMethod.GET
    )
    DominioPaginado getOrigemBonus();

    @RequestMapping(
            value = "/dominios/tipos-seguros",
            method = RequestMethod.GET
    )
    DominioPaginado getTiposSeguros();

    @RequestMapping(
            value = "/dominios/pessoas/tipos",
            method = RequestMethod.GET
    )
    DominioPaginado getTiposPessoas();

    @RequestMapping(
            value = "/dominios/documentos/tipos",
            method = RequestMethod.GET
    )
    DominioPaginado getTiposDocumentos();

    @RequestMapping(
            value = "/dominios/telefones/finalidades",
            method = RequestMethod.GET
    )
    DominioPaginado getFinalidadesTelefones();

    @RequestMapping(
            value = "/dominios/pessoas/congeneres",
            method = RequestMethod.GET
    )
    PessoaCongenerePaginado getCongeneres();
}
