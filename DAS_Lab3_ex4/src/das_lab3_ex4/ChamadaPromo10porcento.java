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
public class ChamadaPromo10porcento extends Chamada {

    public ChamadaPromo10porcento(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {
        super(u, destinatario, data, duracao);
        System.out.println("in 10 porcento");
        this.setTarifario(new TarifarioDecorador10porcento(u.tarifario));
    }

}
