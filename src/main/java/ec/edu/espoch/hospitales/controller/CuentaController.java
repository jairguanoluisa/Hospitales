package ec.edu.espoch.hospitales.controller;

import ec.edu.espoch.hospitales.model.interfaces.iCuentaAhorros;
import ec.edu.espoch.hospitales.model.objetos.CuentaAhorros;

/**
 * conectarse con el controlador (homogenea)
 * crea controlador y crea interface
 */
public class CuentaController {
    private iCuentaAhorros cuentaAhorros; //esta variable voy a utilizar para conectarme

    public CuentaController(iCuentaAhorros cuentaAhorros) {
        this.cuentaAhorros = cuentaAhorros;
    }
    
    
    public void cuentaAhorrosController(){
        
        try {
        //CREAR UN OBJETO DE TIPO CUENTA PARA CONSIGNAR
        CuentaAhorros cuenta = new CuentaAhorros(10,5);
        //valores que van como parámetros
        float valor=10.0F;
        int id=1;
        cuenta.setId(id);//embebido
        boolean respCuenta= cuentaAhorros.consignar(valor,cuenta);
        System.out.println("El resultado de la transacció es: " + respCuenta);
        System.out.println("El saldo actual es: " + cuenta.getSaldo());
        }catch(Exception e){
            pantalla.error();
        }
    }
}
