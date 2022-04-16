package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
     Produto meuProduto = new Produto();


     meuProduto.setNome("Play Station 4");
     meuProduto.setValor(79.99);
     meuProduto.setMarca("Sony");
     meuProduto.setTamanho("Medio");
     meuProduto.setItensInclusos("2 controles e 3 jogos");

        System.out.println(meuProduto.getValor());
        }
}
