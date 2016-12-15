package das_maquinaestados;

public class NovaVenda implements Estado {

    private Venda venda ;
    @Override
    public Estado iniciaVenda() {
        venda = new Venda();
        return new AguardaCodigo();
    }

    public Venda getVenda() {
        return venda;
    }

    @Override
    public Estado introduzCodigo(String codigo) {
        return this;
    }

    @Override
    public Estado terminaVenda() {
        return this;
    }
@Override
    public String toString(){
        return "Nova Venda";
    }

    @Override
    public int getCodigoEstado() {
        return 1; 
    }
    
}
