import repositorios.ClienteRepoisorioImpl;
import repositorios.FuncionarioRepositorioImpl;
import repositorios.ProdutoRepositorioImpl;
import repositorios.VendaRepositorioImpl;
import telas.TelaCrud;

public class Main {
    public static void main(String[] args) {
        TelaCrud telaCrudFuncionario = new TelaCrud(new FuncionarioRepositorioImpl());
        telaCrudFuncionario.salvar();
        telaCrudFuncionario.alterar();
        telaCrudFuncionario.excluir();
        telaCrudFuncionario.salvar();
        TelaCrud telaCrudCliente = new TelaCrud(new ClienteRepoisorioImpl());
        telaCrudCliente.salvar();
        telaCrudCliente.alterar();
        telaCrudCliente.excluir();
        telaCrudCliente.salvar();
        TelaCrud telaCrudVenda = new TelaCrud(new VendaRepositorioImpl());
        telaCrudVenda.salvar();
        telaCrudVenda.alterar();
        telaCrudVenda.excluir();
        telaCrudVenda.salvar();
        TelaCrud telaCrudProduto = new TelaCrud(new ProdutoRepositorioImpl());
        telaCrudProduto.salvar();
        telaCrudProduto.alterar();
        telaCrudProduto.excluir();
        telaCrudProduto.salvar();
    }
}