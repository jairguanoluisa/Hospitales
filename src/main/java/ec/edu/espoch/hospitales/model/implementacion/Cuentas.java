package ec.edu.espoch.hospitales.model.implementacion;

import ec.edu.espoch.hospitales.model.objetos.Cuenta;

public class Cuentas {
    public boolean consignar(float cantidad, Cuenta cuenta) { //a q cuenta va y la cantidad
        //Consignar una cantidad de dinero en la cuenta actualizando su saldo
        
        float nuevoSaldo = cuenta.getSaldo()+cantidad; //obtengo valor de atributo
        cuenta.setSaldo(nuevoSaldo); //y le envio el nuevo saldo
        return true; //retorna el nuevo valor del saldo
    }

    public Cuenta buscar(int id){
        
    }
    
    public boolean agregar(){
        return Cuenta;
    }

    public boolean retirar(float cantidad) {
        return false;
    }

    public void calcularInteres() {
        
    }

    public void extractoMensual() {
        
    }

    public void imprimir() {
        
    }
    
}