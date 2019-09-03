public class Casa {
    
    //Atributos
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    
    //Métodos
    void pinta(String cor){
        this.cor = cor;
    }
    
    int quantasPortasEstaoAbertas(){
        int qtd = 0;
        if(porta1.estaAberta() || porta2.estaAberta() || porta3.estaAberta()){
            qtd = 1;
        }
        if(porta1.estaAberta() && porta2.estaAberta()){
            qtd = 2;
        }
        if(porta1.estaAberta() && porta3.estaAberta()){
            qtd = 2;
        }
        if(porta2.estaAberta() && porta3.estaAberta()){
            qtd = 2;
        }
        if(porta1.estaAberta() && porta2.estaAberta() && porta3.estaAberta()) {
            qtd = 3;
        }
        return qtd;
    }
    
}
