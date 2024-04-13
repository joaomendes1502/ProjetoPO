package FrontEnd;

import BackEnd.Parque;
import BackEnd.PedidoAcesso;
import BackEnd.Sistema;
import BackEnd.TipoParque;
import BackEnd.Utente;
import Serializacao.Serializacao;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class JanelaUtenteSolicitarAssegurado extends javax.swing.JFrame {
    
    private Sistema sistema;
    private Serializacao dados;

    public JanelaUtenteSolicitarAssegurado(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        for(Parque p : sistema.getListaParques().listarParque()){
            if(p.getTipo().equals(TipoParque.LUGAR_ASSEGURADO)){
            comboParque.addItem(p.getCodigo());
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboParque = new javax.swing.JComboBox<>();
        btnSolicitar1 = new javax.swing.JButton();
        btnSolicitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

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
        jLabel1.setBounds(80, 30, 264, 51);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selecione um parque assegurado");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 130, 250, 36);

        comboParque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um parque..." }));
        comboParque.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(comboParque);
        comboParque.setBounds(35, 171, 284, 41);

        btnSolicitar1.setBackground(new java.awt.Color(153, 153, 153));
        btnSolicitar1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSolicitar1.setText("Voltar");
        btnSolicitar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSolicitar1);
        btnSolicitar1.setBounds(240, 240, 150, 36);

        btnSolicitar.setBackground(new java.awt.Color(153, 153, 153));
        btnSolicitar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSolicitar.setText("Solicitar compra");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSolicitar);
        btnSolicitar.setBounds(50, 240, 170, 36);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 440, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        Utente u = (Utente) sistema.getUtilizadorligado();
        
        if (comboParque.getSelectedItem().toString().equalsIgnoreCase("Selecione um parque...")) {
            JOptionPane.showMessageDialog(this, "Selecione um parque");
            return;
        }
        
       Parque p = sistema.getListaParques().obterParque(comboParque.getSelectedItem().toString());
       
       PedidoAcesso pa = new PedidoAcesso(TipoParque.LUGAR_ASSEGURADO, u, p);
       sistema.getListaPedidos().addPedido(pa);
       //sistema.getListaPedidos().concederLugar(pa); usar este metodo quando formos aprovar o pedido
       JOptionPane.showMessageDialog(this, "Pedido registado, aguarde atribuição!");
       dispose();
       JanelaUtente j = new JanelaUtente(sistema,dados);
       j.setVisible(true);
       
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void btnSolicitar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitar1ActionPerformed
        dispose();
        JanelaUtente janela = new JanelaUtente(sistema, dados);
        janela.setVisible(true);
        
    }//GEN-LAST:event_btnSolicitar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JButton btnSolicitar1;
    private javax.swing.JComboBox<String> comboParque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
