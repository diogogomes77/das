
package das_maquinaestados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       MaquinaEstados maquinaEstados = new MaquinaEstados();
       List<Venda>vendas = new ArrayList<>();
       int codEstadoAtual;
       Scanner reader = new Scanner(System.in);  
       String s = new String();
       s="";
       while (!"x".equals(s)){
           codEstadoAtual = maquinaEstados.getEstadoAtual().getCodigoEstado();
           
           System.out.println(maquinaEstados.getEstadoAtual());
           switch (codEstadoAtual) {
               case 1:
                   vendas.add(new Venda());
                   maquinaEstados.setEstadoAtual(maquinaEstados.getEstadoAtual().iniciaVenda());
                   break;
               case 2:
                   break;
               case 3:
                   
                   vendas.forEach((venda)->{
                     System.out.println(venda.toString());
                   });
                   maquinaEstados.setEstadoAtual(maquinaEstados.getEstadoAtual().terminaVenda());
                   break;
           }
           System.out.println(maquinaEstados.getEstadoAtual());
           
           s = reader.next();
           if ("0".equals(s)){
               maquinaEstados.setEstadoAtual(maquinaEstados.getEstadoAtual().terminaVenda());
           }
       }
        
    }
    
}
