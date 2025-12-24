package ec.edu.espoch.hospitales.model.objetos;

public class CuentaAhorros extends Cuenta {
    
    protected boolean activa; //cuenta activa por defecto
    
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = true; //operación dentro
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    
}