public class TestaPessoa {
    
    public static void main(String[] args) {
        
        //Criando objeto pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "Igor Jeuhan";
        p1.idade = 21;
        
        p1.fazAniversario();
        //Imprimindo dados da pessoa
        System.out.println("Nome: " + p1.nome + " Você fará: " + p1.idade + " anos");
        
        p1.idade = 32;
        p1.fazAniversario();
        //Imprimindo dados da pessoa
        System.out.println("Nome: " + p1.nome + " Você fará: " + p1.idade + " anos");
        
        p1.idade = 51;
        p1.fazAniversario();
        //Imprimindo dados da pessoa
        System.out.println("Nome: " + p1.nome + " Você fará: " + p1.idade + " anos");
   
    }
    
}
