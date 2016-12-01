
public class RunnableExample {

    public static void main(String args[]) {
        BuilderPessoaBloqueante pbloq = new BuilderPessoaBloqueante();
        Pessoa p;
        try {
            int i = 0;
            //while (pbloq.mythread.isAlive()) {
            
            while ((p=pbloq.getPessoa())==null) {    
                
                System.out.println("Main thread will be alive till the child thread is live " + i);
                Thread.sleep(1500);
                
                switch (i) {
                    case 1:
                        pbloq.setNome("diogo");
                        break;
                    case 5:
                        pbloq.setMorada("pombal");
                        break;
                }
                
                i++;
            }
            System.out.println(p);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
         
    }

}
