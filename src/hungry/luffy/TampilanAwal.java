/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungry.luffy;

import javax.swing.ImageIcon;

/**
 *
 * @author user1
 */
public class TampilanAwal extends javax.swing.JFrame {

    /**
     * Creates new form TampilanAwal
     */
    public TampilanAwal() {
        initComponents();
        setLocationRelativeTo(this); //agar tampilan ditengah saat run
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        skor = new javax.swing.JLabel();
        playwithme = new javax.swing.JLabel();
        exitnow = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        skor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/highscore2.png"))); // NOI18N
        skor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                skorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                skorMouseExited(evt);
            }
        });
        getContentPane().add(skor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 60));

        playwithme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Playfix_1.png"))); // NOI18N
        playwithme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playwithmeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playwithmeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playwithmeMouseExited(evt);
            }
        });
        getContentPane().add(playwithme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 60));

        exitnow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/exitFinalYe.png"))); // NOI18N
        exitnow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitnowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitnowMouseExited(evt);
            }
        });
        getContentPane().add(exitnow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, 60));

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/help2.png"))); // NOI18N
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpMouseExited(evt);
            }
        });
        getContentPane().add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 270, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/background2 (2).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skorMouseExited
        ImageIcon m = new ImageIcon(getClass().getResource("/Gambar/highscore2.png"));
        skor.setIcon(m);     // TODO add your handling code here:
    }//GEN-LAST:event_skorMouseExited

    private void skorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skorMouseEntered
        ImageIcon m = new ImageIcon(getClass().getResource("/Gambar/High.png"));
        skor.setIcon(m);        // TODO add your handling code here:
    }//GEN-LAST:event_skorMouseEntered

    private void playwithmeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playwithmeMouseExited
        ImageIcon m = new ImageIcon(getClass().getResource("/Gambar/playfix_1.png"));
        playwithme.setIcon(m);
    }//GEN-LAST:event_playwithmeMouseExited

    private void playwithmeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playwithmeMouseEntered
        ImageIcon m = new ImageIcon(getClass().getResource("/Gambar/play2.png"));
        playwithme.setIcon(m);
    }//GEN-LAST:event_playwithmeMouseEntered

    private void exitnowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitnowMouseEntered
        ImageIcon m = new ImageIcon(getClass().getResource("/Gambar/exit2.png"));
        exitnow.setIcon(m);
    }//GEN-LAST:event_exitnowMouseEntered

    private void exitnowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitnowMouseExited
              ImageIcon m = new ImageIcon(getClass().getResource("/Gambar/exitFinalYe.png"));
        exitnow.setIcon(m);
    }//GEN-LAST:event_exitnowMouseExited

    private void helpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseEntered
              ImageIcon m = new ImageIcon(getClass().getResource("/Gambar/HelpGlowFix.png"));
        help.setIcon(m);
    }//GEN-LAST:event_helpMouseEntered

    private void helpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseExited
              ImageIcon m = new ImageIcon(getClass().getResource("/Gambar/help2.png"));
        help.setIcon(m);
    }//GEN-LAST:event_helpMouseExited

    private void skorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skorMouseClicked
        new HighScore().setVisible(true);
        dispose();
       // TODO add your handling code here:
    }//GEN-LAST:event_skorMouseClicked

    private void playwithmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playwithmeMouseClicked
                new MasukNama().setVisible(true);
        dispose();
    }//GEN-LAST:event_playwithmeMouseClicked

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
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitnow;
    private javax.swing.JLabel help;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel playwithme;
    private javax.swing.JLabel skor;
    // End of variables declaration//GEN-END:variables
}
