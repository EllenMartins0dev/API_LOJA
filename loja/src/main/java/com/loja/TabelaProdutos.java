package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    // No construtor, a lista de produtos será preenchiada :)

    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "Caneta BIC na cor azul", 1.99);
        Produto borracha = new Produto(2, "Borracha branca", "Borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lápis Faber Castell", "Lápis Faber Castell comum", 2.99);
        Produto apontador = new Produto(4, "Apontador", "Apontador comum com reservatório", 7.99);
        Produto caderno = new Produto(5, "Caderno espiral", "Caderno espiral de 96 folhas", 15.99);
        Produto controle = new Produto(6, "Controle projetor", "Controle do projetor Epson", 69.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
        this.produtos.add(controle);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Método que retorna todos os produtos da lista
     * (é redundante, mas foi feito pra explicar a funcionalidade)
     */

    public List<Produto> buscarTodosOsProdutos() {
        return this.getProdutos();

    }

    /**
     * Busca o produto pelo id (faz um for para passar por toda a lista de produtos e procurar, sendo "p" o produto da lista)
     * Caso não encontre, retorna null
     * @param produtoId
     * @return
     */

    public Produto buscarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p: this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }


}
