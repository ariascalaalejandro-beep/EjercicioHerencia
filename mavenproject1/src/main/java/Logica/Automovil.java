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
public class Automovil extends Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int puertas;

    public Automovil(String placa, String marca, String modelo, int puertas,
                     LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        super(horaEntrada, horaSalida);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public double calcularCosto() {
        return getHorasParqueo() * 2000;
    }
}
