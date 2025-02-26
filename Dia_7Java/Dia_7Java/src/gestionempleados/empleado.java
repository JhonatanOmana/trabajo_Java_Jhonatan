/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionempleados;

/**
 *
 * @author Usuario
 */
public class empleado {
    
    private String nombre;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
    
    
    
    public empleado() {
    }

    public empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    
    public String calcularbonificacion(){
    
        return "bonificacion de empleado : "+ getSalario()*0.10;
    }
    
}
