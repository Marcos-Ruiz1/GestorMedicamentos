
package dominio;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author marco
 */
@Entity
public class Usuario{

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(name = "nombre")
    private String nombre;
   
   @Column(name = "correo")
    private String correo;
   
   @Column(name = "password")
    private String password;
   
   @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Medicamento> medicamentos;

   public Usuario(){
       
   }
   
   public Usuario(String nombre, String correo, String password){
       this.nombre = nombre;
       this.correo = correo;
       this.password = password;
   }
   
   public Usuario(String nombre, String correo, String password, List<Medicamento> medicamentos){
       this.nombre = nombre;
       this.correo = correo;
       this.password = password;
       this.medicamentos = medicamentos;
   }
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
   
    
    
}
