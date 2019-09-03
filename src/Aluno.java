public class Aluno {
    
    //Atributos
    String cpf;
    Data dataDeNascimento;
    
    //Métodos
    String imprimir (){
        String dados = "CPF: " + cpf + " Data de nascimento: " + dataDeNascimento.imprimir();
        return dados;
    }
}
