
package das_visitantevisitado;

class Quadrado extends Figura{

    @Override
    public void aceita(VisitanteFigura v) {
         v.visita(this);
    }


    
}
