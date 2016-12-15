
package das_lab3_ex4;

import SuperIVA.IVA;

public class AdaptadorSuperIVA implements Itax{

    @Override
    public double getIva(double total) {
//        int eur = (int) total;
//        int cent = (int) (total-eur);
        String totalS = Double.toString(total);
        String eurS = totalS.split("\\.")[0];
        String centS = totalS.split("\\.")[1];
        int eur= Integer.parseInt(eurS);
        int cent= Integer.parseInt(centS);
       
        IVA iva = new IVA();
        return  (double) (iva.getTotalWithTax(eur,cent)/100);
    }
    
}
