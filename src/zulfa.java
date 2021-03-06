import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author Siti Zulfa Oktaviani
 */
public class zulfa extends javax.swing.JFrame {

    /**
     * Creates new form zulfa
     */
    public zulfa() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnKunci = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textEnkrip = new javax.swing.JTextArea();
        btnEnkrip = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDekrip = new javax.swing.JTextArea();
        btnDekrip = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        kunci = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Siti Zulfa Oktaviani");

        jPanel1.setBackground(new java.awt.Color(47, 57, 59));

        jLabel5.setBackground(new java.awt.Color(47, 57, 59));
        jLabel5.setForeground(new java.awt.Color(47, 57, 59));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setIconTextGap(0);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nama");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nim");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kelas");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(": Siti Zulfa Oktaviani");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(": 20190040013");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(": TI19B (Karyawan Sabtu)");

        btnKunci.setBackground(new java.awt.Color(251, 122, 252));
        btnKunci.setText("Kunci Ku");
        btnKunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKunciActionPerformed(evt);
            }
        });

        textEnkrip.setColumns(20);
        textEnkrip.setRows(5);
        jScrollPane1.setViewportView(textEnkrip);

        btnEnkrip.setBackground(new java.awt.Color(255, 255, 0));
        btnEnkrip.setText("Enkrip");
        btnEnkrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnkripActionPerformed(evt);
            }
        });

        textDekrip.setColumns(20);
        textDekrip.setRows(5);
        jScrollPane2.setViewportView(textDekrip);

        btnDekrip.setBackground(new java.awt.Color(0, 255, 102));
        btnDekrip.setText("Dekrip");
        btnDekrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDekripActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hasil Enkripsinya!");

        btnClear.setBackground(new java.awt.Color(0, 102, 255));
        btnClear.setText("Clear Text / Kalimat");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Text / Kalimat");

        errorLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(kunci, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnKunci))
                                .addComponent(jScrollPane1)
                                .addComponent(btnEnkrip, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel2))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addComponent(btnDekrip))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(192, 192, 192))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKunci)
                    .addComponent(kunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnkrip)
                            .addComponent(btnDekrip)
                            .addComponent(btnClear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errorLabel)
                        .addContainerGap())
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private static SecretKeySpec secretKey;
    private static byte[] key;
 
    public static void setKey(String myKey) 
    {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); 
            secretKey = new SecretKeySpec(key, "AES");
        } 
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } 
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
 
    public static String encrypt(String strToEncrypt, String secret) 
    {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Error melakukan enkripsi data kunci salah atau kosong");
        }
        return null;
    }
 
    public static String decrypt(String strToDecrypt, String secret) 
    {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Error melakukan dekripsi data kunci salah atau kosong");
        }
        return null;
    }
        
    private void btnKunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKunciActionPerformed

        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";

        String alphaNumeric = upperAlphabet + numbers;

        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        int length = 16;

        for(int i = 0; i < length; i++) {
          int index = random.nextInt(alphaNumeric.length());
          char randomChar = alphaNumeric.charAt(index);
          sb.append(randomChar);
        }

        String randomString = sb.toString();
        kunci.setText(randomString);
    }//GEN-LAST:event_btnKunciActionPerformed

    private void btnEnkripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnkripActionPerformed
        String originalString  = textEnkrip.getText();
        String secretKey  = kunci.getText();
        String res =  encrypt(originalString, secretKey) ;
        textDekrip.setText(res);
    }//GEN-LAST:event_btnEnkripActionPerformed

    private void btnDekripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDekripActionPerformed
        String encryptedString  = textDekrip.getText();
        String secretKey  = kunci.getText();
        String decryptedString = decrypt(encryptedString, secretKey) ;
        textEnkrip.setText(decryptedString);
    }//GEN-LAST:event_btnDekripActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       textEnkrip.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(zulfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zulfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zulfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zulfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zulfa().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDekrip;
    private javax.swing.JButton btnEnkrip;
    private javax.swing.JButton btnKunci;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kunci;
    private javax.swing.JTextArea textDekrip;
    private javax.swing.JTextArea textEnkrip;
    // End of variables declaration//GEN-END:variables

}
