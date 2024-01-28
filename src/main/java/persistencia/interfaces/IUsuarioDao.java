/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia.interfaces;
import dominio.Usuario;
/**
 *
 * @author marco
 */
public interface IUsuarioDao {
    
    public Usuario insertar(Usuario usuarioInsertar);
    public Usuario buscar(String correo, String password);
}
