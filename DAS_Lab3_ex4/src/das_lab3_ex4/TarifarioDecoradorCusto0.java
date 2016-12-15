/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_lab3_ex4;

import java.util.Date;

/**
 *
 * @author diogo
 */
public class TarifarioDecoradorCusto0 extends TarifarioDecorador{

    public TarifarioDecoradorCusto0(Tarifario tarifario) {
        super(tarifario);
    }
    @Override
    public double getPreco(Chamada c) {
        //  Os clientes podem escolher 2 números para o qual têm chamadas a custo 0.
        return 0;
    }

    
}
