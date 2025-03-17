/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.util.List;
import jdbc.normalito.lib.UsuarioDAO;

//este si es 
public class JDBC {

   
   public static void main(String[] args) {
        UsuarioDAO usuaroDAO = new UsuarioDAO();
        
        // Insertar usuario 
        usuaroDAO.insertUsuario("Pedro", "pedrogomez.campuslands@gmail.com");
        
        List<String> ListaUsuarios = UsuarioDAO.obtenerUsuario();
        for (String usuario: ListaUsuarios){
            System.out.println(usuario);
        }
        
    }
    
}
