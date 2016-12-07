
package das_lab3_ex4;

import java.util.Date;

public abstract  class CampanhaTemplate extends TarifarioDecorador{
    protected  Date promoBegin; //= formatter.parse("2016-11-01");
    protected  Date promoEnd; //= formatter.parse("2016-12-30");

    public CampanhaTemplate(Tarifario tarifario) {
        super(tarifario);
    }
    public abstract boolean criterio(Chamada c);
}
