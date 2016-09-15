/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.*;

/**
 *
 * @author coste
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    Cafetera c;
    
    public Principal() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCTazas = new javax.swing.JTextField();
        txtCActual = new javax.swing.JTextField();
        txtICafe = new javax.swing.JTextField();
        txtITaza = new javax.swing.JTextField();
        cmdVaciar = new javax.swing.JButton();
        cmdEstablecer = new javax.swing.JButton();
        cmdAgregar = new javax.swing.JButton();
        cmdServir = new javax.swing.JButton();
        cmdLlenar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCMaxima = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafetera");
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Cantidad a echar en cada taza");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Capacidad máxima");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Ingresar café");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Cantidad de tazas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtCTazas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCTazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 60, -1));

        txtCActual.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 60, -1));

        txtICafe.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtICafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 60, -1));

        txtITaza.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtITaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 60, -1));

        cmdVaciar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdVaciar.setText("Vaciar cafetera");
        cmdVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVaciarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 110, -1));

        cmdEstablecer.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdEstablecer.setText("Establecer");
        cmdEstablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEstablecerActionPerformed(evt);
            }
        });
        jPanel1.add(cmdEstablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        cmdAgregar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 80, -1));

        cmdServir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdServir.setText("Servir");
        cmdServir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdServirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdServir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 80, -1));

        cmdLlenar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLlenar.setText("Llenar cafetera");
        cmdLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLlenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Capacidad actual");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtCMaxima.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCMaximaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 316));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarActionPerformed
        // TODO add your handling code here:
        
        c.llenarcafetera();
        
    }//GEN-LAST:event_cmdLlenarActionPerformed

    private void cmdEstablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEstablecerActionPerformed
        // TODO add your handling code here:
        
        int a, b;
        
        a = Integer.parseInt(txtCActual.getText());
        b = Integer.parseInt(txtCMaxima.getText());
        
        c = new Cafetera (a, b);
        
    }//GEN-LAST:event_cmdEstablecerActionPerformed

    private void txtCMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCMaximaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMaximaActionPerformed

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
        // TODO add your handling code here:
        
        int h;
        
        h = Integer.parseInt(txtICafe.getText());
        
        
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void cmdServirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdServirActionPerformed
        // TODO add your handling code here:
        
        int j, k;
        
        j = Integer.parseInt(txtCTazas.getText());
        k = Integer.parseInt(txtITaza.getText());
        
        
        
    }//GEN-LAST:event_cmdServirActionPerformed

    private void cmdVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVaciarActionPerformed
        // TODO add your handling code here:
        
        c.vaciarcafetera();
        
    }//GEN-LAST:event_cmdVaciarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdEstablecer;
    private javax.swing.JButton cmdLlenar;
    private javax.swing.JButton cmdServir;
    private javax.swing.JButton cmdVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCActual;
    private javax.swing.JTextField txtCMaxima;
    private javax.swing.JTextField txtCTazas;
    private javax.swing.JTextField txtICafe;
    private javax.swing.JTextField txtITaza;
    // End of variables declaration//GEN-END:variables
}
