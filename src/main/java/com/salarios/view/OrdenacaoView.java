
package com.salarios.view;

public class OrdenacaoView extends javax.swing.JFrame {

    private boolean salarios;

    public OrdenacaoView() {
        initComponents();
        this.setLocationRelativeTo(this.getParent());
        setVisible(true);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSemOrdem = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstOrdenados = new javax.swing.JList<>();
        rbtnCrescente = new javax.swing.JRadioButton();
        rbtnDecrescente = new javax.swing.JRadioButton();
        cmbMetodo = new javax.swing.JComboBox<>();
        btnCarregarArquivo = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        lblSemOrdem = new javax.swing.JLabel();
        IblMetodoOrdenacao = new javax.swing.JLabel();
        lblOrdem = new javax.swing.JLabel();
        lblOrdenados = new javax.swing.JLabel();
        lblTempoRotulo = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordenação");

        jScrollPane1.setViewportView(lstSemOrdem);

        lstOrdenados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstOrdenados);

        rbtnCrescente.setText("Crescente");

        rbtnDecrescente.setText("Decrescente");

        cmbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMetodoActionPerformed(evt);
            }
        });

        btnCarregarArquivo.setText("Carregar do Arquivo");
        btnCarregarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarArquivoActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");

        lblSemOrdem.setText("Elementos a serem ordenados");

        IblMetodoOrdenacao.setText("Métodos de ordenação");

        lblOrdem.setText("Ordem");

        lblOrdenados.setText("Elementos ordenados");

        lblTempoRotulo.setText("Tempo: ");

        lblTempo.setText("jLabel1");

        jMenuBar1.setToolTipText("");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnCarregarArquivo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSemOrdem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbMetodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOrdenar)
                            .addComponent(rbtnCrescente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnDecrescente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(IblMetodoOrdenacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblOrdem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTempoRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblOrdenados, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSemOrdem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblOrdenados)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTempoRotulo)
                            .addComponent(lblTempo))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarregarArquivo)
                            .addGap(18, 18, 18))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(IblMetodoOrdenacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(lblOrdem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbtnCrescente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbtnDecrescente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnOrdenar)
                            .addGap(74, 74, 74)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMetodoActionPerformed
    }//GEN-LAST:event_cmbMetodoActionPerformed

    private void btnCarregarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarArquivoActionPerformed
        // TODO add your handling code here:
        //CarregarArquivoPresenter();
        
        
    }//GEN-LAST:event_btnCarregarArquivoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IblMetodoOrdenacao;
    private javax.swing.JButton btnCarregarArquivo;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbMetodo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOrdem;
    private javax.swing.JLabel lblOrdenados;
    private javax.swing.JLabel lblSemOrdem;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblTempoRotulo;
    private javax.swing.JList<String> lstOrdenados;
    private javax.swing.JList<String> lstSemOrdem;
    private javax.swing.JRadioButton rbtnCrescente;
    private javax.swing.JRadioButton rbtnDecrescente;
    // End of variables declaration//GEN-END:variables

   
    public javax.swing.JLabel getIblMetodoOrdenacao() {
        return IblMetodoOrdenacao;
    }

   
    public javax.swing.JButton getBtnCarregarArquivo() {
        return btnCarregarArquivo;
    }

   
    public javax.swing.JButton getBtnOrdenar() {
        
        return btnOrdenar;
    }

    
    public javax.swing.ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public javax.swing.JComboBox<String> getCmbMetodo() {
        return cmbMetodo;
    }

   
    public javax.swing.JLabel getLblOrdem() {
        return lblOrdem;
    }

    public javax.swing.JLabel getLblOrdenados() {
        return lblOrdenados;
    }

  
    public javax.swing.JLabel getLblSemOrdem() {
        
        return lblSemOrdem;
    }


    public javax.swing.JLabel getLblTempo() {
        return lblTempo;
    }


    public javax.swing.JLabel getLblTempoRotulo() {
        return lblTempoRotulo;
    }

    public javax.swing.JList<String> getLstOrdenados() {
        return lstOrdenados;
    }

    public javax.swing.JList<String> getLstSemOrdem() {
        return lstSemOrdem;
    }

  
    public javax.swing.JRadioButton getRbtnCrescente() {
        return rbtnCrescente;
    }

   
    public javax.swing.JRadioButton getRbtnDecrescente() {
        return rbtnDecrescente;
    }

    private void CarregarArquivoPresenter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
