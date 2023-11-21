/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentema1andreallovera;

import dtos.tareas;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import logic.tareaLogic;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;
import org.openide.util.Exceptions;

/**
 *
 * @author Tarde
 */
public class Formulario extends javax.swing.JDialog {
    ExamenTema1AndreaLlovera mainFrame;

    /**
     * Creates new form Formulario
     */
    public Formulario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        btnCrear.setEnabled(false);
        
        ValidationGroup form=validator.getValidationGroup();
        form.add(txtnombre, StringValidators.REQUIRE_NON_EMPTY_STRING);
        form.add(txtDescripcion, StringValidators.REQUIRE_NON_EMPTY_STRING);
        form.add(jcAsignaturas, StringValidators.REQUIRE_NON_EMPTY_STRING);
        
        validator.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent ce) {
                if (validator.getProblem() == null){
                    btnCrear.setEnabled(true);
                } else {
                    btnCrear.setEnabled(false);
                }     
            }
        });
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
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcAsignaturas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        spFechaInicio = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spFechaFin = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 4));

        jLabel1.setText(org.openide.util.NbBundle.getMessage(Formulario.class, "Formulario.jLabel1.text")); // NOI18N
        jPanel1.add(jLabel1);

        txtnombre.setText(org.openide.util.NbBundle.getMessage(Formulario.class, "Formulario.txtnombre.text")); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre);

        jLabel2.setText(org.openide.util.NbBundle.getMessage(Formulario.class, "Formulario.jLabel2.text")); // NOI18N
        jPanel1.add(jLabel2);

        txtDescripcion.setText(org.openide.util.NbBundle.getMessage(Formulario.class, "Formulario.txtDescripcion.text")); // NOI18N
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion);

        jLabel3.setText(org.openide.util.NbBundle.getMessage(Formulario.class, "Formulario.jLabel3.text")); // NOI18N
        jPanel1.add(jLabel3);

        jcAsignaturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematica", "Lengua", "Historia" }));
        jPanel1.add(jcAsignaturas);

        jLabel4.setText(org.openide.util.NbBundle.getMessage(Formulario.class, "Formulario.jLabel4.text")); // NOI18N
        jPanel1.add(jLabel4);

        spFechaInicio.setModel(new javax.swing.SpinnerDateModel());
        jPanel1.add(spFechaInicio);

        jLabel5.setText(org.openide.util.NbBundle.getMessage(Formulario.class, "Formulario.jLabel5.text")); // NOI18N
        jPanel1.add(jLabel5);

        spFechaFin.setModel(new javax.swing.SpinnerDateModel());
        jPanel1.add(spFechaFin);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(org.openide.util.NbBundle.getMessage(Formulario.class, "Formulario.jLabel6.text")); // NOI18N

        btnCrear.setText(org.openide.util.NbBundle.getMessage(Formulario.class, "Formulario.btnCrear.text")); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnCancelar.setText(org.openide.util.NbBundle.getMessage(Formulario.class, "Formulario.btnCancelar.text")); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrear)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnCancelar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        String nombre=txtnombre.getText();
        String descripcion=txtDescripcion.getText();
        String asignatura=jcAsignaturas.getSelectedItem().toString();
        Date fechaInicio=(Date) spFechaInicio.getValue();
        Date fechaEntrega=(Date) spFechaFin.getValue();
        
        String fechaI=new SimpleDateFormat("yyyy-MM-dd").format(fechaInicio);
        String fechaE=new SimpleDateFormat("yyyy-MM-dd").format(fechaEntrega);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clase","root","1234");
            con.setAutoCommit(true);
            Statement st=con.createStatement();
            st.executeUpdate("insert into tareas ()");
            
        } catch (ClassNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Formulario dialog = new Formulario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcAsignaturas;
    private javax.swing.JSpinner spFechaFin;
    private javax.swing.JSpinner spFechaInicio;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
