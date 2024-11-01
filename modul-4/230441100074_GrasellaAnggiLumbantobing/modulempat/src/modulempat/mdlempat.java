/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modulempat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author USER EBC
 */
public class mdlempat extends javax.swing.JFrame {
    private int TargetNumber;
    private int Percobaan;
    private int MaxPercobaan = 10;
    private int Score;
    private DefaultListModel<String> ScoreModel;
    private JList<String> scoreList;
    private int totalScore = 0;
//  int index = 0;
    int index = 1; // inisialisasi index diluar metode, mulai dari 1

    /** 
     * Creates new form mdlempat  
     */
    public mdlempat() {
        initComponents();
        ButtonTebak.setEnabled(false);
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
        TabbedPanePermainan = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        LabelPermainan = new javax.swing.JLabel();
        LabelAngka = new javax.swing.JLabel();
        LabelTebakan = new javax.swing.JLabel();
        LabelCek = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();
        TextFieldTebakan = new javax.swing.JTextField();
        TextFieldCek = new javax.swing.JTextField();
        TextFieldTotal = new javax.swing.JTextField();
        ButtonStart = new javax.swing.JButton();
        ButtonReset = new javax.swing.JButton();
        ButtonTebak = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaScore = new javax.swing.JTextArea();
        ButtonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        TabbedPanePermainan.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        LabelPermainan.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        LabelPermainan.setForeground(new java.awt.Color(255, 255, 255));
        LabelPermainan.setText("PERMAINAN TEBAK ANGKA");

        LabelAngka.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        LabelAngka.setForeground(new java.awt.Color(255, 255, 255));
        LabelAngka.setText("Angka Berapakah Aku?");

        LabelTebakan.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        LabelTebakan.setForeground(new java.awt.Color(255, 255, 255));
        LabelTebakan.setText("Tebakan");

        LabelCek.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        LabelCek.setForeground(new java.awt.Color(255, 255, 255));
        LabelCek.setText("Cek");

        LabelTotal.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        LabelTotal.setForeground(new java.awt.Color(255, 255, 255));
        LabelTotal.setText("Total Score");

        TextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTotalActionPerformed(evt);
            }
        });

        ButtonStart.setBackground(new java.awt.Color(153, 153, 153));
        ButtonStart.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ButtonStart.setText("Start Game");
        ButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStartActionPerformed(evt);
            }
        });

        ButtonReset.setBackground(new java.awt.Color(153, 153, 153));
        ButtonReset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ButtonReset.setText("Reset");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        ButtonTebak.setBackground(new java.awt.Color(153, 153, 153));
        ButtonTebak.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ButtonTebak.setText("Tebak");
        ButtonTebak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTebakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonStart)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(ButtonTebak)
                            .addGap(87, 87, 87)
                            .addComponent(ButtonReset))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelCek)
                                .addComponent(LabelTebakan)
                                .addComponent(LabelTotal))
                            .addGap(62, 62, 62)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelAngka)
                                .addComponent(TextFieldTebakan)
                                .addComponent(TextFieldCek)
                                .addComponent(TextFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(LabelPermainan)
                .addGap(102, 102, 102))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPermainan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAngka)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTebakan)
                    .addComponent(TextFieldTebakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCek)
                    .addComponent(TextFieldCek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotal)
                    .addComponent(TextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonReset)
                    .addComponent(ButtonTebak))
                .addGap(18, 18, 18)
                .addComponent(ButtonStart)
                .addGap(21, 21, 21))
        );

        TabbedPanePermainan.addTab("Permainan", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        TextAreaScore.setBackground(new java.awt.Color(255, 255, 153));
        TextAreaScore.setColumns(20);
        TextAreaScore.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        TextAreaScore.setRows(5);
        jScrollPane1.setViewportView(TextAreaScore);

        ButtonKeluar.setBackground(new java.awt.Color(153, 153, 153));
        ButtonKeluar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ButtonKeluar.setText("Keluar");
        ButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonKeluar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(ButtonKeluar)
                .addGap(20, 20, 20))
        );

        TabbedPanePermainan.addTab("Score", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPanePermainan)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPanePermainan)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTotalActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        // TODO add your handling code here:
        resetGame();
        TextAreaScore.setText("");
        JOptionPane.showMessageDialog(null, "Permainan telah direset. Silahkan mulai kembali.", "Reset Permainan", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ButtonResetActionPerformed

    private void ButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKeluarActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar dari permainan ini?", "Peringatan", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
            //Logika untuk menangani pembatalan
            dispose();
        }
    }//GEN-LAST:event_ButtonKeluarActionPerformed

    private void ButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStartActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Permainan dimulai. Apakah anda ingin bermain?", "Mulai permainan", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            // start game
            startGame();
            JOptionPane.showMessageDialog(null, "Score awal : 0\nSilahkan tebak angka antara 1 sampai 100.");
        }else{
            int MESSAGE;
            //exit game
            JOptionPane.showMessageDialog(null, "Anda keluar dari game tersebut.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ButtonStartActionPerformed

    private void ButtonTebakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTebakActionPerformed
        // TODO add your handling code here:
        String tebakAngka = TextFieldTebakan.getText();
        checkTebakan(tebakAngka);
    }//GEN-LAST:event_ButtonTebakActionPerformed

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
            java.util.logging.Logger.getLogger(mdlempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mdlempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mdlempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mdlempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mdlempat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonKeluar;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JButton ButtonStart;
    private javax.swing.JButton ButtonTebak;
    private javax.swing.JLabel LabelAngka;
    private javax.swing.JLabel LabelCek;
    private javax.swing.JLabel LabelPermainan;
    private javax.swing.JLabel LabelTebakan;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JTabbedPane TabbedPanePermainan;
    private javax.swing.JTextArea TextAreaScore;
    private javax.swing.JTextField TextFieldCek;
    private javax.swing.JTextField TextFieldTebakan;
    private javax.swing.JTextField TextFieldTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void startGame() {
       resetGame(); //menyetel ulang variabel game jika perlu
        TargetNumber = (int)(Math.random()*100) +1; //random number
        Percobaan = MaxPercobaan;
        Score = 0;
       ButtonTebak.setEnabled(true);
       
//     update initial score
      TextFieldTotal.setText("Score : " + Score);
      
      TextFieldCek.setText("");
      TextFieldTotal.setText("Score : 0");
      TextFieldTebakan.setText("");
      ButtonStart.setEnabled(false);
    }

    private void checkTebakan(String input) {
// Validasi input
    System.out.println( TargetNumber);
                        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inputkan angka tebakan terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int tebakan;
        try {
            tebakan = Integer.parseInt(input);
            if (tebakan < 1 || tebakan > 100) {
                JOptionPane.showMessageDialog(null, "Masukkan angka 1 sampai 100 .", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Percobaan--; // Mengurangi jumlah percobaan

        // Cek tebakan
        String resultText;
        if (tebakan < TargetNumber) {
            resultText = "Tebakan Anda Terlalu Kecil. Coba lagi!";
        } else if (tebakan > TargetNumber) {
            resultText = "Tebakan Anda Terlalu Besar. Coba lagi!";
        } else {
            // Tebakan benar
            int roundScore = Percobaan * 10; // Hitung skor berdasarkan percobaan yang tersisa
            totalScore += roundScore; // Tambah ke total skor
            TextFieldTotal.setText("Score: " + totalScore + " | Sisa Percobaan: " + Percobaan);
            TextFieldCek.setText("Selamat! Anda berhasil menebak dengan benar! Skor Anda: " + totalScore);

            int response = JOptionPane.showConfirmDialog(null, "Ingin Bermain Lagi?", "Lanjutkan Permainan", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                resetGame();
                ButtonTebak.setEnabled(true);
            } else {
                String name = JOptionPane.showInputDialog("Masukkan Nama Anda:");
                if (name != null && !name.trim().isEmpty()) {
                    addToScoreList(name, totalScore); // Tambahkan ke daftar skor
                    TabbedPanePermainan.setSelectedIndex(1); // Pindah ke tab Score untuk menampilkan hasil
                }
                resetTotalScore();
            }
            return;
        }

        TextFieldTotal.setText("Score: " + totalScore + " | Sisa Percobaan: " +Percobaan);
        TextFieldCek.setText(resultText);
        Timer timer = new Timer(900, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextFieldCek.setText(""); // Kosongkan untuk sementara
                ((Timer) e.getSource()).stop(); // Hentikan timer setelah satu kali eksekusi
                TextFieldCek.setText(resultText); // Mengisi kembali dengan pesan sesuai hasil tebakan
            }
        });
        timer.setRepeats(false);
        timer.start();

        if (Percobaan <= 0) {
            JOptionPane.showMessageDialog(null, "Anda Gagal! Target angka adalah " + TargetNumber);
            ButtonStart.setEnabled(true);
            ButtonTebak.setEnabled(true);
            String name = JOptionPane.showInputDialog("Masukkan Nama Anda:");
            if (name != null && !name.trim().isEmpty()) {
                addToScoreList(name, totalScore); // Tambahkan skor total ke daftar skor
                TabbedPanePermainan.setSelectedIndex(1); // Pindah ke tab Score
            }
            resetTotalScore();
            resetGame();
        }
    }

    private void resetGame() {
        int TargetNumber = (int) (Math.random() * 99) + 1; // random number between 1 and 100
        int Percobaan = 10; // contoh pengaturan ulang jumlah percobaan 
        totalScore = 0;
        TextFieldTotal.setText("Score: 0 | Sisa Percobaan: " + Percobaan);
        TextFieldCek.setText("");
        TextFieldTebakan.setText("");
        ButtonTebak.setEnabled(false);
    }

    private void addToScoreList(String name, int totalScore) {
        // tambahkn nama dan skor pemain ke textHasilScore dengan nomor urut berdasarkan index
    TextAreaScore.append(index + ". Nama: " + name + " | Score: " + totalScore + "\n");
    index++; // naikkan index hanya disini setiap kali pemain baru ditambahkan
    }

    private void resetTotalScore() {
        totalScore = 0;
    }
}
