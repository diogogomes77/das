package das_lab3_ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Chamada {

    private int origem;
    private int destinatario;
    private ITarifario tarifario;
    private Date data;
    private int duracao;
    private double custo;
    private double iva;
    private static Date promoBegin; //= formatter.parse("2016-11-01");
    private static Date promoEnd; //= formatter.parse("2016-12-30");
    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public static Chamada criaChamada(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {
        if (duracao / 60 > 10) {
            return new ChamadaPromo10porcento(u, destinatario, data, duracao);
        }
        if (u.getAmigos().contains(destinatario) && checkPromo(data)) {
            return new ChamadaPromoCusto0(u, destinatario, data, duracao);
        }
        return new ChamadaNormal(u, destinatario, data, duracao);

    }

    protected Chamada(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {
        Chamada.promoBegin = formatter.parse("2016-11-01");
        Chamada.promoEnd = formatter.parse("2016-12-30");
        this.data = data;
        this.duracao = duracao;
        this.origem = u.numero;
        this.destinatario = destinatario;
    }

    public double getIva() {
        return this.iva;
    }
    protected void setTarifario(ITarifario tarifario){
        this.tarifario = tarifario;
        custo = tarifario.calculaPreco(duracao);
        //Itax adaptadorIva = new AdaptadorMaxtax();
        Itax adaptadorIva = new AdaptadorSuperIVA();
        iva = adaptadorIva.getIva(custo);
    }
    
    public double custoChamada() {
        return custo;
    }

    private static boolean checkPromo(Date dataChamada) {
        return dataChamada.after(promoBegin) && dataChamada.before(promoEnd);
    }
}
