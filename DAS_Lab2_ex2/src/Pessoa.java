public class Pessoa implements IPessoa{
    private String nome;
    private String morada;

//    public Pessoa(String nome, String morada) {
//        this.nome = nome;
//        this.morada = morada;
//    }
    
    public Pessoa(BuilderPessoa builder){
        this.nome = builder.nome;
        this.morada = builder.morada;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }
    
    @Override
    public String toString(){
        return nome+" "+morada;
    }
}
