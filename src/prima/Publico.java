/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prima;

/**
 *
 * @author consultor05
 */
public class Publico extends Vehiculo {

    String placa;
    int cantidadDePasajeros;

    public Publico(String placa, int cantidadDePasajeros, String marca, String modelo, int anioFabricacion, double costoMercado) {
        super(marca, modelo, anioFabricacion, costoMercado);
        this.placa = placa;
        this.cantidadDePasajeros = cantidadDePasajeros;

    }

    @Override
    public double calcularPrima(int anioActual) {

        double prima = 0;
        prima = costoMercado * 1.15 / 2.25 - (anioActual - anioFabricacion) / 100 * costoMercado;

        return prima;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    public void setCantidadDePasajeros(int cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

}
