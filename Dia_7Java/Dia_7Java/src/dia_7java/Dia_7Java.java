/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia_7java;

/**
 *
 * @author Jhonatan
 */
public class Dia_7Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        coche coche1 = new coche (4,"toyota","fortuner");
        motocicleta motocicleta1= new motocicleta("clubman","harley","z250");
        
        coche1.mostrarDetalles();
        coche1.numeropuertas();
        
        motocicleta1.mostrarDetalles();
        motocicleta1.tipoManubrio();
    }
    
}
