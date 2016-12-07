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
    ArrayList<Integer> lista0;
    public Utilizador(Tarifario t, int numero) {
        this.tarifario = t;
        this.numero=numero;
        this.lista0 = new ArrayList<>();
        
    }
    public void addNumLista0(int numero){
        if (lista0.size()<3){
            lista0.add(numero);
        }
    }


    public ArrayList<Integer> getNumsLista(){
        return lista0;
    }

}
