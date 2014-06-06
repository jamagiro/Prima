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
public abstract class Vehiculo {
    
    protected String marca;
    protected String modelo;
    protected int anioFabricacion;
    protected double costoMercado;

    public Vehiculo(String marca, String modelo, int anioFabricacion, double costoMercado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.costoMercado = costoMercado;
    }

    public abstract double calcularPrima (int anioActual);
          
       
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getCostoMercado() {
        return costoMercado;
    }

    public void setCostoMercado(double costoMercado) {
        this.costoMercado = costoMercado;
    }
    
    
}
