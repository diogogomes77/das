
package das_lab2_builder;

import java.util.concurrent.TimeUnit;

public class DAS_Lab2_Builder {

    public static void main(String[] args) throws InterruptedException {
        
       BuilderPessoaSimples simpleUser = new BuilderPessoaSimples();
       
       simpleUser.setNome("nome1");
       simpleUser.setMorada("morada1");
       
       Pessoa pessoaSimples = simpleUser.createPessoa();
       
       System.out.println(pessoaSimples);
       
       BuilderPessoaBloqueante bloqUser = new BuilderPessoaBloqueante();
       
      // bloqUser.start();
       bloqUser.setNome("nome2");
       
       System.out.println("createPessoa");
       Pessoa pessoa2 = bloqUser.createPessoa();
       System.out.println("inSleep5");
       TimeUnit.SECONDS.sleep(5);
       System.out.println("outSleep");
       bloqUser.setNome("morada2");
       System.out.println(pessoa2);
    }
    
}
