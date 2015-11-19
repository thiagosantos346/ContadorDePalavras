/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contador.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Silva
 *
 *
 */
import com.zero.ManipuladorPalavras;
import java.util.ArrayList;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javafx.scene.control.ProgressBar;
//import javafx.scene.input.KeyEvent;
//import javax.swing.ProgressMonitor;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Principal extends javax.swing.JFrame {

    private String setLocation;
    private FileDir fileExtention = new FileDir();
    private FileHandle contar = new FileHandle();

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        lblTextFieldFile = new javax.swing.JLabel();
        txtFieldFile = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnProcessar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jbLinhas = new javax.swing.JLabel();
        jbTotalPalavras = new javax.swing.JLabel();
        jbChars = new javax.swing.JLabel();
        txViewLines = new javax.swing.JTextField();
        txtViewWords = new javax.swing.JTextField();
        txtViewChars = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFrequencia = new javax.swing.JTable();
        jbSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arquivo");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Detalhar Aquivos"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(450, 600));

        lblTextFieldFile.setText("Selecione o Arquivo: ");

        txtFieldFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFileActionPerformed(evt);
            }
        });
        txtFieldFile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldFileKeyPressed(evt);
            }
        });

        btnSearch.setText("Procurar");
        btnSearch.setActionCommand("Abrir");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnProcessar.setText("Processar");
        btnProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessarActionPerformed(evt);
            }
        });

        jLabel1.setText("Arquivo:");

        jLabel2.setText("Progresso:");

        panel1.setBackground(new java.awt.Color(204, 255, 255));

        jbLinhas.setText("Total de Linhas");
        jbLinhas.setToolTipText("");

        jbTotalPalavras.setText("Total de Palavras");

        jbChars.setText("Total de Caracteres");

        txViewLines.setEditable(false);
        txViewLines.setColumns(4);
        txViewLines.setToolTipText("");
        txViewLines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txViewLinesActionPerformed(evt);
            }
        });

        txtViewWords.setEditable(false);
        txtViewWords.setColumns(4);

        txtViewChars.setEditable(false);
        txtViewChars.setColumns(4);

        jtFrequencia.setAutoCreateRowSorter(true);
        jtFrequencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Frequência", "Palavra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtFrequencia.setRowSorter(null);
        jScrollPane1.setViewportView(jtFrequencia);

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultados:");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbChars)
                            .addComponent(jbTotalPalavras)
                            .addComponent(jbLinhas))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtViewWords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txViewLines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewChars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txViewLines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbLinhas)))
                            .addComponent(jLabel3))
                        .addGap(6, 6, 6)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbTotalPalavras)
                            .addComponent(txtViewWords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbChars)
                            .addComponent(txtViewChars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblTextFieldFile)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFieldFile)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProcessar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTextFieldFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFieldFile)
                        .addComponent(jLabel1)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProcessar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTextFieldFile.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        setLocation = fileExtention.search();
        txtFieldFile.setText(setLocation);
        

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessarActionPerformed

        
        
        if (txtFieldFile.getText().compareTo("") != 0) {
            
            
            ManipuladorPalavras palavras = new ManipuladorPalavras();
            
            //classe responsavel por traser o array a ser inserido na jtable

            // Definindo o caminho do arquivo, lipando memorias por fim lendo o arquivo de texto

            contar.setPathFile(txtFieldFile.getText());
            contar.clear();
            contar.readFile();
            // fim

            // Usandos os Valores obtidos na leitura do arquivo para setar os valores dos campos
            // Linhas, caracteres e palavras to arquivo
            Integer lines = contar.getNumberLines();
            Integer chars = contar.getNumberChars();
            Integer words = contar.getNumberWords()-1;

            // mostando os valores
            this.txtViewWords.setText(words.toString());
            this.txViewLines.setText(lines.toString());
            this.txtViewChars.setText(chars.toString());

            // fim
            //criando um array a ser povoado com as palavras dividas da classe FileHandler
            // o tamanho do array é a quantidade de palavras registradas na leitura do arquivo
            String[] wordsArray = new String[contar.getNumberWords()];

            //povoando o array
            for (int y = 0; y < contar.getNumberWords(); y++) {

                try {
                    wordsArray[y] = contar.getWordListSplit().get(y);
                } catch (IndexOutOfBoundsException e) {
                    System.out.print(e.getMessage());
                }

            }

            //fim
            // usando a classe palavras para separar as palavras repetidas contar quantas veses elas se repetem
            palavras.run(wordsArray);
            
            //fim

            //criando o array que sera povoado com o palavras repetidas e suas frequencias para colocar na jtabela
            
            
            
            String[][] fullArray = new String[palavras.getFormulario().getSize()][2];
            
            //povoando o array
            for (int y = 0; y < palavras.getFormulario().getSize(); y++){

                fullArray[y][0] = palavras.getFormulario().getQuantidade(y).toString();
                fullArray[y][1] = palavras.getFormulario().getPalavra(y);

            }
            
            //fim
            
            
            jtFrequencia.setModel(new javax.swing.table.DefaultTableModel(
                    fullArray,
                    new String[]{
                        "Frequência", "Palavra"
                    }
            ) {
                Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean[]{
                    false, false
                };

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            
            jScrollPane1.setViewportView(jtFrequencia);
            this.jtFrequencia.setVisible(true);

            //this.contar.countRepeatWords();
        } else {
            JOptionPane.showMessageDialog(null, "Sem aquivos selecionados");
        }


    }//GEN-LAST:event_btnProcessarActionPerformed

    private void txtFieldFileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldFileKeyPressed


    }//GEN-LAST:event_txtFieldFileKeyPressed

    private void txtFieldFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFileActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtFieldFileActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jbSairActionPerformed

    private void txViewLinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txViewLinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txViewLinesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessar;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jbChars;
    private javax.swing.JLabel jbLinhas;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jbTotalPalavras;
    private javax.swing.JTable jtFrequencia;
    private javax.swing.JLabel lblTextFieldFile;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txViewLines;
    private javax.swing.JTextField txtFieldFile;
    private javax.swing.JTextField txtViewChars;
    private javax.swing.JTextField txtViewWords;
    // End of variables declaration//GEN-END:variables
}
