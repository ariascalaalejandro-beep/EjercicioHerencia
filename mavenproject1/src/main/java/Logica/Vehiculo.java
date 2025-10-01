/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Drakyc AlarkaSG
 */

public abstract class Vehiculo {
    protected LocalDateTime horaEntrada;
    protected LocalDateTime horaSalida;

    public Vehiculo(LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public long getHorasParqueo() {
        return Duration.between(horaEntrada, horaSalida).toHours();
    }

    public abstract double calcularCosto();
}
