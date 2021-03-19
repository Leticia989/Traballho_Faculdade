package models;

public class Funcionario extends Pessoa{

    // Encapsulamento
    private double salario;

    public Funcionario(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }

    /// Exemplo de encapsulamento, ou seja, comportamentos e atributos internos de uma
    // classe devem ser PRIVADOS apenas para acesso da própria classe.
    private void colocarCracha() {
        System.out.println("Colocar cracha");
    }

    @Override
    public void andar() {
        // posso acessar aqui, pois estou dentro da minha classe
        this.colocarCracha();
        System.out.println("Anda rápido, pois está trabalhando!");
    }
}
