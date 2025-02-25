/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Juliany
 */
// Clase Ejercicio1
public class Ejercicio1 {
    // atributos privados como me pidieron
    private String nombre;
    private int id;
    private double salario;
    
    // constructor para poner los datos cuando creo el objeto
    public Ejercicio1(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        // uso el setter para validar salario desde el principio
        setSalario(salario);
    }
    
    // getter para nombre
    public String getNombre() {
        return nombre;
    }
    
    // setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // getter para id (no hice setter porque no debe cambiar)
    public int getId() {
        return id;
    }
    
    // getter para salario
    public double getSalario() {
        return salario;
    }
    
    // setter para salario con validacion
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: el salario no puede ser negativo");
            this.salario = 0; // si es negativo lo pongo en 0
        }
    }
    
    // metodo para mostrar los datos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: " + salario);
    }
    
    // main para probar que funcione
    public static void main(String[] args) {
        // hago un objeto para probar
        Ejercicio1 emp1 = new Ejercicio1("Juan Perez", 123, 2500.50);
        emp1.mostrarInformacion(); // muestro los datos
        
        // pruebo poner un salario negativo
        emp1.setSalario(-500);
        emp1.mostrarInformacion(); // muestro otra vez
        
        // cambio el nombre y muestro
        emp1.setNombre("Maria Lopez");
        emp1.mostrarInformacion();
    }
}
