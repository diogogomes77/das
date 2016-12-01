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
abstract class Decorador extends Bebida {
    Bebida bebidaDecorada;
    public Decorador(Bebida b) {
        bebidaDecorada = b;
        
    }
    @Override
    public int preco(){
        return bebidaDecorada.preco;
                
    }
}
