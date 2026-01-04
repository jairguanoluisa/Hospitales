package ec.edu.espoch.hospitales.view;

public class PantallaCuentaAhorros {
    
    
    
    public String getId(){    
        return "1";
    }
    
    public String getValor(){
        return "1000";
    }
    
    public void error(){
        System.out.println("Error, comuniquese con el administrador");
    }
    
    public void resultado(float saldoActual){
        System.out.println("Saldo actual: " + saldoActual);
    }
}
