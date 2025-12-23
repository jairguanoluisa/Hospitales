/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospitales.model.implementacion;

public class Cuentas {
    public boolean consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            consignaciones++;
            return true;
        }
        return false;
    }

    public boolean retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            retiros++;
            return true;
        }
        return false;
    }

    public void calcularInteresMensual() {
        float interesMensual = (tasaAnual / 12) * saldo / 100;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    public void imprimir() {
        System.out.println("----- CUENTA -----");
        System.out.println("Saldo: " + saldo);
        System.out.println("Consignaciones: " + consignaciones);
        System.out.println("Retiros: " + retiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión mensual: " + comisionMensual);
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", consignaciones=" + consignaciones + ", retiros=" + retiros + ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + '}';
    }
}