/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_lab3_ex2;

/**
 *
 * @author diogo
 */
public class TarifarioAoMinuto implements ITarifario{

    double custo;
    @Override
    public double calculaPreco(int tempoSegundos) {
        //  custo 50 c�ntimos por minuto.
        custo = 0.5;
        return tempoSegundos/60*custo;
    }
    
}
