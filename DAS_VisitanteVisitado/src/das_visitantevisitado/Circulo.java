
package das_visitantevisitado;

class Circulo extends Figura{

    @Override
    public void aceita(VisitanteFigura v) {
        v.visita(this);
    }



}
