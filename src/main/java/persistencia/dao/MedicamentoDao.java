
package persistencia.dao;
import dominio.Medicamento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import persistencia.conexion.Conexion;
import persistencia.interfaces.IMedicamentoDao;
/**
 *
 * @author marco
 */
public class MedicamentoDao implements IMedicamentoDao{
    EntityManagerFactory emf;

    public MedicamentoDao() {
        this.emf = Conexion.getConexion();
    }
    
    
    
    @Override
    public Medicamento insertar(Medicamento medicamentoInsertar){
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(medicamentoInsertar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return medicamentoInsertar;
    }

    @Override
    public Medicamento buscar(String nombre, Long idUsuario) {
        EntityManager em = emf.createEntityManager();
        Medicamento medicamentoBuscar = null;
        try {
            em.getTransaction().begin();

            // Crear una consulta JPQL para buscar un medicamento por nombre y usuario
            String jpql = "SELECT m FROM Medicamento m WHERE m.nombre = :nombre AND m.usuario.id = :idUsuario";
            TypedQuery<Medicamento> query = em.createQuery(jpql, Medicamento.class);
            query.setParameter("nombre", nombre);
            query.setParameter("idUsuario", idUsuario);

            // Ejecutar la consulta y obtener el resultado
            List<Medicamento> resultados = query.getResultList();

            // Verificar si se encontró un medicamento
            if (!resultados.isEmpty()) {
                // Se encontró al menos un medicamento, toma el primero
                medicamentoBuscar = resultados.get(0);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace(); // Agrega esto para imprimir la traza de la excepción
        } finally {
            em.close(); // Asegúrate de cerrar el EntityManager
        }
        return medicamentoBuscar;
    }
}
