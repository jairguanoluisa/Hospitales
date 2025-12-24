package ec.edu.espoch.hospitales.model.interfaces;

public interface iCuentaCorriente {
    
    public boolean consignar(float cantidad);
    public boolean retirar(float cantidad);
    public void extractoMensual();
    public void imprimir();
}
