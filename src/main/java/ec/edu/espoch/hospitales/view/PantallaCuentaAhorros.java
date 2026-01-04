package ec.edu.espoch.hospitales.view;

import ec.edu.espoch.hospitales.controller.CuentaController;

/**
 * 
 * @author USUARIO
 */
public class PantallaCuentaAhorros {
    
    private CuentaController controlador;
    
    public PantallaCuentaAhorros(){
        this.controlador= new CuentaAhorros;
    }
    
    public String getId(){
        
        return "1";
    }
    
    public String getSaldo(){
        
        return "20.0";
    }
    
    public void error(){
        System.out.println("Error, comuniquese con el administrador");
    }
    
    public void resultado(float saldoActual){
        System.out.println("Saldo actual: " + );
    }
}
