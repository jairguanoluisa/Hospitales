package ec.edu.espoch.hospitales.model.objetos;

public class CuentaCorriente extends Cuenta {
    
    protected float sobregiro = 0;
    
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }
    
    
}