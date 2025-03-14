/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Uniminuto Tibu
 */
public class crudTXT {
    private static String archivo = "./src/CRUD/data.txt";
    private static List<persona> personas = new ArrayList<>();
    private static List<producto> productos = new ArrayList<>();
    
    public static void cargarDatos(){
        personas.clear();
        productos.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea=reader.readLine())!=null){
                if(linea.startsWith("P,")){
                    personas.add(persona.fromString(linea));
                } else if (linea.startsWith("PR,")){
                    productos.add(producto.fromString(linea));
                }
            }
        }
        catch (Exception e){
            System.out.println("No se puede cargar el archivo ,se procede a crear uno nuevo");
        }
    }  
    
    public static void listarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No se puede listar las personas porq no hay");
        } else{
            for (persona p: personas) {
                System.out.println(p);
            }
        }
    }
    public static void listarProductos() {
        if (personas.isEmpty()) {
            System.out.println("No se puede listar los productos porq no hay");
        } else{
            for (producto pro: productos) {
                System.out.println(pro);
            }
        }
    }
}
