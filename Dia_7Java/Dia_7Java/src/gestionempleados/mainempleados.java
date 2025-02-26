/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionempleados;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class mainempleados {
    
    
    public static void main (String []args){
    
     empleadoFijo emple1 = new empleadoFijo (45,"pedro",200000);
     empleadoHoras emple2 = new empleadoHoras(50,"pedrito",500000);
     
     
     
    ArrayList<empleado>empleado =new ArrayList<>();
    
    empleado.add(emple1);
    empleado.add(emple2);
    
    
    for(empleado i:empleado){
    
        System.out.println(i.calcularbonificacion());
    
    }
    
    
    }
    
    
    
    
    
}
