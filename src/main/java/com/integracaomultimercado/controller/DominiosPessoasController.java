package com.integracaomultimercado.controller;

import com.integracaomultimercado.client.MultiMercadoClient;
import com.integracaomultimercado.model.DominioPaginado;
import com.integracaomultimercado.model.PessoaCongenerePaginado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * CLASSE RESPONSÁVEL POR CONTROLAR AS REQUISIÇÕES REFERENTES AOS DOMÍNIOS DE PESSOAS
 *
 * @author Wenner
 */

@RestController
public class DominiosPessoasController {

    private final MultiMercadoClient multiMercadoClient;

    public DominiosPessoasController(MultiMercadoClient multiMercadoClient) {
        this.multiMercadoClient = multiMercadoClient;
    }

    @GetMapping("/dominios/pessoas/tipos")
    public DominioPaginado getTiposPessoas() {
        return multiMercadoClient.getTiposPessoas();
    }

    @GetMapping("/dominios/pessoas/tipos-documentos")
    public DominioPaginado getTiposDocumentos() {
        return multiMercadoClient.getTiposDocumentos();
    }

    @GetMapping("/dominios/pessoas/finalidades-telefones")
    public DominioPaginado getFinalidadesTelefones() { return multiMercadoClient.getFinalidadesTelefones(); }

    @GetMapping("/dominios/pessoas/congeneres")
    public PessoaCongenerePaginado getCongeneres() { return multiMercadoClient.getCongeneres(); }
}
