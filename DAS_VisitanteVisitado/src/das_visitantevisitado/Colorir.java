
package das_visitantevisitado;

class Colorir implements VisitanteFigura{

    @Override
    public void visita(Triangulo t) {
        t.setColor("red");
    }

    @Override
    public void visita(Quadrado q) {
        q.setColor("green");
    }

    @Override
    public void visita(Circulo c) {
        c.setColor("blue");
    }
    
}
