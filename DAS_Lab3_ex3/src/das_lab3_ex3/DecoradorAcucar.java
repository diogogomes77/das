/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_lab3_ex3;

/**
 *
 * @author diogo
 */
public class DecoradorAcucar extends Decorador{
    
    public DecoradorAcucar(Bebida b) {
        super(b);
        super.bebidaDecorada.preco = b.preco() + 10;
    }

    
}
