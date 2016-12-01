/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperIVA;

/**
 *
 * @author diogo
 */
public class IVA {
     public int getTotalWithTax(int euro, int centimos){
         String totalS = Integer.toString(euro) + "."+ Integer.toString(centimos);
         //System.out.println("totalS->"+totalS);
         double total = Double.parseDouble(totalS);
        // System.out.println("total->"+total);
         Double iva = total * 0.23 *100;
          int cent = iva.intValue();
         return cent;
     }
}
