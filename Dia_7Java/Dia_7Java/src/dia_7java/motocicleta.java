/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_7java;

/**
 *
 * @author Jhonatan
 */
public class motocicleta extends vehiculos {
    
    private String tipoManubrio;

    public motocicleta() {
    }

    public motocicleta(String tipoManubrio, String marca, String modelo) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void mostrarDetalles() {
          System.out.println("marca :"+getMarca()+"\n"+"modelo :"+getModelo());
    }
    
    public void tipoManubrio(){
        System.out.println("tipo de manubrio: "+tipoManubrio);
    }
    
    
    
    
}
