package com.integracaomultimercado.controller;

import com.integracaomultimercado.model.Dominio;
import com.integracaomultimercado.model.PessoaCongenere;
import com.integracaomultimercado.model.PessoaCongenerePaginado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class BaseController {

    @Autowired
    DominiosPessoasController dominiosPessoasController;

    @Autowired
    DominiosGeraisController dominiosGeraisController;

    @Autowired
    DominiosBonusController dominiosBonusController;

    @GetMapping
    public ModelAndView getFormulario() {
        ModelAndView mv = new ModelAndView("index.html");
        List<Dominio> tiposSeguros = dominiosGeraisController.getTiposSeguros().getValores();
        List<Dominio> tiposPessoas = dominiosPessoasController.getTiposPessoas().getValores();
        List<Dominio> tiposDocumentos = dominiosPessoasController.getTiposDocumentos().getValores();
        List<Dominio> finalidadesTelefones = dominiosPessoasController.getFinalidadesTelefones().getValores();
        List<PessoaCongenere> congeneres = dominiosPessoasController.getCongeneres().getPessoas();
        List<Dominio> classesBonus = dominiosBonusController.getClasseBonus().getValores();
        List<Dominio> origensBonus = dominiosBonusController.getOrigemBonus().getValores();

        mv.addObject("tiposSeguros", tiposSeguros);
        mv.addObject("tiposPessoas", tiposPessoas);
        mv.addObject("tiposDocumentos", tiposDocumentos);
        mv.addObject("finalidadesTelefones", finalidadesTelefones);
        mv.addObject("congeneres", congeneres);
        mv.addObject("classesBonus", classesBonus);
        mv.addObject("origensBonus", origensBonus);

        return mv;
    }
}
