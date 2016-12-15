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
public class TarifarioAoSegundo extends Tarifario{
    
    @Override
    public double getPreco(Chamada c) {
        //  custo 1 cêntimo por segundo.
        custo = 0.01;
        return c.getDuracao()*custo;
    }
    
}
