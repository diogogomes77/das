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
public class TarifarioEspecial implements ITarifario{

    private double custo;
    @Override
    public double calculaPreco(int duracao) {
        this.custo = 0.60;
        //int duracao = chamada.duracao;
      // primeiros 20 segundos gr�tis, 60 c�ntimos por minuto a partir da�.
      if (duracao>19){
          duracao = duracao-20;
      }
      return duracao/60*custo;
    }
    
}
