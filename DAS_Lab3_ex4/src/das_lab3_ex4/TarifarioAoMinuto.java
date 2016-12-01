/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_lab3_ex4;

/**
 *
 * @author diogo
 */
public class TarifarioAoMinuto extends Tarifario{
    
    @Override
    public double calculaPreco(int tempoSegundos) {
        //  custo 50 cêntimos por minuto.
        custo = 0.5;
        return tempoSegundos / 60 * custo;
    }
}
