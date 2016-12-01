
package das_lab3_ex4;

import MaxTax.IVA;

public class AdaptadorMaxtax implements Itax{

    @Override
    public double getIva(double total) {
        int cent = (int) total*100;
        IVA iva = new IVA();
        return  (double) (iva.calcIVA(cent)/100);
    }
    
}
