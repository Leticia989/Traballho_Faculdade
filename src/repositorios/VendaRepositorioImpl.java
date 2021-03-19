package repositorios;

public class VendaRepositorioImpl implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando Venda");
    }

    @Override
    public void alterar() {
        System.out.println("Alterando Venda");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo venda");
    }

    @Override
    public void listar() {
        System.out.println("Listar venda");
    }
}
