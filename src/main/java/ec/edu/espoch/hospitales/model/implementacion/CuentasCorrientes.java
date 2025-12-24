package ec.edu.espoch.hospitales.model.implementacion;

import ec.edu.espoch.hospitales.model.interfaces.iCuentaCorriente;

public class CuentasCorrientes extends Cuentas implements iCuentaCorriente{
    //CuentasCorrientes hereda de Cuentas y tambien esta clase va hacer implementada en iCuentaCorriente
    
    @Override //sobreescribe el método
    public boolean consignar(float cantidad) {
        return true;
    }

    @Override
    public boolean retirar(float cantidad) {
        return false;
    }

    @Override
    public void extractoMensual() {
        
    }

    @Override
    public void imprimir() {
        
    }
    
}