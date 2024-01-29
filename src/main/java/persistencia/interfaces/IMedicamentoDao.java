/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia.interfaces;
import dominio.Medicamento;
/**
 *
 * @author marco
 */
public interface IMedicamentoDao {
    
    public Medicamento insertar(Medicamento medicamentoInsertar);
    public Medicamento buscar(String nombre, Long idUsuario);
}
