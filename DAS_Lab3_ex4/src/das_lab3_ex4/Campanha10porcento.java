
package das_lab3_ex4;

public class Campanha10porcento extends CampanhaTemplate{

    public Campanha10porcento(Tarifario tarifario) {
        super(tarifario);
    }

    @Override
    public boolean criterio(Chamada c){
        return c.getDuracao() / 60 > 10;
    }  

    @Override
    public double calculaPreco(int tempoSegundos) {
        double preco = tarifario.calculaPreco(tempoSegundos);
        preco = preco - preco * 10/100;
        return preco;
    }
}
