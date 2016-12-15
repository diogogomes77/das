
package das_maquinaestados;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<String> produtos;
    private static int numVenda = 0;
    public Venda() {
        this.produtos= new ArrayList<>();
        Venda.numVenda ++;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void addProduto(String produto) {
        this.produtos.add(produto);
    }
    
    @Override
    public String toString(){
        String out = new String();
        out.concat("Venda numero " + Venda.numVenda);
        produtos.forEach((produto)->out.concat(produto+"\n"));
        return out;
    }
}
