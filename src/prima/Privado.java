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
public class Privado extends Vehiculo {

    String tipo;

    public Privado(String tipo, String marca, String modelo, int anioFabricacion, double costoMercado) {
        super(marca, modelo, anioFabricacion, costoMercado);
        this.tipo = tipo;
    }

    @Override
    public double calcularPrima(int anioActual) {

        if (tipo.equals("lujo")) {

            double prima = 0;
            prima = costoMercado * 0.5 - (anioActual - anioFabricacion) / 100 * costoMercado;

            prima = prima * 1.12;
            return prima;

        } else {

            double prima = 0;
            prima = costoMercado * 0.5 - (anioActual - anioFabricacion) / 100 * costoMercado;
            
            return prima;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
