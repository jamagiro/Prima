/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prima;

import java.util.ArrayList;

/**
 *
 * @author consultor05
 */
public class Cliente {

    String nombre;
    String apellido;
    int dni;
    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    
    
    
    public double calcularTotalaPagar(int anioActual) {

        double suma = 0;

        for (int i = 0; i < listaVehiculos.size(); i++) {
            suma += listaVehiculos.get(i).calcularPrima(anioActual);
        }
        return suma;
    }

    public void agregarVehiculos (Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

}
