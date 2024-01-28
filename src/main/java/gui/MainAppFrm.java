/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import dominio.Medicamento;
import dominio.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import negocio.MedicamentoBo;
import negocio.UsuarioBo;
/**
 *
 * @author marco
 */
public class MainAppFrm extends javax.swing.JFrame {

    Usuario usuarioActual;
    /**
     * Creates new form MainAppFrm
     */
    public MainAppFrm(){
        
    }
    
    public MainAppFrm(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
        initComponents();
        cargarDatosEnTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedicamentos = new javax.swing.JTable();
        btnRegistrarMedicamento = new javax.swing.JButton();
        btnRecordatorio = new javax.swing.JButton();
        btnNotificacion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaMedicamentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 270));

        btnRegistrarMedicamento.setBackground(new java.awt.Color(0, 0, 255));
        btnRegistrarMedicamento.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnRegistrarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarMedicamento.setText("Registrar Medicamento");
        btnRegistrarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMedicamentoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 40));

        btnRecordatorio.setBackground(new java.awt.Color(0, 0, 255));
        btnRecordatorio.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnRecordatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRecordatorio.setText("Conf.Recordatorio");
        btnRecordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordatorioActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecordatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, 40));

        btnNotificacion.setBackground(new java.awt.Color(0, 0, 255));
        btnNotificacion.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnNotificacion.setForeground(new java.awt.Color(255, 255, 255));
        btnNotificacion.setText("Crear Notificación");
        btnNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, 40));

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Medicamentos A Tomar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 440, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMedicamentoActionPerformed
        // TODO add your handling code here:
        registrarMedicamentoFrm frame = new registrarMedicamentoFrm(this.usuarioActual);
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_btnRegistrarMedicamentoActionPerformed

    private void btnRecordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecordatorioActionPerformed

    private void btnNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNotificacionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        Home frame = new Home();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cargarDatosEnTabla() {
        
        List<Medicamento> medicamentos = usuarioActual.getMedicamentos();
        
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Dosis");
        modeloTabla.addColumn("Frecuencia");
        
        for (Medicamento medicamento : medicamentos) {
            Object[] fila = {medicamento.getNombre(), medicamento.getDosis(), medicamento.getFrecuencia()};
            modeloTabla.addRow(fila);
        }

        tablaMedicamentos.setModel(modeloTabla);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainAppFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAppFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAppFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAppFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAppFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNotificacion;
    private javax.swing.JButton btnRecordatorio;
    private javax.swing.JButton btnRegistrarMedicamento;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMedicamentos;
    // End of variables declaration//GEN-END:variables
}