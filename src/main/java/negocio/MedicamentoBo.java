/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import dominio.Medicamento;
import persistencia.dao.MedicamentoDao;
import persistencia.interfaces.IMedicamentoDao;
/**
 *
 * @author marco
 */
public class MedicamentoBo {
    
    IMedicamentoDao medicamentoDao = new MedicamentoDao();
     
     public Medicamento insertar(Medicamento medicamentoInsertar){
         
         return medicamentoDao.insertar(medicamentoInsertar);
     }
     
     public Medicamento buscar(Long id){
         
         return medicamentoDao.buscar(id);
     }
}
