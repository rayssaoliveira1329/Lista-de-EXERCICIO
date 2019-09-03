public class MainTemperatura {
    
    public static void main(String[] args) {
        
        Temperatura t1 = new Temperatura();
        
        double tConvertidaEmC = t1.converterParaCelsius(32);
        System.out.println(tConvertidaEmC);
        
        double tConvertidaEmF = t1.converterParaFarenheit(0);
        System.out.println(tConvertidaEmF);
        
    }
}
