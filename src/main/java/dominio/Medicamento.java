
package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



/**
 *
 * @author marco
 */
@Entity
public class Medicamento {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(name = "nombre")
    private String nombre;
   
   @Column(name = "dosis")
    private float dosis;
   
   @Column(name = "frecuencia")
    private float frecuencia;

   @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
    public Medicamento(){
        
    }
    
    public Medicamento(String nombre, float dosis, float frecuencia){
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
    }
    
    public Medicamento(String nombre, float dosis, float frecuencia, Usuario usuario){
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDosis() {
        return dosis;
    }

    public void setDosis(float dosis) {
        this.dosis = dosis;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }
    
}
