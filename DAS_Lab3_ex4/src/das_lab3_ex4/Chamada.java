package das_lab3_ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Chamada {

    protected int origem;
    protected int destinatario;
    protected ITarifario tarifario;
    protected Date data;
    protected int duracao;
    protected double custo;
    protected double iva;
    private Date promoBegin; //= formatter.parse("2016-11-01");
    private Date promoEnd; //= formatter.parse("2016-12-30");
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public Chamada criaChamada(Utilizador u, int destinatario, Date data, int duracao) {
        if (duracao / 60 > 10) {
            System.out.println("in 10porcento");
            return new ChamadaPromo10porcento(Utilizador u, int destinatario, Date data, int duracao);
        }
        if (u.getAmigos().contains(destinatario) && checkPromo(data)) {
            return new ChamadaPromoCusto0(Utilizador u, int destinatario, Date data, int duracao);
        } 
             
        return new ChamadaNormal(Utilizador u, int destinatario, Date data, int duracao;
             
        
    }

    protected Chamada(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {
        this.promoBegin = formatter.parse("2016-11-01");
        this.promoEnd = formatter.parse("2016-12-30");
        this.data = data;
        this.duracao = duracao;
        this.origem = u.numero;
        this.destinatario = destinatario;

        this.custo = tarifario.calculaPreco(duracao);
        //Itax adaptadorIva = new AdaptadorMaxtax();
        Itax adaptadorIva = new AdaptadorSuperIVA();
        this.iva = adaptadorIva.getIva(this.custo);
    }

    public double getIva() {
        return this.iva;
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