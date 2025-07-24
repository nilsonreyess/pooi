
package views;

import java.awt.Color;
import javax.swing.JOptionPane;

public class FrmContact extends javax.swing.JFrame {

    public FrmContact() {
        initComponents();
        LblTitle.setText("Agenda de Contactos");
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTitle = new javax.swing.JLabel();
        TxtFullname = new javax.swing.JTextField();
        BtnSend = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de contactos");
        setResizable(false);

        LblTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblTitle.setForeground(new java.awt.Color(255, 51, 51));
        LblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitle.setText("Aquí va el título de mi aplicación");

        TxtFullname.setText("Nombre completo");
        TxtFullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtFullnameFocusGained(evt);
            }
        });

        BtnSend.setText("Guardar");
        BtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSendActionPerformed(evt);
            }
        });

        jTextField1.setText("Correo electrónico");

        jTextField2.setText("Celular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(TxtFullname)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addComponent(BtnSend)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitle)
                .addGap(18, 18, 18)
                .addComponent(TxtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSend))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtFullnameFocusGained
        TxtFullname.setText("");
        TxtFullname.setForeground(Color.red);
    }//GEN-LAST:event_TxtFullnameFocusGained

    private void BtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSendActionPerformed
        JOptionPane.showMessageDialog(null, "Contacto Guardado");
    }//GEN-LAST:event_BtnSendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSend;
    private javax.swing.JLabel LblTitle;
    private javax.swing.JTextField TxtFullname;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
