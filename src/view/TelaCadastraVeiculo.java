/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.VeiculoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.PersistenciaTxt;
import vo.VeiculoVo;

/**
 *
 * @author lukas
 */
public class TelaCadastraVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastraVeiculo
     */
    public TelaCadastraVeiculo() {
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
        txNmVeiculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txNmMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fmtMaksPlaca = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txNmCor = new javax.swing.JTextField();
        spQtdPorta = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnVerDados = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSaveBd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Marca");

        jLabel3.setText("Placa");

        jLabel4.setText("Cor");

        jLabel5.setText("Portas");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("A????es");

        btnCadastrar.setText("Cadastrar em Txt");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVerDados.setText("Ver Dados");
        btnVerDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDadosActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        btnSaveBd.setText("Salvar no bd");
        btnSaveBd.setActionCommand("");
        btnSaveBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txNmVeiculo)
                            .addComponent(jLabel2)
                            .addComponent(txNmMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fmtMaksPlaca)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txNmCor))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(spQtdPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(38, 38, 38))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSaveBd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerDados)))
                        .addGap(0, 134, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNmVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fmtMaksPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNmMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNmCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spQtdPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVerDados)
                    .addComponent(btnExcluir)
                    .addComponent(btnSaveBd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        VeiculoVo veiculo = new VeiculoVo();
        
        String nome = txNmVeiculo.getText();
        String marca = txNmMarca.getText();
        String placa = fmtMaksPlaca.getText();
        String cor = txNmCor.getText();
        int qtPorta = Integer.parseInt(spQtdPorta.getValue().toString());
        
        veiculo.setNome(nome);
        veiculo.setMarca(marca);
        veiculo.setPlaca(placa);
        veiculo.setQtdPortas(qtPorta);
        veiculo.setCor(cor);
        
        if(PersistenciaTxt.salvarDados(veiculo)){
            JOptionPane.showMessageDialog(null, "Sucesso ao inserir dados", "Sucesso", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSaveBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBdActionPerformed
        VeiculoDao dao = new VeiculoDao();
        
        VeiculoVo veiculo = new VeiculoVo();
        
        String nome = txNmVeiculo.getText();
        String marca = txNmMarca.getText();
        String placa = fmtMaksPlaca.getText();
        String cor = txNmCor.getText();
        int qtPorta = Integer.parseInt(spQtdPorta.getValue().toString());
        
        String[] campos = {nome, marca, placa, cor};
        
        for(String campo : campos){
            if(campo.isEmpty() && campo == null ){
                JOptionPane.showMessageDialog(null, "Campo " + campo + " deve ser preenchido", "Erro", JOptionPane.OK_OPTION);
            } else {
                veiculo.setNome(nome);
                veiculo.setMarca(marca);
                veiculo.setPlaca(placa);
                veiculo.setCor(cor);
            }
        }
        if(qtPorta <= 0){
            JOptionPane.showMessageDialog(null, "Campo placa deve ser preenchido", "Erro", JOptionPane.OK_OPTION);
        }else{
            veiculo.setQtdPortas(qtPorta);
        }
        
        try {
           
            if(dao.salvar(veiculo)){
                JOptionPane.showMessageDialog(null, "Sucesso ao inserir dados", "Sucesso", JOptionPane.OK_OPTION);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastraVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveBdActionPerformed

    private void btnVerDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDadosActionPerformed
        TelaLista tl = new TelaLista();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerDadosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastraVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastraVeiculo().setVisible(true);
            }
        });
    }
    
    private void validarCampos(String[] campos, int valor){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSaveBd;
    private javax.swing.JButton btnVerDados;
    private javax.swing.JFormattedTextField fmtMaksPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner spQtdPorta;
    private javax.swing.JTextField txNmCor;
    private javax.swing.JTextField txNmMarca;
    private javax.swing.JTextField txNmVeiculo;
    // End of variables declaration//GEN-END:variables
}
