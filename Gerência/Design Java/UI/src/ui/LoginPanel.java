/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
        Mensagem.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JButton();
        fieldUser = new javax.swing.JTextField();
        user = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        Mensagem = new javax.swing.JLabel();
        fieldSenha = new javax.swing.JPasswordField();
        selecao = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1024, 530));

        Login.setBackground(new java.awt.Color(33, 150, 243));
        Login.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("LOGIN");
        Login.setIconTextGap(0);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        fieldUser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        fieldUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        fieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUserActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        user.setText("Nome de Usuário");

        senha.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        senha.setText("Senha");

        Mensagem.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Mensagem.setForeground(new java.awt.Color(255, 0, 0));
        Mensagem.setText("Nome de usuário ou senha incorreta");

        fieldSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        fieldSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        fieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSenhaActionPerformed(evt);
            }
        });

        selecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Professor", "Coordenador", "Diretor" }));
        selecao.setBorder(null);
        selecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selecao, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(Mensagem)))
                .addGap(0, 423, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(user)
                .addGap(11, 11, 11)
                .addComponent(fieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(senha)
                .addGap(18, 18, 18)
                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Mensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        try {
            BancoDeDados.Login.conectarBanco("localhost:3306", "root", "", "teste");
            switch(selecao.getSelectedIndex()){
                //Aluno
                case 0:
                Sessao.usuario = BancoDeDados.Login.logarAluno(fieldUser.getText(), String.valueOf(fieldSenha.getPassword()), "Alunos");
                //Professor
                case 1:
                Sessao.usuario = BancoDeDados.Login.logarProfessor(fieldUser.getText(), String.valueOf(fieldSenha.getPassword()), "Professores");
                //Coordenador
                case 2:
                Sessao.usuario = BancoDeDados.Login.logarCoordenador(fieldUser.getText(), String.valueOf(fieldSenha.getPassword()), "Coordenadores");
                //Diretor
                case 3:
                Sessao.usuario = BancoDeDados.Login.logarDiretor(fieldUser.getText(), String.valueOf(fieldSenha.getPassword()), "Diretores");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Sessao.usuario==null){
            Mensagem.setVisible(true);
        }else{

        }
    }//GEN-LAST:event_LoginActionPerformed

    private void fieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUserActionPerformed

    }//GEN-LAST:event_fieldUserActionPerformed

    private void fieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSenhaActionPerformed

    private void selecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel Mensagem;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JTextField fieldUser;
    private javax.swing.JComboBox<String> selecao;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
