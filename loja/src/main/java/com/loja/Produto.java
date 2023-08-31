package com.loja;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double valorUnitario;

    public Produto(int id, String nome, String descricao, double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
