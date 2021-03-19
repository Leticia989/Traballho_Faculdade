package telas;

import repositorios.Repositorio;

public class TelaCrud {

    private final Repositorio repositorio;

    public TelaCrud(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void salvar() {
        this.repositorio.salvar();
    }
    public void alterar() {
        this.repositorio.alterar();
    }
    public void excluir() {
        this.repositorio.excluir();
    }
    public void listar() {
        this.repositorio.listar();
    }
}
