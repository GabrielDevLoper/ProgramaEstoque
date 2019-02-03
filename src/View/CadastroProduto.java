
package View;

import Model.Bean.Produto;
import Model.DAO.ProdutoDAO;


public class CadastroProduto extends javax.swing.JFrame {
    Produto p = new Produto();
    ProdutoDAO pdao = new ProdutoDAO();
    public CadastroProduto() {
        initComponents();
       
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtUnd = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtValorUnd = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Descrição");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 26, 59, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Unidade");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 57, 49, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quantidade");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 88, 70, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor UND");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 119, 62, 17);
        getContentPane().add(txtDesc);
        txtDesc.setBounds(104, 16, 237, 30);
        getContentPane().add(txtUnd);
        txtUnd.setBounds(104, 47, 100, 30);
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(104, 78, 59, 30);
        getContentPane().add(txtValorUnd);
        txtValorUnd.setBounds(104, 109, 59, 30);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(77, 225, 63, 33);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(243, 225, 66, 33);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dados.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 370, 280);

        setSize(new java.awt.Dimension(386, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void LimparCampoDeTextos(){
        txtDesc.setText("");
        txtUnd.setText("");
        txtQuantidade.setText("");
        txtValorUnd.setText("");
    }
    
    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        p.setDescricao(txtDesc.getText().toUpperCase());
        p.setUnidade(txtUnd.getText().toUpperCase());
        p.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        p.setPrecoPorUnd(Double.parseDouble(txtValorUnd.getText()));
        p.setPrecoTotal(p.getQuantidade()* p.getPrecoPorUnd());
        pdao.Salvar(p);
        
        LimparCampoDeTextos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtUnd;
    private javax.swing.JTextField txtValorUnd;
    // End of variables declaration//GEN-END:variables
}
