package com.integracaomultimercado.model.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Item implements Serializable {

    private List<CoberturaCotacao> coberturas;
    private List<Desconto> descontos;
    private List<Assistencia> assistencias;
    private List<Beneficio> beneficios;
    private VistoriaPrevia vistoriaPrevia;
}
