/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud;


import static crud.crudTXT.cargarDatos;
import static crud.crudTXT.listarPersonas;
import static crud.crudTXT.listarProductos;
public class CRUD {

   
    public static void main(String[] args) {
        cargarDatos();
        listarPersonas();
        listarProductos();
        
    }
    
}
