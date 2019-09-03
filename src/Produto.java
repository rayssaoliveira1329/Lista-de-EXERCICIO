public class Produto {
    
    //Atributos
    double preco;
    String nome;
    
    //Métodos
    void diminuir10 () {
        preco = preco - (preco * 10 / 100);
    }
    
    void aumenta25 () {
        preco = preco + (preco * 25 / 100);
    }
}
