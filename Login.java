/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stellartest;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author aturn
 * ~Documentation goes here~
 */
public class Login extends javax.swing.JFrame {

    //Creates Login form
    public Login() {
        initComponents();
        staricon();
        setTitle("Stellar Login");
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        login_title = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        id_input = new javax.swing.JTextField();
        id_line = new javax.swing.JSeparator();
        pass_label = new javax.swing.JLabel();
        pass_input = new javax.swing.JPasswordField();
        pass_line = new javax.swing.JSeparator();
        login_button = new javax.swing.JButton();
        newuser_label = new javax.swing.JLabel();
        register_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_panel.setBackground(new java.awt.Color(33, 16, 27));
        main_panel.setMaximumSize(new java.awt.Dimension(680, 500));
        main_panel.setMinimumSize(new java.awt.Dimension(680, 500));

        login_title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        login_title.setForeground(new java.awt.Color(255, 255, 255));
        login_title.setText("Login");

        id_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        id_label.setForeground(new java.awt.Color(255, 255, 255));
        id_label.setText("Student ID:");

        id_input.setBackground(new java.awt.Color(33, 16, 27));
        id_input.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        id_input.setForeground(new java.awt.Color(255, 255, 255));
        id_input.setBorder(null);
        id_input.setCaretColor(new java.awt.Color(255, 255, 255));
        id_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        pass_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pass_label.setForeground(new java.awt.Color(255, 255, 255));
        pass_label.setText("Password:");

        pass_input.setBackground(new java.awt.Color(33, 16, 27));
        pass_input.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        pass_input.setForeground(new java.awt.Color(255, 255, 255));
        pass_input.setBorder(null);
        pass_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        login_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        login_button.setText("Login");

        newuser_label.setForeground(new java.awt.Color(255, 255, 255));
        newuser_label.setText("New User? Register here:");

        register_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        register_button.setText("Register");
        register_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_buttonMouseClicked(evt);
            }
        });
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass_label)
                            .addComponent(id_label)
                            .addComponent(id_input)
                            .addComponent(id_line)
                            .addComponent(pass_input, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                            .addComponent(pass_line)))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(newuser_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(register_button)))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                        .addComponent(login_title)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                        .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270))))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_title)
                .addGap(50, 50, 50)
                .addComponent(id_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newuser_label)
                    .addComponent(register_button))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_buttonActionPerformed

    private void register_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_buttonMouseClicked
        Register rf = new Register();
        rf.setVisible(true);
        rf.pack();
        rf.setLocationRelativeTo(null);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_register_buttonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       //For the Nimbus Look
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        //Creates and displays the windows
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    //Method used to set the icon of the program to be a star
    public void staricon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("star-icon.png")));
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_input;
    private javax.swing.JLabel id_label;
    private javax.swing.JSeparator id_line;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel login_title;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel newuser_label;
    private javax.swing.JPasswordField pass_input;
    private javax.swing.JLabel pass_label;
    private javax.swing.JSeparator pass_line;
    private javax.swing.JButton register_button;
    // End of variables declaration//GEN-END:variables
}
