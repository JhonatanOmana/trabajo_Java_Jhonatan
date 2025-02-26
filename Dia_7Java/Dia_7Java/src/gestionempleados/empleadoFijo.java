/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionempleados;

/**
 *
 * @author Usuario
 */
public class empleadoFijo extends empleado {
    
    private int horasTrabajadas;

    public empleadoFijo() {
    }

    public empleadoFijo(int horasTrabajadas, String nombre, double salario) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String calcularbonificacion() {
        
       if (horasTrabajadas>=40){
           
           return "bonificacion empleado fijo : " + getSalario()*0.20;
            
        }else{
           
           return "bonificacion empleado fijo : "+ getSalario()*0.10;
       
       }
        
       
    
    }
    
}
