/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espoch.hospitales.model.interfaces;

/**
 *
 * @author USUARIO
 */
public interface iCuentaAhorros {
    boolean consignar(float monto);
    boolean retirar(float monto);
    void generarExtracto();
    void mostrarInformacion();
}
