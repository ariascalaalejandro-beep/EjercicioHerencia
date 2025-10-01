/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Presentacion;

import Logica.Automovil;
import Logica.Motocicleta;
import Logica.Bicicleta;

import java.time.LocalDateTime;
/**
 *
 * @author Drakyc AlarkaSG
 */
public class Parqueadero {

    public static void main(String[] args) {
         
        System.out.println("--- PARQUEADERO UNIVERSITARIO ---");

        Automovil auto = new Automovil("ABC123", "Toyota", "Corolla", 4,
                LocalDateTime.now().minusHours(3), LocalDateTime.now());
        System.out.println("Vehiculo: Automovil | Placa: " + auto.getPlaca() +
                " | Horas: " + auto.getHorasParqueo() + " | Total: $" + auto.calcularCosto());

        Motocicleta moto = new Motocicleta("XYZ987", "Yamaha", 600,
                LocalDateTime.now().minusHours(2), LocalDateTime.now());
        System.out.println("Vehiculo: Motocicleta | Placa: " + moto.getPlaca() +
                " | Horas: " + moto.getHorasParqueo() + " | Total: $" + moto.calcularCosto());

        Bicicleta bici = new Bicicleta("Montaña", true,
                LocalDateTime.now().minusHours(4), LocalDateTime.now());
        System.out.println("Vehiculo: Bicicleta | Tipo: " + bici.getTipo() +
                " | Horas: " + bici.getHorasParqueo() + " | Total: $" + bici.calcularCosto());
    
    }
}
