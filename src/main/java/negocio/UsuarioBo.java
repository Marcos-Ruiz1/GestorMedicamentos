/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import dominio.Usuario;
import persistencia.dao.UsuarioDao;
import persistencia.interfaces.IUsuarioDao;
/**
 *
 * @author marco
 */
public class UsuarioBo {
    
     IUsuarioDao usuarioDao = new UsuarioDao();
     
     public Usuario insertar(Usuario usuarioInsertar){
         
         return usuarioDao.insertar(usuarioInsertar);
     }
     
     public Usuario buscar(String correo, String password){
         
         return usuarioDao.buscar(correo, password);
     }
}
