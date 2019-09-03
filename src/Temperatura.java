public class Temperatura {
    
    //Métodos
    double converterParaCelsius (double tEmF){
        return (tEmF - 32) * 5/9;
    }
            
    double converterParaFarenheit (double tEmC) {
        return (tEmC * 9/5) + 32;
    }
}
