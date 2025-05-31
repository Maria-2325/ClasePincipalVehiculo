
package com.mycompany.claseprincipalvehiculo;

import com.mycompany.claseprincipalvehiculo.Enumeraciones.*;
import com.mycompany.claseprincipalvehiculo.VehiculoClase.Automovil;
public class ClasePrincipalVehiculo {

    public static void main(String[] args) {
        System.out.println("\n\t----------BIENVENIDOS AL PROGRAMA DE VEHICUlO LICET IBARRA Y WILLIAM -----------------");
        Automovil objAutomovil = new Automovil("Chevrolet", 2023, 4d, TipoCombustible.GASOLINA, TipoAutomovil.SUV, 2, 4, 200, Color.NEGRO, 100);
        System.out.println();
        objAutomovil.imprimir();
        System.out.println();
        System.out.println("------ACTIVIDADES DEL AUTOMOVIL-----");
        System.out.println("La velocidad actual es: " + objAutomovil.getVelocidadActual() + " km/h");
        System.out.println("El carro ha acelerado a: " + objAutomovil.acelerar(20) + " km/h"); 
        System.out.println("El carro ha desacelerado a: " + objAutomovil.desacelerar(50) + " km/h");
        System.out.println("Tiempo de llegada del Automovil: " + objAutomovil.calcularTiempo(10d)+ " h");
        objAutomovil.frenar();
        System.out.println("El carro ha frenado a: " + objAutomovil.getVelocidadActual() + " km/h"); 
    }
}