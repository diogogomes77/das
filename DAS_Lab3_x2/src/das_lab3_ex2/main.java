
package das_lab3_ex2;


public class main {

    public static void main(String[] args) {
        Utilizador u1 = new Utilizador(new TarifarioAoMinuto());
        Utilizador u2 = new Utilizador(new TarifarioAoSegundo());
        Utilizador u3 = new Utilizador(new TarifarioEspecial());
        
        System.out.println(u1.precoChamada(100));
        System.out.println(u2.precoChamada(100));
        System.out.println(u3.precoChamada(100));
    }
    
}
