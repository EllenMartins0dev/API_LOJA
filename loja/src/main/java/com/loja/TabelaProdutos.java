package com.loja;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
     *
     * @param produtoId
     * @return
     */

    public Produto buscarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p : this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }

    /**
     * Método pra cadastra4 novo produto.
     *
     * @param novoProduto
     * @return
     */
    public Produto cadastrarNovoProduto(Produto novoProduto) {
        // O -1 serve pra pegar o último index (tem 6 valores mas o index (posição) vai de 0 à 5)
        int ultimoIndex = this.produtos.size() - 1;
        // Pega o último produto pelo index (id = 6)
        Produto ultimoProduto = this.produtos.get(ultimoIndex);
        // O próximo id (6) é o último id mais 1 (id = 7)
        int proximoId = ultimoProduto.getId() + 1;
        /**
         * Outra forma pra economizar linha:
         * int id = this.produtos.get(this.produtos.size() - 1).getId() + 1
         */
        novoProduto.setId(proximoId);
        this.produtos.add(novoProduto);
        return novoProduto;
    }

    /**
     * Método que atualiza um produto
     * Primeiro busca o produto que vai ser atualizado pelo Id
     * Depois atribui as novas informações: nome, descrição e valor
     * Depois ele salva o produto atualizado
     * @param produtoId
     * @param produtoAtualizar
     */
    // Atualiza produto, então não retorna nada
    public void atualizarProduto(int produtoId, Produto produtoAtualizar) {
        Produto produtoProcurado = this.buscarProdutoPeloId(produtoId);
        if (produtoProcurado != null) {
            produtoProcurado.setNome(produtoAtualizar.getNome());
            produtoProcurado.setDescricao(produtoAtualizar.getDescricao());
            produtoProcurado.setValorUnitario(produtoAtualizar.getValorUnitario());
        }
    }

}
