package ec.edu.espoch.hospitales.model.interfaces;

public interface iCuentaAhorros {
    
    public boolean consignar(float cantidad);
    public boolean retirar(float cantidad);
    public void extractoMensual();
    public void imprimir();
}
