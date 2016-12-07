package das_lab3_ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CampanhaCusto0 extends CampanhaTemplate {

    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public CampanhaCusto0(Tarifario tarifario) throws ParseException {
        super(tarifario);
        promoBegin = formatter.parse("2016-11-01");
        promoEnd = formatter.parse("2016-12-30");
    }

    @Override
    public boolean criterio(Chamada c) {
        return (c.getUtilizador().getNumsLista().contains(c.getDestinatario()) && checkPromo(c.getData()));
    }

    private boolean checkPromo(Date dataChamada) {
        return dataChamada.after(promoBegin) && dataChamada.before(promoEnd);
    }

    @Override
    public double calculaPreco(int tempoSegundos) {
        return 0;
    }
}
