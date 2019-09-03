public class Porta {
    
    //Atributos
    boolean aberta;
    String cor;
    //Dimensão em metros
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    
    //Métodos
    void abre(){
        this.aberta = true;
    }
    
    void fecha(){
        this.aberta = false;
    }
    
    void pinta(String cor) {
        this.cor = cor;
    }
    
    boolean estaAberta(){
        return aberta;
    }
}
