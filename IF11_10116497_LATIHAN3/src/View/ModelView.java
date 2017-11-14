/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author shorfana
 */
public class ModelView extends javax.swing.JFrame {

    /**
     * Creates new form ModelView
     */
    public ModelView() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Jurusan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        PR = new javax.swing.JCheckBox();
        DU = new javax.swing.JCheckBox();
        GM = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("APLIKASI PENDAPATAN VOLUNTER DEV SUMMIT");

        jLabel2.setText("Nama");

        jLabel3.setText("Jenis Kelamin");

        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        jLabel4.setText("Jurusan");

        Jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Sistem Informasi", "Akuntansi", "Teknik Komputer", "Bahasa Inggris", "DKV" }));

        jLabel5.setText("Minat");

        PR.setText("Programming");

        DU.setText("Design UI UX");

        GM.setText("Game");

        jLabel6.setText("Area Penempatan");

        jLabel7.setText("Output :");

        Output.setColumns(20);
        Output.setRows(5);
        jScrollPane3.setViewportView(Output);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        Area.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "DEV SUMMIT BANDUNG", "DEV SUMMIT JAKARTA", "DEV SUMMIT SURABAYA", "DEV SUMMIT YOGYAKARTA" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Female)
                                            .addComponent(Male)
                                            .addComponent(Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PR)
                                            .addComponent(DU)
                                            .addComponent(GM)))))
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpan))
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Male))
                        .addGap(7, 7, 7)
                        .addComponent(Female)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(PR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GM)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String combo = Jurusan.getSelectedItem().toString();
        String Kelamin = "";
        String Minat1 = "", Minat2 = "", Minat3 = "";
        if (Male.isSelected()) {
            Kelamin = "Male";
        } else if (Female.isSelected()) {
            Kelamin = "Female";
        }

        if (PR.isSelected()) {
            Minat1 = "Programming";
        }
        if (DU.isSelected()) {
            Minat2 = "Design UI UX";
        }
        if (GM.isSelected()) {
            Minat3 = "Game";
        }
        String list = Area.getSelectedValue();

        Output.setText("Nama : " + txtNama.getText() + "\n"
                + "Jenis Kelamin : " + Kelamin + "\n"
                + "Jurusan : " + combo + "\n"
                + "Minat : " + Minat1 + "," + Minat2 + "," + Minat3 + "\n"
                + "Kota Penempatan : " + list);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
        if (Male.isSelected()) {
            Female.setSelected(false);
        }
    }//GEN-LAST:event_MaleActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
        if (Female.isSelected()) {
            Male.setSelected(false);
        }
    }//GEN-LAST:event_FemaleActionPerformed

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
            java.util.logging.Logger.getLogger(ModelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModelView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Area;
    private javax.swing.JCheckBox DU;
    private javax.swing.JRadioButton Female;
    private javax.swing.JCheckBox GM;
    private javax.swing.JComboBox<String> Jurusan;
    private javax.swing.JRadioButton Male;
    private javax.swing.JTextArea Output;
    private javax.swing.JCheckBox PR;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
