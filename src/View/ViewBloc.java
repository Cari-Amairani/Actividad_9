/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Familia Hernández
 */
public class ViewBloc extends javax.swing.JFrame {

    /**
     * Creates new form Vistas
     */
    public ViewBloc() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Jta_texto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        Cifrar = new javax.swing.JMenuItem();
        Descifrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jta_texto.setColumns(20);
        Jta_texto.setRows(5);
        jScrollPane1.setViewportView(Jta_texto);

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 255));

        Menu.setText("Archivo");

        abrir.setText("Abrir");
        Menu.add(abrir);

        Guardar.setText("Guardar");
        Menu.add(Guardar);

        Cifrar.setText("Cifrar");
        Cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CifrarActionPerformed(evt);
            }
        });
        Menu.add(Cifrar);

        Descifrar.setText("Descifrar");
        Descifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescifrarActionPerformed(evt);
            }
        });
        Menu.add(Descifrar);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescifrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescifrarActionPerformed

    private void CifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CifrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CifrarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBloc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem Cifrar;
    public javax.swing.JMenuItem Descifrar;
    public javax.swing.JMenuItem Guardar;
    public javax.swing.JTextArea Jta_texto;
    public javax.swing.JMenu Menu;
    public javax.swing.JMenuItem abrir;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
