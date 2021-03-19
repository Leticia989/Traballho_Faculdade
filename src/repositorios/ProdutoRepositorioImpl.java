package repositorios;

public class ProdutoRepositorioImpl implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando Produto");
    }

    @Override
    public void alterar() {
        System.out.println("Alterando Produto");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo Produto");
    }

    @Override
    public void listar() { System.out.println("Listar Produto"); }
}
