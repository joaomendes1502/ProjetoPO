package FrontEnd;

import BackEnd.EntradaSaida;
import BackEnd.Parque;
import BackEnd.Sistema;
import Serializacao.Serializacao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class JanelaSegurancaViaturas extends javax.swing.JFrame {
    
    private Sistema sistema;
    private Serializacao dados;
    private AbstractTableModel modeloTabela;

    public JanelaSegurancaViaturas(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.modeloTabela = criarTabela();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        jTable1.setModel(modeloTabela);
        
        for(Parque p : sistema.getListaParques().listarParques()){
            comboParque.addItem(p.getCodigo());
        }      
    }  
    
    private AbstractTableModel criarTabela() {
        String[] nomeColunas = {"Matrícula do Automóvel", "Parque"};
        
        jLabel8.setText("Viaturas atuais");

        return new AbstractTableModel() {
            @Override
            public String getColumnName(int column) {
                return nomeColunas[column];
            }

            @Override
            public int getRowCount() {
                
               return sistema.getListaControlo().getViaturasAtuais().size();
                
            }

            @Override
            public int getColumnCount() {
                
                return nomeColunas.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                
                EntradaSaida es = sistema.getListaControlo().getViaturasAtuais().get(rowIndex);
                
                
                switch (columnIndex) {
                    case 0:
                        return es.getViatura().getMatricula();
                    case 1:
                        return es.getParque().getCodigo();
                    default:
                        return "";
                }
            }
        };
    }
  private void atualizar() {
        modeloTabela.fireTableDataChanged();
    }
  
  private AbstractTableModel criarTabelaDatas() {
        String[] nomeColunas = {"Matrícula do Automóvel", "Parque", "Data e Hora"};
        
        jLabel8.setText("Viaturas por Data");   

        return new AbstractTableModel() {
            @Override
            public String getColumnName(int column) {
                return nomeColunas[column];
            }

            @Override
            public int getRowCount() {
                
                //vamos escrever o tst da data, a linha 84 é o formato da data e na linha 85 passa o tst para o formato de uma data
                
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            LocalDate data = LocalDate.parse(txtData.getText(), formatter);
                
            return sistema.getListaControlo().getViaturasPorData(data).size();
                
            }

            @Override
            public int getColumnCount() {
                
                return nomeColunas.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d MMM uuuu HH:mm");
            LocalDate data = LocalDate.parse(txtData.getText(), formatter);
            
                
            EntradaSaida es = sistema.getListaControlo().getViaturasPorData(data).get(rowIndex);
                
                switch (columnIndex) {
                    case 0:
                        return es.getViatura().getMatricula();
                    case 1:
                        return es.getParque().getCodigo();
                    case 2:
                        return es.getDataEntrada().format(formatter2);
                    default:
                        return "";
                }
            }
        };
    }
  
  private AbstractTableModel criarTabelaDatasEParque() {
        String[] nomeColunas = {"Matrícula do Automóvel", "Parque", "Data e Hora"};
        
        jLabel8.setText("Viaturas por Data e Parque");

        return new AbstractTableModel() {
            @Override
            public String getColumnName(int column) {
                return nomeColunas[column];
            }

            @Override
            public int getRowCount() {
                
                //vamos escrever o tst da data, a linha 84 é o formato da data e na linha 85 passa o tst para o formato de uma data
                
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            LocalDate data = LocalDate.parse(txtData.getText(), formatter);
            Parque p = sistema.getListaParques().obterParque(comboParque.getSelectedItem().toString());
                
            return sistema.getListaControlo().getViaturasPorDataEParque(data, p).size();
                
            }

            @Override
            public int getColumnCount() {
                
                return nomeColunas.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d MMM uuuu HH:mm");
            LocalDate data = LocalDate.parse(txtData.getText(), formatter);
            Parque p = sistema.getListaParques().obterParque(comboParque.getSelectedItem().toString());
              
            EntradaSaida es = sistema.getListaControlo().getViaturasPorDataEParque(data, p).get(rowIndex);
                
                switch (columnIndex) {
                    case 0:
                        return es.getViatura().getMatricula();
                    case 1:
                        return es.getParque().getCodigo();
                    case 2:
                        return es.getDataEntrada().format(formatter2);
                    default:
                        return "";
                }
            }
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtData = new javax.swing.JTextField();
        comboParque = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(246, 246, 246));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Viaturas nas intalações");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 350, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 180));

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        jPanel4.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 210, 40));

        comboParque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um parque..." }));
        comboParque.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(comboParque, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 230, 40));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 160, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Introduza uma data");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Selecione o parque");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 540, 460));

        btnVoltar.setBackground(new java.awt.Color(153, 153, 153));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 140, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtData.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza uma data!");
            txtData.requestFocus();
            return;
        }
       if(comboParque.getSelectedItem().equals("Selecione um parque...")){
            this.modeloTabela = criarTabelaDatas();
            jTable1.setModel(modeloTabela);
        }else{
            this.modeloTabela = criarTabelaDatasEParque();
            jTable1.setModel(modeloTabela);  
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        JanelaSeguranca janela = new JanelaSeguranca(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboParque;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
