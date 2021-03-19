package models;

public class Produto {
    private Double preco;
    private String codigo;
    private String nome;

    public Produto(Double preco, String codigo, String nome) {
        this.preco = preco;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) { this.preco = preco;

    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String endereco) {
        this.nome = nome;
    }
}
