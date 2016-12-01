
package das_lab2_builder;

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
        super.morada = morada;
    }
    
    @Override
    public Pessoa createPessoa(){
        return new Pessoa (nome,morada);
    }
    
        @Override
    public String toString(){
        return nome+" "+morada;
    }
    
}
