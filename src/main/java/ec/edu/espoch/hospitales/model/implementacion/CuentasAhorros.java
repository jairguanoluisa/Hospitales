/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospitales.model.implementacion;

import ec.edu.espoch.hospitales.model.interfaces.iCuentaAhorros;

public class CuentasAhorros implements iCuentasAhorros{
    
    @Override //sobreescribir
    public boolean consignar(float cantidad) {
        if (activa) {
            return super.consignar(cantidad);
        } else {
            System.out.println("Cuenta INACTIVA — no se puede consignar.");
            return false;
        }
    }
    
    @Override
    public boolean retirar(float cantidad) {
        if (activa) {
            return super.retirar(cantidad);
        } else {
            System.out.println("Cuenta INACTIVA — no se puede retirar.");
            return false;
        }
    }

    @Override
    public void extractoMensual() {
        if (retiros > 4) {
            comisionMensual += (retiros - 4) * 1000;
        }

        super.extractoMensual();
        activa = saldo >= 10000; // se recalcula
    }

    @Override
    public void imprimir() {
        System.out.println("=== CUENTA DE AHORROS ===");
        super.imprimir();
        System.out.println("Cuenta activa: " + activa);
        System.out.println("Transacciones totales: " + (consignaciones + retiros));
    }
    
    @Override
    public String toString() {
        return "CuentaAhorros{" + super.toString() + "activa=" + activa + '}';
    }
}
