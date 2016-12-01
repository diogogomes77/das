package das_lab3_ex3;

public class main {

    public static void main(String[] args) {
        
        Bebida cafe = new Cafe();
        System.out.println("cafe " + cafe.preco());
        
        cafe = new DecoradorAcucar(cafe);
        System.out.println("+acucar " + cafe.preco());
        
        cafe = new DecoradorAcucar(cafe);
        System.out.println("+acucar " + cafe.preco());
        
        cafe = new DecoradorLeite(cafe);
        System.out.println("+leite " + cafe.preco());
    }
    
}
