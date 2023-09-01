package com.loja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

// diz que ele é um controller, vai receber os dados
@RestController
// define o endpoint
@RequestMapping("/api/loja/produtos")
public class ProdutoController {
    private TabelaProdutos tabelaProdutos;

    public ProdutoController() {
        this.tabelaProdutos = new TabelaProdutos();
    }

    @GetMapping
    public List<Produto> buscarTodosOsProdutosDaLoja() {
        return this.tabelaProdutos.buscarTodosOsProdutos();
    }

    // Coloca entre aspas porque é String (vem da internet), coloca a barra pra deixar mais "bonito"

    @GetMapping("/{produtoId}")
    /**
     * ("Path" é caminho em inglês, "Variable" é variável, então é o caminho da variável)
     * @PathVariable pega a variável (id) e passa pra esse método
     */
    public Produto buscarProdutoPeloIdNaLoja(@PathVariable int produtoId) {
        Produto produtoProcurado = this.tabelaProdutos.buscarProdutoPeloId(produtoId);
        return produtoProcurado;
    }

    // Post acrescenta algo
    @PostMapping
    // RequestBody é porque os dados estão no body (?)
    public Produto cadastrarNovoProdutoNaLoja(@RequestBody Produto dadosNovoProduto) {
        // Salva os dados retornando o produto
        return this.tabelaProdutos.cadastrarNovoProduto(dadosNovoProduto);
    }

}
