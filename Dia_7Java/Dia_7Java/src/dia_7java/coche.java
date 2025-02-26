/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_7java;

/**
 *
 * @author Jhonatan
 */
public class coche extends vehiculos{
    
    private int numPuertas;

    public coche() {
    }

    public coche(int numPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles() {
        
        System.out.println("marca :"+getMarca()+"\n"+"modelo : "+getModelo());
        
    }
    
    public void numeropuertas(){
        System.out.println("numero de puertas: "+numPuertas);
    
    }

    
   
   
   

    
    
}
