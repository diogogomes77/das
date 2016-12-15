
package das_lab3_ex4;

public class Campanha10porcento extends CampanhaTemplateDecorador{

    public Campanha10porcento(Tarifario tarifario) {
        super(tarifario);
    }

    Campanha10porcento() {
        super (null);
    }
    @Override
    public boolean criterio(Chamada c){
        return c.getDuracao() / 60 > 10;
    }  
    @Override
    public double getPreco(Chamada c) {
        double preco = tarifario.getPreco(c);
        preco = preco - preco * 10/100;
        return preco;
    }
}
