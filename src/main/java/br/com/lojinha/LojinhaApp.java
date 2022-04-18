package br.com.lojinha;

import br.com.lojinha.enemus.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
     Produto meuProduto = new Produto();


     meuProduto.setNome("Play Station 4");
     meuProduto.setValor(40);
     meuProduto.setMarca("Sony");
     meuProduto.setTamanho(Tamanho.Pequeno);

        List<String> itensInclusos = new ArrayList<String>();
        itensInclusos.add("2 Controles");
        itensInclusos.add("3 jogos");
        itensInclusos.add("2 Cabos de Energia");

     meuProduto.setItensInclusos(itensInclusos);



        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        }
}
