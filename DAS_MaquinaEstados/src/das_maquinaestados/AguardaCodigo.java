package das_maquinaestados;

public class AguardaCodigo implements Estado {

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
        return new TerminaVenda();
    }

    @Override
    public String toString(){
        return "Aguarda Codigo (0 para sair)";
    }

    @Override
    public int getCodigoEstado() {
        return 2;
    }
}
