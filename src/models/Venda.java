package models;

public class Venda {
    private Double preco;
    private Integer quantidade;


    public Venda(Double preco, Integer quantidade) {
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) { this.preco = preco;

    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
