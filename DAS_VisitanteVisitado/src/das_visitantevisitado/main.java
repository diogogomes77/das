
package das_visitantevisitado;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        VisitanteFigura c =  new Colorir();
        
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Triangulo());
        figuras.add(new Quadrado());
        figuras.add(new Circulo());
        
        figuras.forEach((figura)->figura.aceita(c));
        figuras.forEach((figura)->
                System.out.println(figura.getClass().getName()+" "+figura.getColor()));

    }
    
}
