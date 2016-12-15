package das_maquinaestados;

public class TerminaVenda implements Estado {

    @Override
    public Estado iniciaVenda() {
        return this;
    }

    @Override
    public Estado introduzCodigo(String codigo) {
        return this;
    }

    @Override
    public Estado terminaVenda() {
        return new NovaVenda();
    }
@Override
    public String toString(){
        return "Venda Terminada (x para sair)";
    }

    @Override
    public int getCodigoEstado() {
        return 3;
    }
}
