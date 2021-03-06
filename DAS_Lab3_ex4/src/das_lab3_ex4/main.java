
package das_lab3_ex4;

import java.text.ParseException;
import java.util.Date;


public class main {

    public static void main(String[] args) throws ParseException {
        Utilizador u1 = new Utilizador(new TarifarioAoMinuto(),123);       
        Utilizador u2 = new Utilizador(new TarifarioAoSegundo(),124);
        Utilizador u3 = new Utilizador(new TarifarioEspecial(),125);
       
        Chamada.addCampanha(new Campanha10porcento());
        Chamada.addCampanha(new CampanhaCusto0());
        
        Chamada c1;
        c1 = Chamada.getChamada(u1,u3.numero,new Date(),100);
        System.out.println("c1 " + c1.custoChamada()+ " iva= " + c1.getIva());
        Chamada c2 = Chamada.getChamada(u2,u1.numero,new Date(),100);
        System.out.println("c2 " + c2.custoChamada()+ " iva= " + c2.getIva());
        Chamada c3 = Chamada.getChamada(u3,u2.numero,new Date(),100);
        System.out.println("c3 " + c3.custoChamada() + " iva= " + c3.getIva());

        u1.addNumLista0(u2.numero);
        
        
        Chamada c4 = Chamada.getChamada(u1,u2.numero,new Date(),100);
        System.out.println("c4 " + c4.custoChamada()+ " iva= " + c4.getIva());
        
        Chamada c5 = Chamada.getChamada(u1,u3.numero,new Date(),60*20); 
        System.out.println("c5 " + c5.custoChamada()+ " iva= " + c5.getIva());
    }
    
}
