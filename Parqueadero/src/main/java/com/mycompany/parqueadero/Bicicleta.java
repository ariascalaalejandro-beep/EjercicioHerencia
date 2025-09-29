/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueadero;
import java.time.LocalDateTime;
/**
 *
 * @author Drakyc AlarkaSG
 */
public class Bicicleta extends Vehiculo{
     private String tipo; 
    private boolean cambios;

  public Bicicleta(String tipo, boolean cambios,
                 LocalDateTime horaEntrada, LocalDateTime horaSalida) {
    super(horaEntrada, horaSalida);
    this.tipo = tipo;
    this.cambios = cambios;
}

    @Override
    public double calcularCosto() {
        return getHorasParqueo() * 300;
    }

    public String getTipo() {
        return tipo;
    }
}
