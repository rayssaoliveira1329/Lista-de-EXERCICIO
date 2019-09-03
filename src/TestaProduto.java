public class TestaProduto {
    
    public static void main(String[] args) {
        
        Produto pd1 = new Produto();
        
        pd1.preco = 100.0;
        pd1.diminuir10();
        
        System.out.println(pd1.preco);
 
        pd1.aumenta25();
        
        System.out.println(pd1.preco);
    }
        
}
