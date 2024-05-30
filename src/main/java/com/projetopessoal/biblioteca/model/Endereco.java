package com.projetopessoal.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {

    /*todo
    Criar Tabela Endereco no banco, tabela TipoStatus para leitura, ajustar para inserir a api viacep na tabela endereço.
     */

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String gia;
    private String ddd;
    private String siafi;

//    @Override
//    public String toString() {
//        return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + '}';
//    }
}
