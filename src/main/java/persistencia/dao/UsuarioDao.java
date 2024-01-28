/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia.dao;
import dominio.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import persistencia.conexion.Conexion;
import persistencia.interfaces.IUsuarioDao;
/**
 *
 * @author marco
 */
public class UsuarioDao implements IUsuarioDao{
    EntityManagerFactory emf;

    public UsuarioDao() {
        this.emf = Conexion.getConexion();
    }
    
    
    
    @Override
    public Usuario insertar(Usuario usuarioInsertar){
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(usuarioInsertar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return usuarioInsertar;
    }
    
    @Override
    public Usuario buscar(String correo, String password){
        EntityManager em = emf.createEntityManager();
    Usuario personaBuscar = null;
    try {
            em.getTransaction().begin();

            // Crear una consulta JPQL para buscar un usuario por correo y contraseña
            String jpql = "SELECT u FROM Usuario u WHERE u.correo = :correo AND u.password = :password";
            TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
            query.setParameter("correo", correo);
            query.setParameter("password", password);

            // Ejecutar la consulta y obtener el resultado
            List<Usuario> resultados = query.getResultList();

            // Verificar si se encontró un usuario
            if (!resultados.isEmpty()) {
                // Se encontró al menos un usuario, toma el primero
                personaBuscar = resultados.get(0);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace(); // Agrega esto para imprimir la traza de la excepción
        } finally {
            em.close(); // Asegúrate de cerrar el EntityManager
        }
        return personaBuscar;
    }
      
}
