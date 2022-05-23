package com.integracaomultimercado.client;

import com.integracaomultimercado.model.Dominio;
import com.integracaomultimercado.oauthfeign.OAuthFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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
    String getClasseBonus();
}
