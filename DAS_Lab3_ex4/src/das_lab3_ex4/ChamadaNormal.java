
package das_lab3_ex4;

import java.text.ParseException;
import java.util.Date;


public class ChamadaNormal extends Chamada{
    

    public ChamadaNormal(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {
        super(u, destinatario, data, duracao);
        this.setTarifario(u.tarifario); 
    }
    

}
