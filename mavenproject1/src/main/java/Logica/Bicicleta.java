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
public class Bicicleta extends Vehiculo {
    private String tipo;
    private boolean tieneCambios;

    public Bicicleta(String tipo, boolean tieneCambios,
                     LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        super(horaEntrada, horaSalida);
        this.tipo = tipo;
        this.tieneCambios = tieneCambios;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public double calcularCosto() {
        return getHorasParqueo() * 300;
    }
}
