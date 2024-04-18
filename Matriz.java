package Main;

import java.awt.Color;
import java.util.Random;

public class Matriz extends javax.swing.JFrame {
    
    public int matriz[][];
    public byte large;
    
    public Matriz() {
        initComponents();
        
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
    }
    
    private String elementosDiagP(int matrix[][]) {
        String s = "";
        
        for (byte a = 0; a < matrix.length; a++) {
            s = s + matrix[a][a] + "  ";
        }
        return s;
    }
    
    private String elementosDiagS(int matrix[][]) {
        String s = "";
        
        for (byte a = 0; a < matrix.length; a++) {
            for (byte b = 0; b < matrix.length; b++) {
                if (a + b == matrix.length - 1) {
                    s = s + matrix[a][b] + "  ";
                }
            }
        }
        return s;
    }
    
    private String elementosEncimaDiagP(int matrix[][]) {
        String s = "";
        
        for (byte a = 0; a < matrix.length; a++) {
            for (byte b = 0; b < matrix.length; b++) {
                if (a < b) {
                    s = s + matrix[a][b] + "  ";
                }
            }
        }
        return s;
    }
    
    private String elementosDebajoDiagP(int matrix[][]) {
        String s = "";
        
        for (byte a = 0; a < matrix.length; a++) {
            for (byte b = 0; b < matrix.length; b++) {
                if (a > b) {
                    s = s + matrix[a][b] + "  ";
                }
            }
        }
        return s;
        
    }
    
    private String elementosEncimaDiagS(int matrix[][]) {
        String s = "";
        
        for (byte a = 0; a < matrix.length; a++) {
            for (byte b = 0; b < matrix.length; b++) {
                if ((a + b) < matrix.length - 1) {
                    s = s + matrix[a][b] + "  ";
                }
            }
        }
        return s;
    }
    
    private String elementosDebajoDiagS(int matrix[][]) {
        String s = "";
        
        for (byte a = 0; a < matrix.length; a++) {
            for (byte b = 0; b < matrix.length; b++) {
                if ((a + b) > matrix.length - 1) {
                    s = s + matrix[a][b] + "  ";
                }
            }
        }
        return s;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tamañoText = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrizPrint = new javax.swing.JTextArea();
        edp = new javax.swing.JLabel();
        edp_space = new javax.swing.JLabel();
        eds = new javax.swing.JLabel();
        eds_space = new javax.swing.JLabel();
        eedp = new javax.swing.JLabel();
        eedp_space = new javax.swing.JLabel();
        eddp = new javax.swing.JLabel();
        eddp_space = new javax.swing.JLabel();
        eeds = new javax.swing.JLabel();
        eeds_space = new javax.swing.JLabel();
        edds = new javax.swing.JLabel();
        edds_space = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rage Italic", 0, 36)); // NOI18N
        jLabel1.setText("Matriz");

        jLabel3.setText("Tamaño");

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        matrizPrint.setBackground(new java.awt.Color(255, 255, 255));
        matrizPrint.setColumns(20);
        matrizPrint.setForeground(new java.awt.Color(0, 0, 0));
        matrizPrint.setRows(5);
        matrizPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(matrizPrint);

        edp.setText("Elementos de la Diagonal Principal");

        edp_space.setBackground(new java.awt.Color(255, 255, 255));
        edp_space.setForeground(new java.awt.Color(0, 0, 0));
        edp_space.setOpaque(true);

        eds.setText("Elementos de la Diagonal Secundaria");

        eds_space.setBackground(new java.awt.Color(255, 255, 255));
        eds_space.setForeground(new java.awt.Color(0, 0, 0));
        eds_space.setOpaque(true);

        eedp.setText("Elementos Encima de la Diagonal Principal");

        eedp_space.setBackground(new java.awt.Color(255, 255, 255));
        eedp_space.setForeground(new java.awt.Color(0, 0, 0));
        eedp_space.setOpaque(true);

        eddp.setText("Elementos Debajo de la Diagonal Principal");

        eddp_space.setBackground(new java.awt.Color(255, 255, 255));
        eddp_space.setForeground(new java.awt.Color(0, 0, 0));
        eddp_space.setOpaque(true);

        eeds.setText("Elementos Encima de la Diagonal Secundaria");

        eeds_space.setBackground(new java.awt.Color(255, 255, 255));
        eeds_space.setForeground(new java.awt.Color(0, 0, 0));
        eeds_space.setOpaque(true);

        edds.setText("Elementos Debajo de la Diagonal Secundaria");

        edds_space.setBackground(new java.awt.Color(255, 255, 255));
        edds_space.setForeground(new java.awt.Color(0, 0, 0));
        edds_space.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(generateButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(eedp_space, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(eds_space, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(eds, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(edp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(edp_space, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(eedp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(eddp)
                                        .addComponent(eeds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(eddp_space, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(eeds_space, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(edds)
                                    .addComponent(edds_space, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 214, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tamañoText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tamañoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edp_space, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eds)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eds_space, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eedp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eedp_space, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eddp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eddp_space, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eeds)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eeds_space, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edds)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edds_space, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(generateButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        
        Random sdlg = new Random();
        
        this.large = Byte.parseByte(this.tamañoText.getText());
        
        matriz = new int[large][large];
        
        for (byte a = 0; a < this.matriz.length; a++) {
            for (byte b = 0; b < this.matriz.length; b++) {
                matriz[a][b] = sdlg.nextInt(100);
            }
        }
        
        String s = "";
        for (byte a = 0; a < matriz.length; a++) {
            s = s + " [  ";
            for (byte b = 0; b < matriz.length; b++) {
                s = s + String.valueOf(matriz[a][b]) + "  ";
            }
            s = s + "]\n\n";
        }
        
        this.matrizPrint.setText(s);
        
        this.edp_space.setText(elementosDiagP(matriz));
        
        this.eds_space.setText(elementosDiagS(matriz));
        
        this.eedp_space.setText(elementosEncimaDiagP(matriz));
        
        this.eddp_space.setText(elementosDebajoDiagP(matriz));
        
        this.eeds_space.setText(elementosEncimaDiagS(matriz));
        
        this.edds_space.setText(elementosDebajoDiagS(matriz));
    }//GEN-LAST:event_generateButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Matriz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eddp;
    private javax.swing.JLabel eddp_space;
    private javax.swing.JLabel edds;
    private javax.swing.JLabel edds_space;
    private javax.swing.JLabel edp;
    private javax.swing.JLabel edp_space;
    private javax.swing.JLabel eds;
    private javax.swing.JLabel eds_space;
    private javax.swing.JLabel eedp;
    private javax.swing.JLabel eedp_space;
    private javax.swing.JLabel eeds;
    private javax.swing.JLabel eeds_space;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea matrizPrint;
    private javax.swing.JTextField tamañoText;
    // End of variables declaration//GEN-END:variables
}
