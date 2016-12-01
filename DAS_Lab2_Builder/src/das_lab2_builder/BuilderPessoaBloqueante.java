package das_lab2_builder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class BuilderPessoaBloqueante extends BuilderPessoaSimples implements Runnable {


    Thread thread;// = new Thread();
    Pessoa p;
    
    @Override
    public synchronized void run() {
        System.out.println("thread RUN" );
        while (nome==null || morada==null) {
            try {
                System.out.println("thread wait" );
                wait();
                System.out.println("thread continue" );
            } catch (InterruptedException ex) {
                Logger.getLogger(BuilderPessoaBloqueante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.p = new Pessoa (nome,morada);
       
    }
    
    @Override
    public synchronized void setNome(String nome) {
        this.nome = nome;
        System.out.println("thread  nome" );
        notifyAll();
    }

    @Override
    public synchronized void setMorada(String morada) {
        this.morada = morada;
        System.out.println("thread  morada" );
        notifyAll();
    }
    @Override
    public synchronized Pessoa createPessoa(){
        //this.run();
        this.start();
        try {
            
            System.out.println("insleep5" );
            TimeUnit.SECONDS.sleep(5);
            System.out.println("outsleep5" );
         
        } catch (InterruptedException ex) {
            Logger.getLogger(BuilderPessoaBloqueante.class.getName()).log(Level.SEVERE, null, ex);
        }
          this.setMorada("cenas");
        while (p==null){
            System.out.println("null p");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(BuilderPessoaBloqueante.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("return p");
        return p;
    }
    public void start () {
      
      if (thread == null) {
         thread = new Thread (this);
         System.out.println("Starting thread" );
         thread.start ();
         System.out.println("Started thread" );
      }
   }
}
