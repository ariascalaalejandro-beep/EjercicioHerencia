/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueadero;
import java.time.LocalDateTime;
import java.time.Duration;
/**
 *
 * @author Drakyc AlarkaSG
 */
public abstract class Vehiculo {
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;

    public Vehiculo(LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public long getHorasParqueo() {
        return Duration.between(horaEntrada, horaSalida).toHours();
    }

    public abstract double calcularCosto();

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }
}
