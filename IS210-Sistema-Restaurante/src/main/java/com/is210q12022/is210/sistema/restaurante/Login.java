
package com.is210q12022.is210.sistema.restaurante;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author gasc1211
 */
public class Login extends javax.swing.JFrame {
    
    private dbManager db = new dbManager();
    public static userObjectModel currentUser;

    public Login() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        btn_login = new javax.swing.JButton();
        txt_user = new javax.swing.JTextField();
        txtP_password = new javax.swing.JPasswordField();
        rad_showText = new javax.swing.JRadioButton();
        lbl_userIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurnte");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(400, 420));
        setName("LoginScreen"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btn_login.setText("Ingresar");
        btn_login.setMargin(new java.awt.Insets(5, 15, 5, 15));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 25);
        getContentPane().add(btn_login, gridBagConstraints);

        txt_user.setForeground(new java.awt.Color(204, 204, 204));
        txt_user.setText("Usuario");
        txt_user.setToolTipText("Ingresa tu nombre de usuario.");
        txt_user.setMargin(new java.awt.Insets(5, 10, 5, 10));
        txt_user.setMinimumSize(new java.awt.Dimension(180, 25));
        txt_user.setName("Usuario"); // NOI18N
        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_userKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 25);
        getContentPane().add(txt_user, gridBagConstraints);
        txt_user.getAccessibleContext().setAccessibleName("Usuario");

        txtP_password.setForeground(new java.awt.Color(204, 204, 204));
        txtP_password.setText("Contraseña");
        txtP_password.setToolTipText("Ingresa tu contraseña.");
        txtP_password.setEchoChar('\u0000');
        txtP_password.setMargin(new java.awt.Insets(5, 10, 5, 10));
        txtP_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtP_passwordKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 25);
        getContentPane().add(txtP_password, gridBagConstraints);
        txtP_password.getAccessibleContext().setAccessibleName("Contraseña");

        rad_showText.setText("Mostrar caracteres");
        rad_showText.setEnabled(false);
        rad_showText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_showTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 5, 25);
        getContentPane().add(rad_showText, gridBagConstraints);

        lbl_userIcon.setIcon(new ImageIcon(new ImageIcon("./src/main/java/images/user-solid.png")
            .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(15, 25, 15, 25);
    getContentPane().add(lbl_userIcon, gridBagConstraints);

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyPressed
        // TODO add your handling code here:
        if(this.txt_user.getText().equals("Usuario")){
            this.txt_user.setText("");
            this.txt_user.setForeground(Color.black);
        }
        
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER ){
            this.txtP_password.requestFocus();
        }
    }//GEN-LAST:event_txt_userKeyPressed

    private void txtP_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtP_passwordKeyPressed
        // TODO add your handling code here:
        if(String.valueOf(this.txtP_password.getPassword()).equals("Contraseña")){
            this.txtP_password.setEchoChar('*');
            this.txtP_password.setText("");
            this.txtP_password.setForeground(Color.black);
            this.rad_showText.setEnabled(true);
        }        
    }//GEN-LAST:event_txtP_passwordKeyPressed

    private void rad_showTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_showTextActionPerformed
        // TODO add your handling code here:        
        if(rad_showText.isSelected()){
            this.txtP_password.setEchoChar((char)0);
        } else {
            this.txtP_password.setEchoChar('*');
        }
    }//GEN-LAST:event_rad_showTextActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        this.currentUser.setUsername(txt_user.getText());
        this.currentUser.setPassword(String.valueOf(txtP_password.getPassword()));
        
        // Data Base Authentication
        if (db.authenticate(currentUser)) {
            new Administration().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_loginActionPerformed
    
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
                System.out.println(info.getName());
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lbl_userIcon;
    private javax.swing.JRadioButton rad_showText;
    private javax.swing.JPasswordField txtP_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}