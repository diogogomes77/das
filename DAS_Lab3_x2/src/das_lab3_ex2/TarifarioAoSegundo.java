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
public class TarifarioAoSegundo implements ITarifario{

    double custo;
    
    @Override
    public double calculaPreco(int tempoSegundos) {
        //  custo 1 c�ntimo por segundo.
        custo = 0.01;
        return tempoSegundos*custo;
    }
    
}
