package das_lab3_ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class  Chamada {

    private Utilizador utilizador;
    private int origem;
    private int destinatario;
    private ITarifario tarifario;
    private Date data;
    private int duracao;
    private double custo;
    private double iva;

    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    private static List<CampanhaTemplateDecorador> campanhas = new ArrayList<CampanhaTemplateDecorador>();

    ;

    public int getOrigem() {
        return origem;
    }

    public int getDestinatario() {
        return destinatario;
    }

    public static void addCampanha(CampanhaTemplateDecorador c) {
        campanhas.add(c);
    }

    public List<CampanhaTemplateDecorador> getCampanhas() {
        return campanhas;
    }

    public static Chamada getChamada(Utilizador u, int destinatario, Date data, int duracao) throws ParseException {

        Chamada c = new Chamada(u, destinatario, data, duracao);
        c.setTarifario(u.tarifario);
        campanhas.forEach((campanha) -> {
            if (campanha.criterio(c)) {
                //cm = new campanha.getTarifario(c.tarifario);
                c.setTarifario(campanha.getCampanha(c.tarifario));
            }

        });
        return c;

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

    protected void setTarifario(ITarifario tarifario) {
        this.tarifario = tarifario;
        custo = tarifario.getPreco(this);
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
