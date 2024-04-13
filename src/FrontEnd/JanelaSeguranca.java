package FrontEnd;

import BackEnd.Sistema;
import Serializacao.Serializacao;

public class JanelaSeguranca extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;
   
    public JanelaSeguranca(Sistema sistema, Serializacao dados) {
        initComponents();
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEntrada = new javax.swing.JButton();
        btnSaida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViaturas = new javax.swing.JButton();
        btnParque = new javax.swing.JButton();
        btnAcessos = new javax.swing.JButton();
        btnAcessos1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEntrada.setBackground(new java.awt.Color(153, 153, 153));
        btnEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrada.setText("Registar Entrada");
        btnEntrada.setActionCommand("Dados");
        btnEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnSaida.setBackground(new java.awt.Color(153, 153, 153));
        btnSaida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSaida.setText("Registar Saída");
        btnSaida.setActionCommand("Dados");
        btnSaida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Segurança");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnViaturas.setBackground(new java.awt.Color(153, 153, 153));
        btnViaturas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViaturas.setText("Viaturas");
        btnViaturas.setActionCommand("Dados");
        btnViaturas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnViaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViaturasActionPerformed(evt);
            }
        });

        btnParque.setBackground(new java.awt.Color(153, 153, 153));
        btnParque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnParque.setText("Parques");
        btnParque.setActionCommand("Dados");
        btnParque.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnParque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParqueActionPerformed(evt);
            }
        });

        btnAcessos.setBackground(new java.awt.Color(153, 153, 153));
        btnAcessos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAcessos.setText("Acessos");
        btnAcessos.setActionCommand("Dados");
        btnAcessos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAcessos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnParque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAcessos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnParque, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAcessos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 430, 400));

        btnAcessos1.setBackground(new java.awt.Color(153, 153, 153));
        btnAcessos1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAcessos1.setText("Sair");
        btnAcessos1.setActionCommand("Dados");
        btnAcessos1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAcessos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessos1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcessos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 80, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViaturasActionPerformed
        dispose();
        JanelaSegurancaViaturas janela = new JanelaSegurancaViaturas(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnViaturasActionPerformed

    private void btnParqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParqueActionPerformed
        dispose();
        JanelaSegurancaParques janela = new JanelaSegurancaParques(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnParqueActionPerformed

    private void btnAcessosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessosActionPerformed
        dispose();
        JanelaSegurancaAcesso janela = new JanelaSegurancaAcesso(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnAcessosActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        dispose();
        JanelaSegurancaEntrada janela = new JanelaSegurancaEntrada(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
        dispose();
        JanelaSegurancaSaida janela = new JanelaSegurancaSaida(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void btnAcessos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessos1ActionPerformed
        dispose();
        JanelaLogin janela = new JanelaLogin(sistema, dados);
        dados.guardar(sistema);
        janela.setVisible(true);
    }//GEN-LAST:event_btnAcessos1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessos;
    private javax.swing.JButton btnAcessos1;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnParque;
    private javax.swing.JButton btnSaida;
    private javax.swing.JButton btnViaturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}