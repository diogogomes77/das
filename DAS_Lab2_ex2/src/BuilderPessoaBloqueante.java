
import java.util.logging.Level;
import java.util.logging.Logger;


class BuilderPessoaBloqueante extends BuilderPessoaSimples implements Runnable {

    Thread mythread;
    Pessoa p;
    
    public BuilderPessoaBloqueante() {
      //  super(nome, morada);
        mythread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + mythread);
        mythread.start();
    }
    public Pessoa getPessoa(){
        return p;
    }

    @Override
    public synchronized Pessoa createPessoa(){
        while (nome==null || morada==null) {
            try {
                System.out.println("thread wait" );
                wait();
                System.out.println("thread continue" );
            } catch (InterruptedException ex) {
                Logger.getLogger(BuilderPessoaBloqueante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return new Pessoa(this);
    }
    @Override
    public void run() {
        
        this.p = this.createPessoa();
        System.out.println("mythread run is over");
    }
    @Override
    public synchronized void setNome(String nome) {
        this.nome = nome;
        System.out.println("notify nome" );
        notifyAll();
    }

    @Override
    public synchronized void setMorada(String morada) {
        this.morada = morada;
        System.out.println("notify  morada" );
        notifyAll();
    }
    
    @Override
    public String toString(){
        return p.getNome()+" "+p.getMorada();
    }

}
