
package das_maquinaestados;

public class MaquinaEstados {
    
    private Estado estadoAtual;
    
    private Estado novaVenda;
    private Estado aguardaCodigo;
    private Estado terminaVenda;

    public Estado getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(Estado estadoAtual) {
        this.estadoAtual = estadoAtual;
    }


    public MaquinaEstados() {
         this.estadoAtual = new NovaVenda();
    }
    
    
}
