/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.util.HashSet;

public class login extends javax.swing.JFrame {

    DaoUsuarios dao = new DaoUsuario();
    usuario usu = new usuario();
    int xMouse, yMouse;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(login.class.getName());

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        txtuserlogin = new javax.swing.JTextField();
        lg = new javax.swing.JLabel();
        txtpassword = new javax.swing.JLabel();
        txtusuario = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnInicio = new javax.swing.JButton();
        barra = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HERON'S FLIYING STORE");
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        BG.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/firstbg.jpeg"))); // NOI18N
        BG.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        txtuserlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtuserloginMousePressed(evt);
            }
        });
        txtuserlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserloginActionPerformed(evt);
            }
        });
        BG.add(txtuserlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 320, -1));

        lg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.jpeg"))); // NOI18N
        lg.setText("LOGO");
        BG.add(lg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtpassword.setText("PASSWORD");
        BG.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        txtusuario.setText("USUARIO");
        BG.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpassMousePressed(evt);
            }
        });
        BG.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 320, -1));

        btnInicio.setText("INICIAR");
        BG.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 670, Short.MAX_VALUE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BG.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserloginActionPerformed

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
    }//GEN-LAST:event_barraMouseDragged

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(Color.red);
        btnExit.setBackground(Color.white);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(Color.white);
        btnExit.setBackground(Color.red);
    }//GEN-LAST:event_btnExitMouseExited

    private void txtuserloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserloginMousePressed
        if (txtuserlogin.getText().equals("Ingrese su nombre de usuario")){
            txtuserlogin.setText("");
            txtuserlogin.setForeground(Color.BLACK);
        }
        if (String.valueOf(txtpass.getPassword()).isEmpty()) {
            txtpass.setText("*********");
            txtpass.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtuserloginMousePressed

    private void txtpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMousePressed
        if (String.valueOf(txtpass.getPassword()).equals("********")) {
            txtpass.setText("");
            txtpass.setForeground(Color.BLACK);
        }
        if (txtuserlogin.getText().isEmpty()) {
            txtuserlogin.setText("Ingrese su nombre de usuario");
            txtuserlogin.setForeground(Color.GRAY);
    }//GEN-LAST:event_txtpassMousePressed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel back;
    private javax.swing.JPanel barra;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lg;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JLabel txtpassword;
    private javax.swing.JTextField txtuserlogin;
    private javax.swing.JLabel txtusuario;
    // End of variables declaration//GEN-END:variables
}
