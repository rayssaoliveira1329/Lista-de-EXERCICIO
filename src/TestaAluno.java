public class TestaAluno {
    
    public static void main(String[] args) {
        
        //Criando objeto aluno
        Aluno a1 = new Aluno();
        a1.cpf = "00000000000";
        
        //Criando objeto data
        Data d1 = new Data();
        d1.dia = 29;
        d1.mes = 4;
        d1.ano = 1998;
        
        //Atribuindo data de nascimento do aluno
        a1.dataDeNascimento = d1;
        
        //Imprimindo dados do aluno
        System.out.println(a1.imprimir());
        
        
    }
    
}
