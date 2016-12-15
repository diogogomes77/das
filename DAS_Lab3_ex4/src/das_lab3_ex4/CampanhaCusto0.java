package das_lab3_ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CampanhaCusto0 extends CampanhaTemplateDecorador {

    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public CampanhaCusto0(Tarifario tarifario) throws ParseException {
        super(tarifario);
        promoBegin = formatter.parse("2016-11-01");
        promoEnd = formatter.parse("2016-12-30");
    }

    CampanhaCusto0() throws ParseException {
        super (null);
        promoBegin = formatter.parse("2016-11-01");
        promoEnd = formatter.parse("2016-12-30");
    }

    @Override
    public boolean criterio(Chamada c) {
        return (c.getUtilizador().getNumsLista().contains(c.getDestinatario()) && checkPromo(c.getData()));
    }
    @Override
    public double getPreco(Chamada c) {
        return 0;
    }
    private boolean checkPromo(Date dataChamada) {
        return dataChamada.after(promoBegin) && dataChamada.before(promoEnd);
    }


}
