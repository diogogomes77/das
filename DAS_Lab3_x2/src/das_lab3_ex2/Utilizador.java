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
public class Utilizador {
    ITarifario t;

    public Utilizador(ITarifario t) {
        this.t = t;
    }
    public double precoChamada(int tempoSegundos){
        return t.calculaPreco(tempoSegundos);
    }
}
