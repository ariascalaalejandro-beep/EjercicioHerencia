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
public class Automovil extends Vehiculo {
       private String placa;
    private String marca;
    private String modelo;
    private int numeroPuertas;

    public Automovil(String placa, String marca, String modelo, int numeroPuertas,
                     LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        super(horaEntrada, horaSalida);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularCosto() {
        return getHorasParqueo() * 2000;
    }

    public String getPlaca() {
        return placa;
    }
}
