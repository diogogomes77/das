
package das_lab3_ex4;

import java.util.Date;

public abstract  class CampanhaTemplateDecorador implements ITarifario{
    protected  Date promoBegin; //= formatter.parse("2016-11-01");
    protected  Date promoEnd; //= formatter.parse("2016-12-30");

    protected ITarifario tarifario;

    public CampanhaTemplateDecorador(Tarifario tarifario) {
       this.tarifario = tarifario;
    }
    public abstract boolean criterio(Chamada c);
    
    public CampanhaTemplateDecorador getCampanha(ITarifario t){
        tarifario = t;
        return this;
    }
}
