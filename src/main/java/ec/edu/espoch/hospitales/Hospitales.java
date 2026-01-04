
package ec.edu.espoch.hospitales;

import ec.edu.espoch.hospitales.controller.CuentaController;
import ec.edu.espoch.hospitales.model.objetos.Cuenta; //no usada por el momento

public class Hospitales {

    public static void main(String[] args) {
        CuentaController controlador = new CuentaController();
        controlador.cuentaAhorrosController();
    }
}
