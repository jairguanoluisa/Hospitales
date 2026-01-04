package ec.edu.espoch.hospitales.controller;

import ec.edu.espoch.hospitales.model.implementacion.CuentasAhorros;
import ec.edu.espoch.hospitales.model.interfaces.iCuentaAhorros;
import ec.edu.espoch.hospitales.model.objetos.CuentaAhorros;
import ec.edu.espoch.hospitales.view.PantallaCuentaAhorros;

/**
 * conectarse con el controlador (homogenea)
 * crea controlador y crea interface
 */
public class CuentaController {
    private iCuentaAhorros cuentaAhorros; //esta variable voy a utilizar para conectarme
    private PantallaCuentaAhorros pantallaCuentaAhorros;

    public CuentaController() {
        this.cuentaAhorros = new CuentasAhorros();
        this.pantallaCuentaAhorros = new PantallaCuentaAhorros(); //llamar y crear objeto
    }
    
    
    public void cuentaAhorrosController(){
        
        try {
        //CREAR UN OBJETO DE TIPO CUENTA PARA CONSIGNAR
        CuentaAhorros cuenta = new CuentaAhorros(10,5);
        
        //valores que van como parámetros
        float valor = Float.parseFloat(pantallaCuentaAhorros.getValor());
        int id = Integer.parseInt(pantallaCuentaAhorros.getId());
        cuenta.setId(id);//embebido
        boolean respCuenta= cuentaAhorros.consignar(valor,cuenta);
        pantallaCuentaAhorros.resultado(cuenta.getSaldo());
        }catch(Exception e){
            pantallaCuentaAhorros.error();
        }
    }
}
