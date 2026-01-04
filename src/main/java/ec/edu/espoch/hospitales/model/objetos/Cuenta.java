package ec.edu.espoch.hospitales.model.objetos;

public class Cuenta {
    private int id;
    private float saldo;
    private int consignaciones = 0;
    private int retiros = 0;
    private float tasaAnual;
    private float comisionMensual = 0;
    
    //CONSTRUCTORES
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        this.id=this.id+1;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getConsignaciones() {
        return consignaciones;
    }

    public void setConsignaciones(int consignaciones) {
        this.consignaciones = consignaciones;
    }

    public int getRetiros() {
        return retiros;
    }

    public void setRetiros(int retiros) {
        this.retiros = retiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
}