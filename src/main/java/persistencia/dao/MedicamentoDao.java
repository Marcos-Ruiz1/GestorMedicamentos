
package persistencia.dao;
import dominio.Medicamento;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
    public Medicamento buscar(Long medicamentoBuscar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
