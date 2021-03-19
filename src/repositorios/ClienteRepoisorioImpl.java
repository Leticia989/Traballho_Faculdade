package repositorios;

public class ClienteRepoisorioImpl implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando cliente");
    }

    @Override
    public void alterar() {
        System.out.println("Alterando cliente");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo cliente");
    }

    @Override
    public void listar() {
        System.out.println("Listar cliente");
    }
}
