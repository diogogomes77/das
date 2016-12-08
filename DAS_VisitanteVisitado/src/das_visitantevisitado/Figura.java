
package das_visitantevisitado;

abstract class Figura implements Visitado{

    private String color;
    
    @Override
    abstract public void aceita(VisitanteFigura v);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
