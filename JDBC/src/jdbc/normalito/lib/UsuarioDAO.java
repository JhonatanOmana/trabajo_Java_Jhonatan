/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.normalito.lib;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private String URL = "jdbc:mysql://bwlxfidkafqwaphgwyii-mysql.services.clever-cloud.com:3306/bwlxfidkafqwaphgwyii";
    private String USUARIO="u4jkloucntz0jtbw";
    private String PASSWORD ="TqD8XKyJxL1vMs2UTa8y";
    
    
    private Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
    };
    
    // Creat (Insert)
    public void insertUsuario(String nombre, String email){
        String sql = "INSERT INTO usuarios (nombre,email) values (?,?)";
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            //Asignando valores a la incognitas
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            // Ejecucion de la solicitud
            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera exitosa!");
        
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    // Leer (SELECT)
    public List<String> obtenerUsuario(){
        String sql = "SELECT * FROM usuarios";
        List<String> ListaUsuarios = new ArrayList<>();
        try(
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            ResultSet resultado = solicitud.executeQuery();){
            while (resultado.next()){
                ListaUsuarios.add(resultado.getInt("id")+ " - " + resultado.getString("nombre") + " - " + resultado.getString("email"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ListaUsuarios;
    }
    
    public void actualizarUsuarios(int id,String nombre,String email){
        String sql = "update usuarios set nombre=?,email=? where id=?";
        try(
                Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.preparedStatement(sql)){
            solicitud.setString(1,nombre);
            solicitud.setString(2, email);
            solicitud.setInt(3, id);
            
            int filas = solicitud.executeUpdate();
            if(filas > 0){
                System.out.println("Usuario actualizado exitosamente ");
                
            }else{
                System.out.println("No se puedo registar el usuario con ID "+id);
            }
            
        }
        catch (SQLExeption e){
            e.pintStackTrace();
        }
    }
    
}
