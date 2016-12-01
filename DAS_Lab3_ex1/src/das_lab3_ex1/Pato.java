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
public abstract class Pato {

    protected EGrasnanco grasnanco;
    protected EVoo voo;
    protected ENatacao natacao;
    protected String nome;
    
    void voa() {
        System.out.println("Este " + nome + " " + voo.voa());
    }
    void nada() {
        System.out.println("Este " + nome + " " + natacao.nada());
    }
    void grasna() {
        System.out.println("Este " + nome + " " + grasnanco.grasna());
    }
}
