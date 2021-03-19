package models;

import java.time.LocalDate;

// Classe é a representação de ulguma coisa do mundo real
// Neste caso está representando uma pessoa.
// Classe abstrata, logo não pode ser instânciada apenas extendida.
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // Método abstrato, deve ser implementado pelas classes filhas
    public abstract void andar();

    public boolean validarCpf() {
        if (this.cpf.length() == 11) {
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
