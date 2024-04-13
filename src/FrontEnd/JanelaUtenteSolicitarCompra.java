package FrontEnd;

import BackEnd.PedidoAcesso;
import BackEnd.Sistema;
import BackEnd.TipoParque;
import BackEnd.Utente;
import Serializacao.Serializacao;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class JanelaUtenteSolicitarCompra extends javax.swing.JFrame {
    
    private Sistema sistema;
    private Serializacao dados;
    
    public JanelaUtenteSolicitarCompra(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        verTipos();
        
    }
    
   private void verTipos() {
        TipoParque[]tipos = {TipoParque.CONDICIONADO, TipoParque.LIVRE, TipoParque.LUGAR_ASSEGURADO};
        for (TipoParque tipo : tipos) {
        comboParques.addItem(tipo.toString());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboParques = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Solicitar Compra");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(87, 30, 264, 51);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selecione o tipo de parque");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(25, 129, 220, 36);

        comboParques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tipo de parque..." }));
        comboParques.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comboParques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParquesActionPerformed(evt);
            }
        });
        jPanel2.add(comboParques);
        comboParques.setBounds(35, 171, 284, 41);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 420, 340));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 170, 36));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setText("Solicitar Compra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 170, 36));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        JanelaUtente j = new JanelaUtente(sistema, dados);
        j.setVisible(true);
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Utente u = (Utente) sistema.getUtilizadorligado();
        
        if (comboParques.getSelectedItem().toString().equalsIgnoreCase("Selecione um tipo de parque...")) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de parque!");
            return;
        }
        if(comboParques.getSelectedItem().toString().equalsIgnoreCase("Lugar_Assegurado")){
        dispose();
        JanelaUtenteSolicitarAssegurado j = new JanelaUtenteSolicitarAssegurado(sistema, dados);
        j.setVisible(true);
        }else if(comboParques.getSelectedItem().toString().equalsIgnoreCase("Livre")){
            PedidoAcesso p = new PedidoAcesso(TipoParque.LIVRE, u , null);
            sistema.getListaPedidos().addPedido(p);
            JOptionPane.showMessageDialog(this, "Pedido registado, aguarde atribuição!");
            dispose();
            JanelaUtente j = new JanelaUtente(sistema,dados);
            j.setVisible(true);
        }else{
            PedidoAcesso p = new PedidoAcesso(TipoParque.CONDICIONADO, u , null);
            sistema.getListaPedidos().addPedido(p);
            JOptionPane.showMessageDialog(this, "Pedido registado, aguarde atribuição!");
            dispose();
            JanelaUtente j = new JanelaUtente(sistema, dados);
            j.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboParquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParquesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboParquesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboParques;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
