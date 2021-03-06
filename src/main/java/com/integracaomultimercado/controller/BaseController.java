package com.integracaomultimercado.controller;

import com.integracaomultimercado.client.MultiMercadoClient;
import com.integracaomultimercado.model.Dominio;
import com.integracaomultimercado.model.PessoaCongenere;
import com.integracaomultimercado.model.ofertas.RequestOfertas;
import com.integracaomultimercado.model.parcelas.PlanoParcelamentoImpressao;
import com.integracaomultimercado.model.response.CotacaoRetorno;
import com.integracaomultimercado.model.transmissao.CotacaoDadosProposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BaseController {

    @Autowired
    DominiosPessoasController dominiosPessoasController;

    @Autowired
    DominiosGeraisController dominiosGeraisController;

    @Autowired
    DominiosBonusController dominiosBonusController;

    @Autowired
    MultiMercadoClient multiMercadoClient;

    @GetMapping
    public String showFormulario(Model model) {

        List<Dominio> tiposSeguros = dominiosGeraisController.getTiposSeguros().getValores();
        List<Dominio> tiposPessoas = dominiosPessoasController.getTiposPessoas().getValores();
        List<Dominio> tiposDocumentos = dominiosPessoasController.getTiposDocumentos().getValores();
        List<Dominio> finalidadesTelefones = dominiosPessoasController.getFinalidadesTelefones().getValores();
        List<PessoaCongenere> congeneres = dominiosPessoasController.getCongeneres().getPessoas();
        List<Dominio> classesBonus = dominiosBonusController.getClasseBonus().getValores();
        List<Dominio> origensBonus = dominiosBonusController.getOrigemBonus().getValores();

        model.addAttribute("requestOfertas", new RequestOfertas());
        model.addAttribute("tiposSeguros", tiposSeguros);
        model.addAttribute("tiposPessoas", tiposPessoas);
        model.addAttribute("tiposDocumentos", tiposDocumentos);
        model.addAttribute("finalidadesTelefones", finalidadesTelefones);
        model.addAttribute("congeneres", congeneres);
        model.addAttribute("classesBonus", classesBonus);
        model.addAttribute("origensBonus", origensBonus);

        return "index.html";
    }

    @PostMapping
    public String getOfetas(@ModelAttribute RequestOfertas requestOfertas, Model model) {
        CotacaoRetorno cotacaoRetorno = multiMercadoClient.getOfertas(requestOfertas);
        model.addAttribute("cotacaoRetorno", cotacaoRetorno);
        return "melhores-ofertas.html";
    }

    @GetMapping("/parcelas/cotacao/{numeroCotacao}/orcamento/{codigoOrcamento}")
    public String getParcelas(Model model, @PathVariable("numeroCotacao") Integer numeroCotacao, @PathVariable("codigoOrcamento") Integer codigoOrcamento) {
        List<PlanoParcelamentoImpressao> planosParcelamento = multiMercadoClient.getParcelas(numeroCotacao, codigoOrcamento);
        model.addAttribute("planosParcelamento", planosParcelamento);
        return "planos-parcelamento.html";
    }

    @GetMapping("/transmissao-proposta")
    public String showFormularioTransmissao(Model model) {
        model.addAttribute("cotacaoDadosProposta", new CotacaoDadosProposta());
        return "transmissao-proposta.html";
    }
}
