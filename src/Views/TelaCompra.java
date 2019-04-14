/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ControladorCompra;
import Controllers.ControladorPrincipal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 55489
 */
public class TelaCompra extends javax.swing.JFrame {

    /**
     * Creates new form TelaCompra
     */
    private DefaultTableModel tabelaCarrinho;
    private final DecimalFormat df;
    private final DecimalFormatSymbols separador;
    
    public TelaCompra() {
        initComponents();
        setLocationRelativeTo(null);
        txtQtd.setText("1");
        separador = new DecimalFormatSymbols();
        separador.setDecimalSeparator('.');
        df = new DecimalFormat("###,##0.00", separador);
        ButtonGroup formasPagamento = new ButtonGroup();
        formasPagamento.add(btnVisaCredito);
        formasPagamento.add(btnVisaDebito);
        formasPagamento.add(btnMasterCredito);
        formasPagamento.add(btnMasterDebito);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagamento = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        btnVisaDebito = new javax.swing.JRadioButton();
        btnVisaCredito = new javax.swing.JRadioButton();
        btnMasterCredito = new javax.swing.JRadioButton();
        btnMasterDebito = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnConfirmarPagamento = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cupomFiscal = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCupom = new javax.swing.JTextArea();
        btnFinalizar = new javax.swing.JButton();
        btnColocarNoCarrinho = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carrinho = new javax.swing.JTable();
        txtPrecoTotal = new javax.swing.JTextField();
        btnEfetuaPagamento = new javax.swing.JButton();
        btnCancelarCompra = new javax.swing.JButton();
        btnRemoverProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnMaisQtd = new javax.swing.JButton();
        btnMenosQtd = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnVisaDebito.setText("Visa - Débito");

        btnVisaCredito.setText("Visa - Crédito");

        btnMasterCredito.setText("Mastercard - Crédito");

        btnMasterDebito.setText("Mastercard - Débito");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVisaCredito)
                    .addComponent(btnVisaDebito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMasterCredito)
                    .addComponent(btnMasterDebito))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisaDebito)
                    .addComponent(btnMasterDebito))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisaCredito)
                    .addComponent(btnMasterCredito))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Selecione a forma de pagamento:");

        btnConfirmarPagamento.setText("Confirmar");
        btnConfirmarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarPagamentoActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pagamentoLayout = new javax.swing.GroupLayout(pagamento.getContentPane());
        pagamento.getContentPane().setLayout(pagamentoLayout);
        pagamentoLayout.setHorizontalGroup(
            pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagamentoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagamentoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnConfirmarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pagamentoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        pagamentoLayout.setVerticalGroup(
            pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagamentoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarPagamento)
                    .addComponent(btnVoltar))
                .addGap(57, 57, 57))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cupom fiscal:");

        txtCupom.setColumns(20);
        txtCupom.setRows(5);
        jScrollPane2.setViewportView(txtCupom);

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cupomFiscalLayout = new javax.swing.GroupLayout(cupomFiscal.getContentPane());
        cupomFiscal.getContentPane().setLayout(cupomFiscalLayout);
        cupomFiscalLayout.setHorizontalGroup(
            cupomFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cupomFiscalLayout.createSequentialGroup()
                .addGroup(cupomFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cupomFiscalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cupomFiscalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cupomFiscalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFinalizar)
                .addGap(305, 305, 305))
        );
        cupomFiscalLayout.setVerticalGroup(
            cupomFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cupomFiscalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnFinalizar)
                .addGap(44, 44, 44))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnColocarNoCarrinho.setText("Colocar no carrinho");
        btnColocarNoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColocarNoCarrinhoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Preço total:");

        carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carrinho);

        txtPrecoTotal.setEditable(false);
        txtPrecoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoTotalActionPerformed(evt);
            }
        });

        btnEfetuaPagamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEfetuaPagamento.setForeground(new java.awt.Color(0, 204, 51));
        btnEfetuaPagamento.setText("Efetuar pagamento");
        btnEfetuaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfetuaPagamentoActionPerformed(evt);
            }
        });

        btnCancelarCompra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelarCompra.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelarCompra.setText("Cancelar Compra");
        btnCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCompraActionPerformed(evt);
            }
        });

        btnRemoverProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemoverProduto.setForeground(new java.awt.Color(204, 204, 0));
        btnRemoverProduto.setText("Remover Produto");
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrecoTotal)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEfetuaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEfetuaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)))
        );

        jLabel2.setText("Código produto:");

        txtCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdutoActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade:");

        txtQtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtd.setText("1");
        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });

        btnMaisQtd.setText("+");
        btnMaisQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisQtdActionPerformed(evt);
            }
        });

        btnMenosQtd.setText("-");
        btnMenosQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosQtdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btnMenosQtd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMaisQtd)
                .addGap(43, 43, 43)
                .addComponent(btnColocarNoCarrinho)
                .addContainerGap(158, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnColocarNoCarrinho)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaisQtd)
                    .addComponent(btnMenosQtd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColocarNoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColocarNoCarrinhoActionPerformed
        
       if(ControladorCompra.getInstance().verificaSeOProdutoEstaNoCarrinho(Integer.parseInt(txtCodProduto.getText())) == false){
            ControladorCompra.getInstance().adicionaProdutoNoCarrinho(Integer.parseInt(txtCodProduto.getText()), Integer.parseInt(txtQtd.getText()));

            this.tabelaCarrinho = (DefaultTableModel) carrinho.getModel();
            Object dados[] = {ControladorCompra.getInstance().getCompra().getCarrinho().get(Integer.parseInt(txtCodProduto.getText())).getCodigo(),
                              ControladorCompra.getInstance().getCompra().getCarrinho().get(Integer.parseInt(txtCodProduto.getText())).getNome(),
                              Integer.parseInt(txtQtd.getText()),
                              df.format(ControladorCompra.getInstance().getCompra().getCarrinho().get(Integer.parseInt(txtCodProduto.getText())).getPreco()*Integer.parseInt(txtQtd.getText()))};
            this.tabelaCarrinho.addRow(dados);
            txtPrecoTotal.setText(df.format(ControladorCompra.getInstance().getCompra().getPrecoTotal()));
            ControladorCompra.getInstance().getCompra().exibeCarrinho();           
       } 
       
       else{
           JOptionPane.showMessageDialog(rootPane, "O produto já está no carrinho. Caso queira adicionar mais, remova-o e altere a quantidade!");
       }

        
    }//GEN-LAST:event_btnColocarNoCarrinhoActionPerformed

    private void txtCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdutoActionPerformed

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

    private void btnMaisQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisQtdActionPerformed
        Integer aux = Integer.parseInt(txtQtd.getText()) + 1;
        txtQtd.setText(aux.toString());
    }//GEN-LAST:event_btnMaisQtdActionPerformed

    private void btnMenosQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosQtdActionPerformed
        if(Integer.parseInt(txtQtd.getText()) > 1) {
            Integer aux = Integer.parseInt(txtQtd.getText()) - 1;
            txtQtd.setText(aux.toString());
        }

    }//GEN-LAST:event_btnMenosQtdActionPerformed

    private void txtPrecoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoTotalActionPerformed

    private void btnCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCompraActionPerformed
        
        if (ControladorPrincipal.getInstance().verificadorSenhaFuncionario().equals("0147")){
            ControladorCompra.getInstance().cancelarCompra();
            ControladorPrincipal.getInstance().setTela(0);
            dispose();            
        }
        
        else{
            JOptionPane.showMessageDialog(rootPane, "Senha incorreta!", "Alerta", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCancelarCompraActionPerformed

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        
        if(carrinho.getSelectedRow() != -1) // executa somente se tiver alguma linha selecionada
        {
            if (ControladorPrincipal.getInstance().verificadorSenhaFuncionario().equals("0147")) {
                String produtoRemovido = carrinho.getModel().getValueAt(carrinho.getSelectedRow(), 0).toString();
                String precoRemovido = carrinho.getModel().getValueAt(carrinho.getSelectedRow(), 3).toString();

                ControladorCompra.getInstance().removeProdutoDoCarrinho(Integer.parseInt(produtoRemovido), Double.parseDouble(precoRemovido));

                this.tabelaCarrinho.removeRow(carrinho.getSelectedRow());
                txtPrecoTotal.setText(df.format(ControladorCompra.getInstance().getCompra().getPrecoTotal()));
                ControladorCompra.getInstance().getCompra().exibeCarrinho();
            }
            
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Senha incorreta!", "Alerta", JOptionPane.ERROR_MESSAGE);
            }
     
        }
        

    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void btnEfetuaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuaPagamentoActionPerformed
        pagamento.setVisible(true);
        pagamento.setSize(420, 300);
        pagamento.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEfetuaPagamentoActionPerformed

    private void btnConfirmarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarPagamentoActionPerformed
        
        JOptionPane.showMessageDialog(this, "Insira o cartão");
        
        if(ControladorPrincipal.getInstance().verificadorSenhaCartao().equals("0258"))
        {
            ControladorCompra.getInstance().concluirCompra();
            JOptionPane.showMessageDialog(this, "Pagamento aprovado!");
            pagamento.dispose();
            cupomFiscal.setVisible(true);
            cupomFiscal.setSize(800, 455);
            cupomFiscal.setLocationRelativeTo(null);
            txtCupom.setText(ControladorCompra.getInstance().imprimeCupomFiscal() + "\n\n" + "PREÇO TOTAL: " + Double.toString(ControladorCompra.getInstance().getCompra().getPrecoTotal()));

        }
        
        else{
            JOptionPane.showMessageDialog(this, "Senha incorreta!", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarPagamentoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        pagamento.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        ControladorPrincipal.getInstance().setTela(0);
        cupomFiscal.dispose();
        dispose();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCompra;
    private javax.swing.JButton btnColocarNoCarrinho;
    private javax.swing.JButton btnConfirmarPagamento;
    private javax.swing.JButton btnEfetuaPagamento;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnMaisQtd;
    private javax.swing.JRadioButton btnMasterCredito;
    private javax.swing.JRadioButton btnMasterDebito;
    private javax.swing.JButton btnMenosQtd;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JRadioButton btnVisaCredito;
    private javax.swing.JRadioButton btnVisaDebito;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTable carrinho;
    private javax.swing.JDialog cupomFiscal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog pagamento;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextArea txtCupom;
    private javax.swing.JTextField txtPrecoTotal;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
