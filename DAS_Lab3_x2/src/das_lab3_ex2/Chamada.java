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
public class Chamada {
    int duracao;
    int destinatario;
    ITarifario tarifario;
    
    public double custoChamada(int duracao){
        this.duracao = duracao;
        return tarifario.calculaPreco(duracao);
    }
}
