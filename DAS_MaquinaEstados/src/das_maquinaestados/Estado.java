
package das_maquinaestados;

public interface Estado {
       
     public Estado iniciaVenda();
    
     public Estado introduzCodigo(String codigo);

     public Estado terminaVenda();
   
     public int getCodigoEstado();
     @Override
     public String toString();
}
