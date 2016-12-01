
package das_lab2_builder;

public class Pessoa implements IPessoa{
    private String nome;
    private String morada;

    public Pessoa(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
    }
    
    public Pessoa(BuilderPessoa builder){
        this.nome = builder.nome;
        this.morada = builder.morada;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getMorada() {
        return morada;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setMorada(String morada) {
        this.morada = morada;
    }
    
    public String toString(){
        return nome+" "+morada;
    }
}
