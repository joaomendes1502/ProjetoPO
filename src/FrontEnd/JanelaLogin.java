package FrontEnd;

import BackEnd.Sistema;
import Serializacao.Serializacao;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class JanelaLogin extends javax.swing.JFrame implements Serializable {

    private Sistema sistema;
    private Serializacao dados;
    
    public JanelaLogin(Sistema sistema, Serializacao dados) {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRegistar = new javax.swing.JButton();
        btnRegistar1 = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(238, 238, 238));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel3.setText("Username");

        btnEntrar.setBackground(new java.awt.Color(153, 153, 153));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOGIN LOGIN LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 400, 380));

        btnRegistar.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistar.setText("Terminar");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 230, 40));

        btnRegistar1.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistar1.setText("Registar");
        btnRegistar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 230, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (username.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza o seu username");
            username.requestFocus();
            return;
        }
        if (password.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Introduza a sua palavra passe", "ERRO", 1);
            password.requestFocus();
        return;
        }
        if (!sistema.autenticarUtilizador(username.getText().trim(), new String(password.getPassword()))) {
            JOptionPane.showMessageDialog(this, "As credenciais introduzidas não correspondem a um registo válido. Tente novamente!");
            username.requestFocus();
        } else{
            String primeiraLetra = (username.getText().substring(0, 1));
            if (primeiraLetra.equals("a")){
                dispose();
                JanelaAdm janela = new JanelaAdm(sistema, dados);
                janela.setVisible(true);
                
            } else if(primeiraLetra.equals("u")) {
                dispose();
                JanelaUtente janela = new JanelaUtente(sistema, dados);
                janela.setVisible(true);
                
            } else if(primeiraLetra.equals("s")){
                dispose();
                JanelaSeguranca janela = new JanelaSeguranca(sistema, dados);
                janela.setVisible(true);
            }         
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        dispose();
        
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void btnRegistar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistar1ActionPerformed
        dispose();
        JanelaRegistarUtente janela = new JanelaRegistarUtente(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnRegistar1ActionPerformed
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JButton btnRegistar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
