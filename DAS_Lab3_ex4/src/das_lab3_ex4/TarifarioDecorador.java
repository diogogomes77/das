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
public abstract class TarifarioDecorador extends Tarifario{
    protected Tarifario tarifario;

    public TarifarioDecorador(Tarifario tarifario) {
        this.tarifario = tarifario;
    }
}