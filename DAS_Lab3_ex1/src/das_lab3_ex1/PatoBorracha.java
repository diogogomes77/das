/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_lab3_ex1;

/**
 *
 * @author diogo
 */
public class PatoBorracha extends Pato {

    public PatoBorracha() {
        nome = "Pato de borracha";
        grasnanco = new Grasna();
        voo = new NaoVoa();
        natacao = new Nada();
    }

}
