/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author Juliany
 */
// Clase Ejercicio2 (Producto)
public class Ejercicio2 {
    // atributos privados como dice el ejercicio
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    
    // constructor para poner todos los datos
    public Ejercicio2(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        setCantidad(cantidad); // uso setters para validar desde el inicio
        setPrecio(precio);
    }
    
    // getter para codigo
    public String getCodigo() {
        return codigo;
    }
    
    // setter para codigo
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    // getter para nombre
    public String getNombre() {
        return nombre;
    }
    
    // setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // getter para cantidad
    public int getCantidad() {
        return cantidad;
    }
    
    // setter para cantidad con validacion
    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: la cantidad no puede ser negativa");
            this.cantidad = 0; // si es negativa la pongo en 0
        }
    }
    
    // getter para precio
    public double getPrecio() {
        return precio;
    }
    
    // setter para precio con validacion
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: el precio debe ser mayor a 0");
            this.precio = 1; // pongo 1 si intentan poner 0 o negativo
        }
    }
    
    // metodo para actualizar el stock
    public void actualizarStock(int cantidad) {
        int nuevoStock = this.cantidad + cantidad; // sumo o resto segun el numero
        if (nuevoStock >= 0) {
            this.cantidad = nuevoStock;
            System.out.println("Stock actualizado. Nueva cantidad: " + this.cantidad);
        } else {
            System.out.println("Error: no hay suficiente stock para restar " + (-cantidad));
        }
    }
    
    // metodo para mostrar info del producto
    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
        System.out.println("-------------------");
    }
}
