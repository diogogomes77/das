
package das_visitantevisitado;

public class Triangulo extends Figura {

    @Override
    public void aceita(VisitanteFigura v) {
         v.visita(this);
    }

    
}
