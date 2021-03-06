/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameak;

import java.util.ArrayList;
import model.*;

public class JFrame1 extends javax.swing.JFrame {
    
    private int cajasCreadas;
    private ArrayList<Kutxa> kutxenSorta = new ArrayList();

    /**
     * Creates new form JFrame1
     */
    public JFrame1() {
        initComponents();
        this.setResizable(false);
        JTextAreaKutxakOrdenatuta.setLineWrap(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelErpinBat = new javax.swing.JLabel();
        JLabelErpinBatX = new javax.swing.JLabel();
        JLabelErpinBatY = new javax.swing.JLabel();
        JTextFieldErpinBatX = new javax.swing.JTextField();
        JTextFieldErpinBatY = new javax.swing.JTextField();
        JLabel1KontrakoErpina = new javax.swing.JLabel();
        JLabel1KontrakoErpinaX = new javax.swing.JLabel();
        JLabel1KontrakoErpinaY = new javax.swing.JLabel();
        JTextFieldKontrakoErpinaX = new javax.swing.JTextField();
        JTextFieldKontrakoErpinaY = new javax.swing.JTextField();
        JSeparator1 = new javax.swing.JSeparator();
        JSeparator2 = new javax.swing.JSeparator();
        JLabelAltura = new javax.swing.JLabel();
        JTextFieldAltuera = new javax.swing.JTextField();
        JButtonKutxaSortu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextAreaKutxakOrdenatuta = new javax.swing.JTextArea();
        JButtonOrdenarKutxa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLabelErpinBat.setText("Erpin bat: ");

        JLabelErpinBatX.setText("X-en balioa:");

        JLabelErpinBatY.setText("Y-ren balioa: ");

        JLabel1KontrakoErpina.setText("Kontrako Erpina: ");

        JLabel1KontrakoErpinaX.setText("X-en balioa: ");

        JLabel1KontrakoErpinaY.setText("Y-ren balioa: ");

        JLabelAltura.setText("Altuera: ");

        JButtonKutxaSortu.setText("Kutxa Sortu");
        JButtonKutxaSortu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonKutxaSortuActionPerformed(evt);
            }
        });

        JTextAreaKutxakOrdenatuta.setColumns(20);
        JTextAreaKutxakOrdenatuta.setRows(5);
        jScrollPane1.setViewportView(JTextAreaKutxakOrdenatuta);

        JButtonOrdenarKutxa.setText("Ordenatu");
        JButtonOrdenarKutxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonOrdenarKutxaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(JLabelErpinBat))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JLabelErpinBatX)
                                            .addComponent(JLabel1KontrakoErpinaX))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTextFieldErpinBatX, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTextFieldKontrakoErpinaX, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(JLabelErpinBatY))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(JLabel1KontrakoErpinaY)))))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JTextFieldErpinBatY, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextFieldKontrakoErpinaY, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(JLabel1KontrakoErpina)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabelAltura)
                                .addGap(18, 18, 18)
                                .addComponent(JTextFieldAltuera, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JButtonKutxaSortu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JButtonOrdenarKutxa)
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonOrdenarKutxa)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabelErpinBat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabelErpinBatX)
                            .addComponent(JTextFieldErpinBatX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabelErpinBatY)
                            .addComponent(JTextFieldErpinBatY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(JSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLabel1KontrakoErpina)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel1KontrakoErpinaX)
                            .addComponent(JTextFieldKontrakoErpinaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel1KontrakoErpinaY)
                            .addComponent(JTextFieldKontrakoErpinaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(JSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabelAltura)
                            .addComponent(JTextFieldAltuera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JButtonKutxaSortu))))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonKutxaSortuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonKutxaSortuActionPerformed
        // TODO add your handling code here:
        Puntua erpinBat = new Puntua(Integer.parseInt(JTextFieldErpinBatX.getText()),Integer.parseInt(JTextFieldErpinBatY.getText()));
        Puntua kontrakoErpina = new Puntua(Integer.parseInt(JTextFieldKontrakoErpinaX.getText()),Integer.parseInt(JTextFieldKontrakoErpinaY.getText()));
        int altuera = Integer.parseInt(JTextFieldAltuera.getText());
        
        //crear la Kutxa y guardarla en el ArrayList
        kutxenSorta.add(new Kutxa(erpinBat,kontrakoErpina,altuera));
        cajasCreadas++;
        
        JTextFieldErpinBatX.setText("");
        JTextFieldErpinBatY.setText("");
        JTextFieldKontrakoErpinaX.setText("");
        JTextFieldKontrakoErpinaY.setText("");
        JTextFieldAltuera.setText("");
        
    }//GEN-LAST:event_JButtonKutxaSortuActionPerformed

    private void JButtonOrdenarKutxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonOrdenarKutxaActionPerformed
        // TODO add your handling code here:
        Kutxa.ordenarArrayListKutxa(kutxenSorta);
        JTextAreaKutxakOrdenatuta.setText("");
        for (int i = 0; i < cajasCreadas; i++) {
            JTextAreaKutxakOrdenatuta.setText(JTextAreaKutxakOrdenatuta.getText() + "\n" + (i+1) + " - " + " Bolumena: " + kutxenSorta.get(i).getBolumena() +
                    " - Altuera: " + kutxenSorta.get(i).getAltuera() + 
                    " \n-> Puntuak: " + kutxenSorta.get(i) + "\n--------------------------------");
        }
        
    }//GEN-LAST:event_JButtonOrdenarKutxaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton JButtonKutxaSortu;
    public static javax.swing.JButton JButtonOrdenarKutxa;
    public static javax.swing.JLabel JLabel1KontrakoErpina;
    public static javax.swing.JLabel JLabel1KontrakoErpinaX;
    public static javax.swing.JLabel JLabel1KontrakoErpinaY;
    public static javax.swing.JLabel JLabelAltura;
    public static javax.swing.JLabel JLabelErpinBat;
    public static javax.swing.JLabel JLabelErpinBatX;
    public static javax.swing.JLabel JLabelErpinBatY;
    public static javax.swing.JSeparator JSeparator1;
    public static javax.swing.JSeparator JSeparator2;
    public static javax.swing.JTextArea JTextAreaKutxakOrdenatuta;
    public static javax.swing.JTextField JTextFieldAltuera;
    public static javax.swing.JTextField JTextFieldErpinBatX;
    public static javax.swing.JTextField JTextFieldErpinBatY;
    public static javax.swing.JTextField JTextFieldKontrakoErpinaX;
    public static javax.swing.JTextField JTextFieldKontrakoErpinaY;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
