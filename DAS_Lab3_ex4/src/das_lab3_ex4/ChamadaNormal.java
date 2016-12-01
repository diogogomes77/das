
package das_lab3_ex4;

import java.text.ParseException;
import java.util.Date;


public class ChamadaNormal extends Chamada{
    

    public ChamadaNormal(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {
        super(u, destinatario, data, duracao);
        this.tarifario = u.tarifario; 
    }
    
 

    public double custoChamada() {
        return this.custo;
    }
        private boolean checkPromo(Date dataChamada) {
        if (dataChamada.after(promoBegin) && dataChamada.before(promoEnd)) {
            return true;
        }
        return false;
    }
}
