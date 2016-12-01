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
    
    public ChamadaPromoCusto0(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {
        super(u, destinatario, data, duracao);
            System.out.println("in custo 0");
            this.setTarifario(new TarifarioDecoradorCusto0(u.tarifario));

    }

}
