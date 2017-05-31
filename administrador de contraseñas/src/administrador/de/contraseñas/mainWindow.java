package administrador.de.contraseñas;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class mainWindow extends javax.swing.JFrame {  
    ResultSet rta;
    conectar_base base;
    
    public mainWindow() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Key 2_80px.png")).getImage());
        base = new conectar_base();
        rta = base.consulta_cuentas("contraseñas");
        try{
            while(rta.next()){
                Cuentas.addItem(rta.getString("Cuenta"));
            }
        }catch(Exception e){
            
        }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Cuentas = new javax.swing.JComboBox<>();
        campo_contraseña = new javax.swing.JLabel();
        campo_cuenta = new javax.swing.JLabel();
        campo_usuario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Cuentas1 = new javax.swing.JComboBox<>();
        campo_contraseña1 = new javax.swing.JLabel();
        campo_cuenta1 = new javax.swing.JLabel();
        campo_usuario1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        campo_contraseña2 = new javax.swing.JTextField();
        campo_cuenta2 = new javax.swing.JTextField();
        campo_usuario2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(5, 14, 22));
        jPanel2.setEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 186, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 230, 10));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cuenta:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 296, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 240, 10));

        Cuentas.setBorder(null);
        Cuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentasActionPerformed(evt);
            }
        });
        jPanel2.add(Cuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 160, -1));

        campo_contraseña.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        campo_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(campo_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 230, 30));

        campo_cuenta.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        campo_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(campo_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 94, 230, 30));

        campo_usuario.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        campo_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 230, 30));

        jButton1.setText("Buscar");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 240, 30));

        jPanel3.setBackground(new java.awt.Color(5, 14, 22));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 186, -1, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, 10));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 230, 10));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cuenta:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 296, -1, -1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 240, 10));

        Cuentas1.setBorder(null);
        Cuentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cuentas1ActionPerformed(evt);
            }
        });
        jPanel3.add(Cuentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 160, -1));

        campo_contraseña1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        campo_contraseña1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(campo_contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 230, 30));

        campo_cuenta1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        campo_cuenta1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(campo_cuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 94, 230, 30));

        campo_usuario1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        campo_usuario1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(campo_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 230, 30));

        jButton2.setText("Buscar");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 240, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Consulta", jPanel2);

        jPanel4.setBackground(new java.awt.Color(5, 14, 22));
        jPanel4.setEnabled(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 186, -1, -1));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, 10));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 230, 10));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cuenta:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 296, -1, -1));
        jPanel4.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 240, 10));

        jButton4.setText("Quitar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 100, 40));

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 100, 40));

        campo_contraseña2.setBackground(new java.awt.Color(5, 14, 22));
        campo_contraseña2.setForeground(new java.awt.Color(255, 255, 255));
        campo_contraseña2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(campo_contraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 230, 30));

        campo_cuenta2.setBackground(new java.awt.Color(5, 14, 22));
        campo_cuenta2.setForeground(new java.awt.Color(255, 255, 255));
        campo_cuenta2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campo_cuenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cuenta2ActionPerformed(evt);
            }
        });
        jPanel4.add(campo_cuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 230, 30));

        campo_usuario2.setBackground(new java.awt.Color(5, 14, 22));
        campo_usuario2.setForeground(new java.awt.Color(255, 255, 255));
        campo_usuario2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(campo_usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, 30));

        jTabbedPane1.addTab("Agregar o Borrar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentasActionPerformed

    }//GEN-LAST:event_CuentasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        rta = base.consulta_base("contraseñas", (String)Cuentas.getSelectedItem());
        try{
            while(rta.next()){
                campo_cuenta.setText((String)Cuentas.getSelectedItem());
                campo_usuario.setText(rta.getString("Usuario"));
                campo_contraseña.setText(rta.getString("Contraseña"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cuentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cuentas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cuentas1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String cuenta = campo_cuenta2.getText();
        String usuario = campo_usuario2.getText();
        String contraseña = campo_contraseña2.getText();
        
        base.insertar_cuenta(cuenta, usuario, contraseña);
        
        campo_cuenta2.setText("");
        campo_usuario2.setText("");
        campo_contraseña2.setText("");
        Cuentas.removeAllItems();
        rta = base.consulta_cuentas("contraseñas");
        try{
            while(rta.next()){
                
                Cuentas.addItem(rta.getString("Cuenta"));
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void campo_cuenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cuenta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cuenta2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String cuenta = campo_cuenta2.getText();
        
        base.quitar_cuenta(cuenta);
        
        campo_cuenta2.setText("");
        campo_usuario2.setText("");
        campo_contraseña2.setText("");
        Cuentas.removeAllItems();
        rta = base.consulta_cuentas("contraseñas");
        try{
            while(rta.next()){
                Cuentas.addItem(rta.getString("Cuenta"));
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        campo_cuenta.setText("");
        campo_usuario.setText("");
        campo_contraseña.setText("");
        campo_cuenta2.setText("");
        campo_usuario2.setText("");
        campo_contraseña2.setText("");
    }//GEN-LAST:event_jTabbedPane1StateChanged

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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cuentas;
    private javax.swing.JComboBox<String> Cuentas1;
    private javax.swing.JLabel campo_contraseña;
    private javax.swing.JLabel campo_contraseña1;
    private javax.swing.JTextField campo_contraseña2;
    private javax.swing.JLabel campo_cuenta;
    private javax.swing.JLabel campo_cuenta1;
    private javax.swing.JTextField campo_cuenta2;
    private javax.swing.JLabel campo_usuario;
    private javax.swing.JLabel campo_usuario1;
    private javax.swing.JTextField campo_usuario2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
