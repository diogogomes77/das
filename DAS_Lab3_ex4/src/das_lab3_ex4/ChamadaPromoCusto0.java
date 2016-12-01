/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_lab3_ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author diogo
 */
public class ChamadaPromoCusto0 extends Chamada{
    
    //private Date utilDate = formatter.parse(year + "/" + month);
    private Date promoBegin; //= formatter.parse("2016-11-01");
    private Date promoEnd; //= formatter.parse("2016-12-30");
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public ChamadaPromoCusto0(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {
        super(u, destinatario, data, duracao);
        this.promoBegin = formatter.parse("2016-11-01");
        this.promoEnd = formatter.parse("2016-12-30");
         if (u.getAmigos().contains(destinatario) && checkPromo(data)) {
            System.out.println("in custo 0");
            this.tarifario = new TarifarioDecoradorCusto0(u.tarifario);
        }
        
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
