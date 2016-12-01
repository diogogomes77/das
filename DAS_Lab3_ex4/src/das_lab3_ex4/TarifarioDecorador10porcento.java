
package das_lab3_ex4;


public class TarifarioDecorador10porcento extends TarifarioDecorador {

    public TarifarioDecorador10porcento(Tarifario tarifario) {
        super(tarifario);
        double custoDecorado = super.tarifario.custo - (super.tarifario.custo * 10/100);
        super.tarifario.custo = custoDecorado;
    }
    @Override
    public double calculaPreco(int tempoSegundos) {
        //  O custo é reduzido em 10% para chamadas superiores a 10 minutos, independentemente do tarifário.
        double preco = tarifario.calculaPreco(tempoSegundos);
        if (tempoSegundos/60>10){
            preco = preco - preco * 10/100;
        }
        return preco;
    }
}
