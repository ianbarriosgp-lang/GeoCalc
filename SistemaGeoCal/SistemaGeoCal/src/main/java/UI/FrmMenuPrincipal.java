/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author Ian
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName());

   
    public FrmMenuPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnRectangulo = new javax.swing.JButton();
        btnCuadrado = new javax.swing.JButton();
        btnTriangulo = new javax.swing.JButton();
        btnTrapecio = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();
        lblInstrucciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("GeoCalc Studio");

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        btnRectangulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRectangulo.setText("Rectangulo");
        btnRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectanguloActionPerformed(evt);
            }
        });

        btnCuadrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCuadrado.setText("Cuadrado");
        btnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadradoActionPerformed(evt);
            }
        });

        btnTriangulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTriangulo.setText("Triangulo");
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        btnTrapecio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTrapecio.setText("Trapecio");
        btnTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrapecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTriangulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTrapecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
            .addComponent(btnCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        lblInstrucciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInstrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstrucciones.setText("<html><div style='text-align:center;'>SELECCIONE UNA FIGURA PARA<br>CALCULAR EL AREA Y PERIMETRO</div></html>");

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lblInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(pnlContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        FrmTriangulo frm = new FrmTriangulo();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectanguloActionPerformed
        FrmRectangulo frm = new FrmRectangulo();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRectanguloActionPerformed

    private void btnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadradoActionPerformed
        FrmCuadrado frm = new FrmCuadrado();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCuadradoActionPerformed

    private void btnTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrapecioActionPerformed
        FrmTrapecio frm = new FrmTrapecio();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrapecioActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> new FrmMenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnRectangulo;
    private javax.swing.JButton btnTrapecio;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContenido;
    // End of variables declaration//GEN-END:variables
}
