public class BuilderPessoaSimples extends BuilderPessoa {

    
    
    public BuilderPessoaSimples() {
    }


    public BuilderPessoaSimples(String nome, String morada) {
        super.nome = nome;
        super.morada = morada;
    }
    public BuilderPessoaSimples nome(String nome){
        super.nome=nome;
        return this;
    }
    public BuilderPessoaSimples morada(String morada){
        super.morada=morada;
        return this;
    }
    
//    //@Override
//    public String getNome() {
//        return nome;
//    }
//
//    //@Override
//    public String getMorada() {
//        return morada;
//    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        super.morada = morada;
    }
    
    @Override
    public Pessoa createPessoa(){
        return new Pessoa (this);
    }

    
}
