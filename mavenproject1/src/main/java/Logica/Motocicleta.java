/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.time.LocalDateTime;
/**
 *
 * @author Drakyc AlarkaSG
 */

public class Motocicleta extends Vehiculo {
    private String placa;
    private String marca;
    private int cilindraje;

    public Motocicleta(String placa, String marca, int cilindraje,
                       LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        super(horaEntrada, horaSalida);
        this.placa = placa;
        this.marca = marca;
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public double calcularCosto() {
        double base = getHorasParqueo() * 1000;
        if (cilindraje > 500) {
            base += 500;
        }
        return base;
    }
}
