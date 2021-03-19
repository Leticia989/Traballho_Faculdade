package repositorios;

public class FuncionarioRepositorioImpl implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvar funcionario");
    }

    @Override
    public void alterar() {
        System.out.println("Alterar funcionario");
    }

    @Override
    public void excluir() {
        System.out.println("Excluir funcionario");
    }

    @Override
    public void listar() {
        System.out.println("Listar funcionario");
    }
}
