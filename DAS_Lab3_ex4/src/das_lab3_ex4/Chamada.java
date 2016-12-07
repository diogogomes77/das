package das_lab3_ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Chamada {

    private Utilizador utilizador;
    private int origem;
    private int destinatario;
    private ITarifario tarifario;
    private Date data;
    private int duracao;
    private double custo;
    private double iva;

    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    private static List<CampanhaTemplate> campanhas = new ArrayList<CampanhaTemplate>();;

    public int getOrigem() {
        return origem;
    }

    public int getDestinatario() {
        return destinatario;
    }
    
    public static void addCampanha(CampanhaTemplate c){
        campanhas.add(c);
    }
    public static List<CampanhaTemplate> getCampanhas(){
        return campanhas;
    }
    public static Chamada criaChamada(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {
//        campanhas.forEach((action) -> {
//        if (action.criterio(this) return new action());
//    }
        if (duracao / 60 > 10) {
            return new ChamadaPromo10porcento(u, destinatario, data, duracao);
        }
        if (u.getNumsLista().contains(destinatario) && checkPromo(data)) {
            return new ChamadaPromoCusto0(u, destinatario, data, duracao);
        }
        return new ChamadaNormal(u, destinatario, data, duracao);

    }
    public int getDuracao() {
        return duracao;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }
    
    protected Chamada(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {
        this.utilizador = u;
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

    public Date getData() {
        return data;
    }
    
    public double custoChamada() {
        return custo;
    }


}
