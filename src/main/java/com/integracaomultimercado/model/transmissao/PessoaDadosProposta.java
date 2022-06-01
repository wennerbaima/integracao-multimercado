package com.integracaomultimercado.model.transmissao;

import com.integracaomultimercado.model.Dominio;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PessoaDadosProposta implements Serializable {

    private Dominio paisNascimento;
    private Dominio ocupacao;
    private Dominio faixaRendaMensal;
    private List<DocumentoDadosProposta> documentos;
    private Dominio tipoVinculoPep;
    //private PessoaRelacaoDadosProposta pessoasPed;
    List<EnderecoDadosProposta> enderecos;
    List<TelefoneDadosPoposta> telefones;
    List<EnderecoEletronicoDadosProposta> enderecosEletronicos;
}
