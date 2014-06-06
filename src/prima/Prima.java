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
public class Prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente = new Cliente("Janina", "Giraldo", 47834622);
        
        Privado privado = new Privado("lujo", "BMW", "X6", 2012, 80000);
        Publico publico = new Publico("ABC123", 30, "Modasa", "M5", 2010, 60000);
        
        cliente.agregarVehiculos(privado);
        cliente.agregarVehiculos(publico);
        
        
        double totalApagar = 0;
        totalApagar = cliente.calcularTotalaPagar(2014);
        

        System.out.println("Total a pagar: " + totalApagar);
        
    }
    
    
}
