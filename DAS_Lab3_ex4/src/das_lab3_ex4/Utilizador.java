/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_lab3_ex4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diogo
 */
public class Utilizador {
    Tarifario tarifario;
    int numero;
    ArrayList<Integer> amigos;
    public Utilizador(Tarifario t, int numero) {
        this.tarifario = t;
        this.numero=numero;
        this.amigos = new ArrayList<>();
        
    }
    public void addAmigo(int numero){
        if (amigos.size()<3){
            amigos.add(numero);
        }
    }
    public ArrayList<Integer> getAmigos(){
        return amigos;
    }

}
