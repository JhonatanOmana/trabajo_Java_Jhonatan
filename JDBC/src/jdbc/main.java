/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import jdbc.normalito.lib.UsuarioDAO;
public class main {
    public static void main(String[] args) {
        UsuarioDAO usuaroDAO = new UsuarioDAO();
        
        // Insertar usuario 
        usuaroDAO.insertUsuario("Pedro", "pedrogomez.campuslands@gmail.com");
        
    }
    
}
