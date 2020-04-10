
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class StringManager extends javax.swing.JFrame {

    /**
     * Creates new form StringManager
     */
    public StringManager() {
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

        pnlStringMana = new javax.swing.JPanel();
        lblYourName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSp = new javax.swing.JButton();
        btnEn = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        pnlInfo = new javax.swing.JPanel();
        lblyName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblyNaMay = new javax.swing.JLabel();
        lblyNaMin = new javax.swing.JLabel();
        lblNameMay = new javax.swing.JLabel();
        lblNameMin = new javax.swing.JLabel();
        pnlLetFin = new javax.swing.JPanel();
        txtSearNum = new javax.swing.JTextField();
        btnSeaChar = new javax.swing.JButton();
        lblLetter = new javax.swing.JLabel();
        lblDigNum = new javax.swing.JLabel();
        btnMay = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        lblTotCar = new javax.swing.JLabel();
        lblTotalChar = new javax.swing.JLabel();
        lblInMay = new javax.swing.JLabel();
        lblIniLet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("String manager");
        setResizable(false);

        lblYourName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblYourName.setText("Your name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        btnSp.setBackground(new java.awt.Color(255, 0, 0));
        btnSp.setForeground(new java.awt.Color(255, 255, 0));
        btnSp.setText("SP");
        btnSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpActionPerformed(evt);
            }
        });

        btnEn.setBackground(new java.awt.Color(0, 0, 255));
        btnEn.setForeground(new java.awt.Color(255, 255, 51));
        btnEn.setText("EN");
        btnEn.setEnabled(false);
        btnEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStringManaLayout = new javax.swing.GroupLayout(pnlStringMana);
        pnlStringMana.setLayout(pnlStringManaLayout);
        pnlStringManaLayout.setHorizontalGroup(
            pnlStringManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStringManaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblYourName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStringManaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSp))
        );
        pnlStringManaLayout.setVerticalGroup(
            pnlStringManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStringManaLayout.createSequentialGroup()
                .addGroup(pnlStringManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSp)
                    .addComponent(btnEn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlStringManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYourName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnReset.setBackground(new java.awt.Color(204, 204, 204));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(51, 0, 0));
        btnReset.setText("RESET");
        btnReset.setEnabled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        btnReset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnResetKeyPressed(evt);
            }
        });

        btnShow.setBackground(new java.awt.Color(51, 51, 51));
        btnShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("SHOW");
        btnShow.setEnabled(false);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        pnlInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblyName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblyName.setText("Your name is:");

        lblName.setText(".");

        lblyNaMay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblyNaMay.setText("Your name in MAY:");

        lblyNaMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblyNaMin.setText("Your name in MIN:");

        lblNameMay.setText(".");

        lblNameMin.setText(".");

        pnlLetFin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LETTER FINDER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        txtSearNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearNumActionPerformed(evt);
            }
        });
        txtSearNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearNumKeyTyped(evt);
            }
        });

        btnSeaChar.setText("SEARCH");
        btnSeaChar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeaCharActionPerformed(evt);
            }
        });

        lblLetter.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLetter.setText("?");

        lblDigNum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDigNum.setText("Tipe a number ");

        btnMay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMay.setText("MAY");
        btnMay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayActionPerformed(evt);
            }
        });

        btnMin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMin.setText("MIN");
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLetFinLayout = new javax.swing.GroupLayout(pnlLetFin);
        pnlLetFin.setLayout(pnlLetFinLayout);
        pnlLetFinLayout.setHorizontalGroup(
            pnlLetFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLetFinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLetFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDigNum)
                    .addGroup(pnlLetFinLayout.createSequentialGroup()
                        .addGroup(pnlLetFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeaChar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearNum, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(lblLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(pnlLetFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlLetFinLayout.setVerticalGroup(
            pnlLetFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLetFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLetFinLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(76, 76, 76))
                .addGroup(pnlLetFinLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(btnSeaChar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(pnlLetFinLayout.createSequentialGroup()
                .addComponent(lblDigNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLetFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLetter)))
        );

        lblTotCar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotCar.setText("Character Total:");

        lblTotalChar.setText(".");

        lblInMay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblInMay.setText("Initial capital Letters: ");

        lblIniLet.setText(".");

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLetFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblyNaMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNameMin, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblTotCar)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalChar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInfoLayout.createSequentialGroup()
                            .addComponent(lblyName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInfoLayout.createSequentialGroup()
                            .addComponent(lblyNaMay)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNameMay, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblInMay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIniLet, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblyName)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblyNaMay)
                    .addComponent(lblNameMay, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblyNaMin)
                    .addComponent(lblNameMin, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalChar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotCar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInMay)
                    .addComponent(lblIniLet, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLetFin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlStringMana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlStringMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        /*lineas de abajoSystem.out.println("Your name is:" + txtName.getText()); 
        String nName = txtName.getText();
        System.out.println("Your name is:" + nName);*/
        //show the answer in GUI
        
        String nName = txtName.getText();
     
        lblName.setText(nName);
        lblNameMay.setText(nName.toUpperCase());
        lblNameMin.setText(nName.toLowerCase());
        int numlet;
        numlet = txtName.getText().length();
        lblTotalChar.setText(String.valueOf(numlet));
        lblIniLet.setText(""+nName.substring(0,1).toUpperCase()+nName.substring(1).toLowerCase());

    }//GEN-LAST:event_btnShowActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        //set = asignar, en este caso un valor vacio
        txtName.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpActionPerformed
        // TODO add your handling code here:
        
        btnSp.setEnabled(false);
        btnEn.setEnabled(true);
        lblYourName.setText("Tu Nombre: ");
        btnShow.setText("MOSTRAR");
        btnReset.setText("LIMPIAR");
        pnlInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACIÓN"));
        lblyName.setText("Tu Nombre es: ");
        lblyNaMay.setText("Tu Nombre en MAY: ");
        lblyNaMin.setText("Tu Nombre en MIN: ");
        lblTotCar.setText("Total Caracteres: ");
        lblInMay.setText("Iniciales Mayúsculas: ");
        pnlLetFin.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCADOR DE LETRAS"));
        lblDigNum.setText("Digite un Número: ");
        btnSeaChar.setText("BUSCAR ");
        

    }//GEN-LAST:event_btnSpActionPerformed

    private void btnEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnActionPerformed
        // TODO add your handling code here:
        btnSp.setEnabled(true);
        btnEn.setEnabled(false);
        lblYourName.setText("Your Name: ");
        btnShow.setText("SHOW");
        btnReset.setText("RESET");
        pnlInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMATION"));
        lblyName.setText("Your Names is: ");
        lblyNaMay.setText("Your Name in MAY: ");
        lblyNaMin.setText("Your Name in MIN: ");
        lblTotCar.setText("Total Characters: ");
        lblInMay.setText("Inicial Capital Letters: ");
        pnlLetFin.setBorder(javax.swing.BorderFactory.createTitledBorder("LETTER FINDER"));
        lblDigNum.setText("Type a Number: ");
        btnSeaChar.setText("SEARCH ");
    }//GEN-LAST:event_btnEnActionPerformed

    private void txtSearNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearNumActionPerformed

    private void btnSeaCharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeaCharActionPerformed
        // TODO add your handling code here:
        String nName = txtName.getText();
        int numCarac = Integer.parseInt(txtSearNum.getText());    
        lblLetter.setText(""+nName.charAt(numCarac-1));
    }//GEN-LAST:event_btnSeaCharActionPerformed

    private void btnMayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayActionPerformed
        // TODO add your handling code here:
        String nName="";
        nName = lblLetter.getText();
        lblLetter.setText(" "+nName.toUpperCase());
        btnMin.setEnabled(true);
        btnMay.setEnabled(false);    
    }//GEN-LAST:event_btnMayActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        String nName = txtName.getText();
        if(txtName.getText().isEmpty()){
            btnShow.setEnabled(false);
            btnReset.setEnabled(false);
        }else {
            btnShow.setEnabled(true);
            btnReset.setEnabled(true);
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtSearNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearNumKeyTyped

    }//GEN-LAST:event_txtSearNumKeyTyped

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        // TODO add your handling code here:
        String nName="";
        nName = lblLetter.getText();
        lblLetter.setText(" "+nName.toUpperCase());
        btnMin.setEnabled(false);
        btnMay.setEnabled(true);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnResetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnResetKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetKeyPressed

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
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEn;
    private javax.swing.JButton btnMay;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSeaChar;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSp;
    private javax.swing.JLabel lblDigNum;
    private javax.swing.JLabel lblInMay;
    private javax.swing.JLabel lblIniLet;
    private javax.swing.JLabel lblLetter;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameMay;
    private javax.swing.JLabel lblNameMin;
    private javax.swing.JLabel lblTotCar;
    private javax.swing.JLabel lblTotalChar;
    private javax.swing.JLabel lblYourName;
    private javax.swing.JLabel lblyNaMay;
    private javax.swing.JLabel lblyNaMin;
    private javax.swing.JLabel lblyName;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlLetFin;
    private javax.swing.JPanel pnlStringMana;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearNum;
    // End of variables declaration//GEN-END:variables

}
