/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

/**
 *
 * @author Cesar Maldonado
 */
public class prueba extends javax.swing.JFrame {

    /**
     * Creates new form prueba
     */
    public prueba() {
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

        btnbebida = new javax.swing.JButton();
        btnentrada = new javax.swing.JButton();
        btnplato = new javax.swing.JButton();
        btnpostre = new javax.swing.JButton();
        btnensalada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbebida.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cesar Maldonado\\Downloads\\32395greensalad_98843 (1).png")); // NOI18N
        btnbebida.setText("BEBIDAS");
        getContentPane().add(btnbebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 164, -1));

        btnentrada.setText("ENTRADAS");
        btnentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        btnplato.setText("PLATOS");
        btnplato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplatoActionPerformed(evt);
            }
        });
        getContentPane().add(btnplato, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 164, -1));

        btnpostre.setText("POSTRES");
        btnpostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpostreActionPerformed(evt);
            }
        });
        getContentPane().add(btnpostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        btnensalada.setText("ENSALADA");
        btnensalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnensaladaActionPerformed(evt);
            }
        });
        getContentPane().add(btnensalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnentradaActionPerformed

    private void btnensaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnensaladaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnensaladaActionPerformed

    private void btnpostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpostreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpostreActionPerformed

    private void btnplatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnplatoActionPerformed

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
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbebida;
    private javax.swing.JButton btnensalada;
    private javax.swing.JButton btnentrada;
    private javax.swing.JButton btnplato;
    private javax.swing.JButton btnpostre;
    // End of variables declaration//GEN-END:variables
}
