/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

/**
 *
 * @author Uniminuto Tibu
 */
public class persona {
    private int id;
    private String nombre;
    private int edad;

    public persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public static persona fromString(String String){
        String[] split = String.split(",");
        return new persona(Integer.parseInt(split[0]),split[1],Integer.parseInt(split[2]));
    }
    
    
    
}
