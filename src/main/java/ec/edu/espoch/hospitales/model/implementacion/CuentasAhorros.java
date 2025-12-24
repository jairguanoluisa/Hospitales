package ec.edu.espoch.hospitales.model.implementacion;

import ec.edu.espoch.hospitales.model.interfaces.iCuentaAhorros;

public class CuentasAhorros extends Cuentas implements iCuentaAhorros{
    
    @Override //sobreescribe el método
    public boolean consignar(float cantidad) {
        //se puede consignar dinero si la cuenta está activa.
        //Debe invocar al método heredado.
        boolean resp=false;
        /*if (activa){
            resp=super.consignar(cantidad);
        }*/
        return resp;
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