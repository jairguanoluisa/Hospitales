package ec.edu.espoch.hospitales.model.interfaces;

import ec.edu.espoch.hospitales.model.objetos.CuentaAhorros;

public interface iCuentaAhorros {
    
    public boolean consignar(float cantidad, CuentaAhorros cuentaAhorros);
    public boolean retirar(float cantidad);
    public void extractoMensual();
    public void imprimir();
}
