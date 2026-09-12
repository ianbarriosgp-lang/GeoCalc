/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import modelo.Trapecio;

/**
 *
 * @author Ian
 */
public class FrmTrapecio extends javax.swing.JFrame {

    
    public FrmTrapecio() {
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
        lblBaseMayor = new javax.swing.JLabel();
        txtBaseMayor = new javax.swing.JTextField();
        lblBaseMenor = new javax.swing.JLabel();
        txtBaseMenor = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lblLadoIzquierdo = new javax.swing.JLabel();
        txtLadoIzquierdo = new javax.swing.JTextField();
        lblLadoDerecho = new javax.swing.JLabel();
        txtLadoDerecho = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblArea = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        lblPerimetro = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("GeoCalc Studio - Trapecio");

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

        lblBaseMayor.setText("Base Mayor:");
        lblBaseMenor.setText("Base Menor:");
        lblAltura.setText("Altura:");
        lblLadoIzquierdo.setText("Lado Izquierdo:");
        lblLadoDerecho.setText("Lado derecho:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblArea.setText("Area:");
        txtArea.setEditable(false);

        lblPerimetro.setText("Perimetro:");
        txtPerimetro.setEditable(false);

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBaseMayor)
                    .addComponent(lblBaseMenor)
                    .addComponent(lblAltura)
                    .addComponent(lblLadoIzquierdo)
                    .addComponent(lblLadoDerecho)
                    .addComponent(lblArea)
                    .addComponent(lblPerimetro))
                .addGap(18, 18, 18)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBaseMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBaseMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLadoIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLadoDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseMayor)
                    .addComponent(txtBaseMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseMenor)
                    .addComponent(txtBaseMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoIzquierdo)
                    .addComponent(txtLadoIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoDerecho)
                    .addComponent(txtLadoDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnCalcular)
                .addGap(20, 20, 20)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetro)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            double baseMayor = Double.parseDouble(txtBaseMayor.getText().trim());
            double baseMenor = Double.parseDouble(txtBaseMenor.getText().trim());
            double altura = Double.parseDouble(txtAltura.getText().trim());
            double ladoIzquierdo = Double.parseDouble(txtLadoIzquierdo.getText().trim());
            double ladoDerecho = Double.parseDouble(txtLadoDerecho.getText().trim());

            Trapecio trapecio = new Trapecio(baseMayor, baseMenor, altura, ladoIzquierdo, ladoDerecho, 4);

            txtArea.setText(String.format("%.2f", trapecio.area()));
            txtPerimetro.setText(String.format("%.2f", trapecio.perimetro()));
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ingrese valores numericos validos en todos los campos.",
                    "Error de datos", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error de datos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        FrmTriangulo frm = new FrmTriangulo();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrapecioActionPerformed
        
    }//GEN-LAST:event_btnTrapecioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnRectangulo;
    private javax.swing.JButton btnTrapecio;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBaseMayor;
    private javax.swing.JLabel lblBaseMenor;
    private javax.swing.JLabel lblLadoDerecho;
    private javax.swing.JLabel lblLadoIzquierdo;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBaseMayor;
    private javax.swing.JTextField txtBaseMenor;
    private javax.swing.JTextField txtLadoDerecho;
    private javax.swing.JTextField txtLadoIzquierdo;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
