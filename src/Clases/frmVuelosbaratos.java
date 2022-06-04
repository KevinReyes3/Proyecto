
package Clases;

import Clases.Vuelosbaratos;
import Clases.frmTablaDatos;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class frmVuelosbaratos extends javax.swing.JFrame {
        public static LinkedList contenedor=new LinkedList();
    public int buscar;


    public frmVuelosbaratos() {
        initComponents();
    }
    
    public void Validar()
    {
     
            if (txtOrigen.getText().isEmpty())
            {
                lblOrigen.setText("Por Favor complete los campos");
                if (txtDestino.getText().isEmpty())
                {
                    lblDestino.setText("Por Favor complete los campos");
                    if (cboTipo.getSelectedIndex()!=1)
                    {
                        lblTipopasajero.setText("Por Favor complete los campos");
                        if (cboCantidad.getSelectedIndex() !=1)
                        {
                            lblCantidad.setText("Por Favor complete los campos");
                        }else{
                          lblCantidad.setText("");
                        }
 
                    }else{
                         lblTipopasajero.setText("");
                    }
                }else{
                      lblDestino.setText("");
                }
            }else{
                lblOrigen.setText("");
            }
      
    }
    
//    public void Validar(){
//  try{
//    if (txtOrigen.getText().isEmpty()) {
//        lblOrigen.setText("Por favor completar el campo");
//    }else{
//        lblOrigen.setText("");
//    }
//        if (txtDestino.getText().isEmpty())
//        {
//            lblDestino.setText("Por favor completar el campo");
//        }else  {
//            lblDestino.setText("");
//            JOptionPane.showMessageDialog(this,"Por favor Complete Todos los Campos","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
//        }
//     
//     
//        if (cboTipo.getSelectedIndex()!=0)
//        {
//            
//        }else{
//           JOptionPane.showMessageDialog(this,"Por favor Complete Todos los Campos","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
//        }
//  }catch(Exception e){
//      JOptionPane.showMessageDialog(this, e.getMessage());
//  }
//          
//}
    
      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        cboCantidad = new javax.swing.JComboBox<>();
        cboTipo = new javax.swing.JComboBox<>();
        lblDestino = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblTipopasajero = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnElimina = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        btnGuarda = new javax.swing.JButton();
        btnSali = new javax.swing.JButton();
        btnMuestra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VUELOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide Shows/Ida.jpg"))); // NOI18N
        jLabel1.setText("Origen:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide Shows/destino.png"))); // NOI18N
        jLabel2.setText("Destino:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide Shows/tipo de pasajero.png"))); // NOI18N
        jLabel4.setText("Tipo de Pasajero:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide Shows/cantidad.jpg"))); // NOI18N
        jLabel5.setText("Cantidad de Pasajeros:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        cboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONE-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONE-", "Adultos", "Niños", "Bebés", " " }));

        lblDestino.setForeground(new java.awt.Color(204, 0, 0));

        lblCantidad.setForeground(new java.awt.Color(204, 0, 0));

        lblTipopasajero.setForeground(new java.awt.Color(204, 0, 0));

        lblOrigen.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblOrigen.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtOrigen))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(106, 106, 106))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTipopasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipopasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrigen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDestino)))
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnElimina.setBackground(new java.awt.Color(204, 255, 255));
        btnElimina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide Shows/Eliminar.png"))); // NOI18N
        btnElimina.setText("Eliminar");
        btnElimina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        btnModifica.setBackground(new java.awt.Color(204, 255, 255));
        btnModifica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide Shows/Modificar.png"))); // NOI18N
        btnModifica.setText("Modificar");
        btnModifica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        btnGuarda.setBackground(new java.awt.Color(204, 255, 255));
        btnGuarda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide Shows/Guardar.png"))); // NOI18N
        btnGuarda.setText("Guardar");
        btnGuarda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaActionPerformed(evt);
            }
        });

        btnSali.setBackground(new java.awt.Color(204, 255, 255));
        btnSali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide Shows/sal.png"))); // NOI18N
        btnSali.setText("Salir");
        btnSali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaliActionPerformed(evt);
            }
        });

        btnMuestra.setBackground(new java.awt.Color(204, 255, 255));
        btnMuestra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMuestra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide Shows/Mostrar.png"))); // NOI18N
        btnMuestra.setText("Mostrar Tabla");
        btnMuestra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuestraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModifica, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(btnGuarda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElimina, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuarda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSali, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        contenedor.remove(buscar);
        txtOrigen.setText("");
        txtDestino.setText("");
        cboCantidad.setSelectedIndex(-1);
        cboTipo.setSelectedIndex(-1);
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        String Ida=txtOrigen.getText();
        String Destinos=txtDestino.getText();
        String Vuelta=(String) cboTipo.getSelectedItem();
        String cantidadPasajero=(String) cboCantidad.getSelectedItem();

        

        Vuelosbaratos a=new Vuelosbaratos(Ida,Destinos,cantidadPasajero,Vuelta);
        contenedor.set(buscar,a);
        //limpiador
        txtOrigen.setText("");
        txtDestino.setText("");
        cboCantidad.setSelectedIndex(-1);
        cboTipo.setSelectedIndex(-1);
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaActionPerformed
       Validar();
        String Ida=txtOrigen.getText();
        String Destinos=txtDestino.getText();
        String Vuelta=(String) cboTipo.getSelectedItem();
        String cantidadPasajero=(String) cboCantidad.getSelectedItem();
//        String Vuelta="";

        // catalog clasecatalog=new catalog(Destinos,Ida,Vuelta,MDestinos,ClaseViaje);
        Vuelosbaratos claseVuelo=new Vuelosbaratos(Ida,Destinos,cantidadPasajero,Vuelta);
        contenedor.add(claseVuelo);
        //limpiadores
        txtOrigen.setText("");
        txtDestino.setText("");
        cboTipo.setSelectedIndex(-1);
        cboCantidad.setSelectedIndex(-1);
    }//GEN-LAST:event_btnGuardaActionPerformed

    private void btnSaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaliActionPerformed
        dispose();
    }//GEN-LAST:event_btnSaliActionPerformed

    private void btnMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuestraActionPerformed
       frmTablaDatos tabla=new frmTablaDatos();
       tabla.setVisible(true);
    }//GEN-LAST:event_btnMuestraActionPerformed

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
            java.util.logging.Logger.getLogger(frmVuelosbaratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVuelosbaratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVuelosbaratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVuelosbaratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVuelosbaratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnGuarda;
    private javax.swing.JButton btnModifica;
    private javax.swing.JButton btnMuestra;
    private javax.swing.JButton btnSali;
    private javax.swing.JComboBox<String> cboCantidad;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblTipopasajero;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables

    public void Validar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
