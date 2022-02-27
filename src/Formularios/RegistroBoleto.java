package Formularios;


import Clases.Persona;
import Clases.Boletos;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class RegistroBoleto extends javax.swing.JFrame {
    public ArrayList<Boletos> listaboleto;


    public RegistroBoleto() {
        initComponents();
        listaboleto=new ArrayList<>();
        this.setLocationRelativeTo(null);
    }
    public void listamostrar(){
    DefaultListModel modelo =new DefaultListModel();
    for (int i=0; i<listaboleto.size(); i++){
        modelo.addElement(listaboleto.get(i).getCodBoleto()+" ||  "+listaboleto.get(i).getNombre()+" || "+listaboleto.get(i).getCodAvion()+" || "+listaboleto.get(i).getAsiento()+" || "+listaboleto.get(i).getDestino()+" || "+listaboleto.get(i).getVueloIda()+" || "+listaboleto.get(i).getVueloVenida()+" || "+listaboleto.get(i).getClaseViaje()+" || "+listaboleto.get(i).getPrecio());
    }
    listabo.setModel(modelo);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcodboleto = new javax.swing.JTextField();
        txtnombreboleto = new javax.swing.JTextField();
        txtcodavion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listabo = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        bnteliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        caleida = new com.toedter.calendar.JCalendar();
        jLabel10 = new javax.swing.JLabel();
        txtdestino = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        calevenida = new com.toedter.calendar.JCalendar();
        jLabel12 = new javax.swing.JLabel();
        comClase = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        comAsiento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel1.setText("CODIGO BOLETO");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setText("CODIGO AVION");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel4.setText("N ASIENTO");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setText("DESTINO");

        txtcodboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodboletoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listabo);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel9.setText("REGISTRO DE BOLETOS ");

        btnagregar.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        bnteliminar.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        bnteliminar.setText("ELIMINAR");
        bnteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnteliminarActionPerformed(evt);
            }
        });

        btnmostrar.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnmostrar.setText("MOSTRAR");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        btncerrar.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btncerrar.setText("CERRAR");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel10.setText("VUELDO DE VENIDA");

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel11.setText("VUELO DE IDA");

        jLabel12.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel12.setText("CLASE DE VUELO");

        comClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLASE TURISTA", "CLASE MEDIA", "CLASE ALTA" }));
        comClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comClaseActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setText("PRECIO");

        comAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(caleida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(calevenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtcodavion, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcodboleto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(137, 137, 137)
                                                        .addComponent(jLabel6))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(comAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel12)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtprecio)
                                                    .addComponent(comClase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(txtnombreboleto, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnagregar)
                        .addGap(43, 43, 43)
                        .addComponent(bnteliminar)
                        .addGap(53, 53, 53)
                        .addComponent(btnmostrar)
                        .addGap(45, 45, 45)
                        .addComponent(btncerrar)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel11)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel9)))
                .addGap(0, 144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcodboleto, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombreboleto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcodavion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(comClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtprecio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caleida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calevenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(bnteliminar)
                    .addComponent(btnmostrar)
                    .addComponent(btncerrar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodboletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodboletoActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        Boletos boleto=new Boletos();
         String Codbole;
    String nombreB;
    String asiento;
     int asientop=0;
     String Codavip;
     String destip;
     String vuelIda;
     String vueloVeni;
     String clase;
     String preciop;
     double precio=0;
     Codbole=txtcodboleto.getText();
     nombreB=txtnombreboleto.getText();
     Codavip=txtcodavion.getText();
     asiento=comAsiento.getSelectedItem().toString();
     
         try{
     asientop=Integer.parseInt(asiento);
     } catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null,"EL DATO DEBE SER NUMERICO","ERROR",JOptionPane.ERROR_MESSAGE);
         
     }
     destip=txtdestino.getText();
     vuelIda=caleida.getInsets().toString();;
     vueloVeni=calevenida.getInsets().toString();
     clase=comClase.getSelectedItem().toString();
     preciop=txtprecio.getText();
        try{
     precio=Integer.parseInt(preciop);
     } catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null,"EL DATO DEBE SER NUMERICO","ERROR",JOptionPane.ERROR_MESSAGE);
         
     }
     boleto.setCodBoleto(Codbole);
     boleto.setNombre(nombreB);
     boleto.setCodAvion(Codavip);
     boleto.setAsiento(asientop);
     boleto.setDestino(destip);
     boleto.setVueloIda(vuelIda);
     boleto.setVueloVenida(vueloVeni);
     boleto.setClaseViaje(clase);
     boleto.setPrecio(precio);
        
    
    listaboleto.add(boleto);
    JOptionPane.showMessageDialog(null,"REGISTRO AGREGADO","AGREGAR",JOptionPane.INFORMATION_MESSAGE);
    listamostrar();
       txtcodboleto.setText(null);
        txtnombreboleto.setText(null);
        txtcodavion.setText(null);
        txtdestino.setText(null);
     txtprecio.setText(null);
     caleida.setToolTipText(null);
     calevenida.setToolTipText(null);
     comAsiento.setToolTipText(null);
     
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        //String nom = JOptionPane.showInputDialog ( "INGRESE EL NOMBRE A BUSCAR:" );
        int row=listabo.getSelectedIndex();
        if (row==-1){
            JOptionPane.showMessageDialog(null,"SELLECIONE UN ELEMENTO DE LA LISTA","AVISO",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
         JOptionPane.showMessageDialog(null,listaboleto.get(row).getDatos(),"MOSTAR",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        // TODO add your handling code here:
          Aerolinea verformulario1=new Aerolinea(); 
          verformulario1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void bnteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnteliminarActionPerformed
        // TODO add your handling code here:
      
     int row=listabo.getSelectedIndex();
     DefaultListModel modelo = (DefaultListModel) listabo.getModel();
   
        if (row==-1){
            JOptionPane.showMessageDialog(null,"SELLECIONE UN ELEMENTO DE LA LISTA","AVISO",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        int res=JOptionPane.showConfirmDialog(this,"DESEAS ELIMINAR ESTE REGISTRO","SISTEMA",JOptionPane.INFORMATION_MESSAGE);
        if (res==JOptionPane.YES_OPTION){
            int index = listabo.getSelectedIndex();
            modelo.remove(index);
       
        }
        }
     
    }//GEN-LAST:event_bnteliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String valor=JOptionPane.showInputDialog("INGRESE EL DUI A BUSCAR ");
        for (int i = 0; i < listaboleto.size(); i++) {
            if (listaboleto.get(i).equals(valor)){
         JOptionPane.showMessageDialog(null,"Valor Encontrado");
         JOptionPane.showMessageDialog(null,listaboleto.get(i).getDatos(),"MOSTAR",JOptionPane.PLAIN_MESSAGE);
        }else {
        JOptionPane.showMessageDialog(null,"Valor NO Encontrado");
        }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comClaseActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroBoleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnteliminar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnmostrar;
    private com.toedter.calendar.JCalendar caleida;
    private com.toedter.calendar.JCalendar calevenida;
    private javax.swing.JComboBox<String> comAsiento;
    private javax.swing.JComboBox<String> comClase;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listabo;
    private javax.swing.JTextField txtcodavion;
    private javax.swing.JTextField txtcodboleto;
    private javax.swing.JTextField txtdestino;
    private javax.swing.JTextField txtnombreboleto;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
