package models;

public class Cliente extends Pessoa {

    private double limiteDeCredito;

    public Cliente(double limiteDeCredito, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.limiteDeCredito = limiteDeCredito;
    }

    @Override
    public void andar() {
        System.out.println("Anda com paciência, pois está fazendo suas compras");
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }
}
