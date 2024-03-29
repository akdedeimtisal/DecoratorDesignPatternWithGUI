
import javax.swing.ButtonGroup;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imtisal
 */
public class UI_BakedPotatoOrder extends javax.swing.JFrame {

    /**
     * Creates new form UI_BakedPatotoOrder
     */
    public UI_BakedPotatoOrder() {
        initComponents();
        
        //select one radio button
        
        ButtonGroup group = new ButtonGroup();
        group.add(mixedRadioButton);
        group.add(simpleRadioButton);
        
        
        // taking prices to UI from class.
        
        BakedPotato bp = new MixedBakedPotato();
        Sauce sc = new Sauce(bp);
        Chicken ch  = new Chicken(bp);
        BurghulSalad bs = new BurghulSalad(bp);
        
        BakedPotato sp = new SimpleBakedPotato();
        
        sauceCheckBox.setText("Sauce " + Double.toString(sc.cost() - bp.cost()) + " tl");
        chickenCheckBox.setText("Chicken " + Double.toString(ch.cost() - bp.cost()) + " tl");
        burghulSaladCheckBox.setText("Burgul Salad " + Double.toString(bs.cost() - bp.cost()) + " tl" );
        
        mixedRadioButton.setText("Mixed Baked Potato " + Double.toString(bp.cost()) + " tl");
        simpleRadioButton.setText("Simple Baked Potato " + Double.toString(sp.cost()) + " tl");
        
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
        simpleRadioButton = new javax.swing.JRadioButton();
        mixedRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chickenCheckBox = new javax.swing.JCheckBox();
        sauceCheckBox = new javax.swing.JCheckBox();
        burghulSaladCheckBox = new javax.swing.JCheckBox();
        orderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderSummaryArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mixedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixedRadioButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Baked Potato Type");

        jLabel2.setText("Select Extras");

        sauceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauceCheckBoxActionPerformed(evt);
            }
        });

        burghulSaladCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burghulSaladCheckBoxActionPerformed(evt);
            }
        });

        orderButton.setText("Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        orderSummaryArea.setColumns(20);
        orderSummaryArea.setRows(5);
        jScrollPane1.setViewportView(orderSummaryArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chickenCheckBox)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(simpleRadioButton)
                            .addComponent(mixedRadioButton)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(sauceCheckBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(burghulSaladCheckBox))
                                .addComponent(orderButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(mixedRadioButton)
                .addGap(18, 18, 18)
                .addComponent(simpleRadioButton)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(sauceCheckBox)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(burghulSaladCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(chickenCheckBox)
                .addGap(38, 38, 38)
                .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mixedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixedRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mixedRadioButtonActionPerformed

    private void sauceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauceCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sauceCheckBoxActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed

        if (mixedRadioButton.isSelected()) {
            BakedPotato mixedBakedPatoto = new MixedBakedPotato();

            if (chickenCheckBox.isSelected()) {
                mixedBakedPatoto  = new Chicken(mixedBakedPatoto );

            }

            if (sauceCheckBox.isSelected()) {
                mixedBakedPatoto  = new Sauce(mixedBakedPatoto );
            }
            
            if(burghulSaladCheckBox.isSelected()) {
                mixedBakedPatoto  = new BurghulSalad(mixedBakedPatoto );
            }
            
            orderSummaryArea.setText(mixedBakedPatoto.getDescription() + "\n" + mixedBakedPatoto.cost());
            
        }
        
        if (simpleRadioButton.isSelected()) {
            BakedPotato simpleBakedPatoto = new SimpleBakedPotato();

            if (chickenCheckBox.isSelected()) {
                simpleBakedPatoto = new Chicken(simpleBakedPatoto);

            }

            if (sauceCheckBox.isSelected()) {
                simpleBakedPatoto = new Sauce(simpleBakedPatoto);
            }
            
            if(burghulSaladCheckBox.isSelected()) {
                simpleBakedPatoto = new BurghulSalad(simpleBakedPatoto);
            }
            
            orderSummaryArea.setText(simpleBakedPatoto.getDescription() + "\n" + simpleBakedPatoto.cost());
            
        }


    }//GEN-LAST:event_orderButtonActionPerformed

    private void burghulSaladCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burghulSaladCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burghulSaladCheckBoxActionPerformed

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
            java.util.logging.Logger.getLogger(UI_BakedPotatoOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_BakedPotatoOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_BakedPotatoOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_BakedPotatoOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_BakedPotatoOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox burghulSaladCheckBox;
    private javax.swing.JCheckBox chickenCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton mixedRadioButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JTextArea orderSummaryArea;
    private javax.swing.JCheckBox sauceCheckBox;
    private javax.swing.JRadioButton simpleRadioButton;
    // End of variables declaration//GEN-END:variables
}
