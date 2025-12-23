/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospitales.model.implementacion;

import ec.edu.espoch.hospitales.model.interfaces.iCuentaCorriente;

public class CuentasCorrientes implemets iCuentasCorrientes{
    
    @Override //sobreescribir
    public boolean retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            sobregiro += (cantidad - saldo);
            saldo = 0; //Y PORQUE CERO??
        }
        retiros++;
        return true;
    }

    @Override
    public boolean consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
                return true;
            }
        }
        return super.consignar(cantidad);
    }

    @Override
    public void imprimir() {
        System.out.println("=== CUENTA CORRIENTE ===");
        super.imprimir();
        System.out.println("Sobregiro: " + sobregiro);
    }
    
    @Override
    public String toString() {
        return "CuentaCorriente{" + super.toString() + "sobregiro=" + sobregiro + '}';
    }
}
