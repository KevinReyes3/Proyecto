package Formularios;


import Clases.Persona;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class RegistroPersona extends javax.swing.JFrame {
    public ArrayList<Persona> listaPersona;


    public RegistroPersona() {
        initComponents();
        listaPersona=new ArrayList<>();
        this.setLocationRelativeTo(null);
    }
    public void listamostrar(){
    DefaultListModel modelo =new DefaultListModel();
    for (int i=0; i<listaPersona.size(); i++){
        modelo.addElement(listaPersona.get(i).getdui()+" ||  "+listaPersona.get(i).getnombre()+" || "+listaPersona.get(i).getapellidos()+" || "+listaPersona.get(i).getedad()+" || "+listaPersona.get(i).getDireccion()+" || "+listaPersona.get(i).getcorreo()+" || "+listaPersona.get(i).getusuario()+" || "+listaPersona.get(i).getcontra());
    }
    lista.setModel(modelo);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdui = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdireccion = new javax.swing.JTextArea();
        txtcorreo = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtcontra = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        bnteliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel1.setText("DUI");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setText("APELLIDO");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel4.setText("EDAD");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setText("DIRECCION");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setText("CORREO");

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel7.setText("USUARIO");

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel8.setText("CONTRASEÑA");

        txtdui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtduiActionPerformed(evt);
            }
        });

        txtdireccion.setColumns(20);
        txtdireccion.setRows(5);
        jScrollPane1.setViewportView(txtdireccion);

        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });

        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lista);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel9.setText("REGISTRO DE USUARIOS ");

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

        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(321, 321, 321))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtdui, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnagregar)
                                                .addGap(18, 18, 18)
                                                .addComponent(bnteliminar)
                                                .addGap(21, 21, 21)
                                                .addComponent(btnmostrar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(btncerrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnlimpiar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(184, 184, 184))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdui, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtedad, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(bnteliminar)
                    .addComponent(btnmostrar)
                    .addComponent(btncerrar)
                    .addComponent(jButton1)
                    .addComponent(btnlimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtduiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtduiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtduiActionPerformed

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        Persona persona=new Persona();
         String nombrep;
    String apellidosp;
    String edad;
     int Edadp=0;
     String Direccionp;
     String Duip;
     String usuariop;
     String correop;
     String Contrap;
     Duip=txtdui.getText();
     nombrep=txtnombre.getText();
     apellidosp=txtapellido.getText();
     edad=txtedad.getText();
         try{
     Edadp=Integer.parseInt(edad);
     } catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null,"EL DATO DEBE SER NUMERICO","ERROR",JOptionPane.ERROR_MESSAGE);
         
     }
     Direccionp=txtdireccion.getText();
     correop=txtcorreo.getText();
     usuariop=txtusuario.getText();
     Contrap=txtcontra.getText();
     persona.setDui(Duip);
    persona.setNombre(nombrep);
    persona.setApellidos(apellidosp);
    persona.setEdad(Edadp);
    persona.setDireccion(Direccionp);
    persona.setCorreo(correop);
    persona.setUsuario(usuariop);
    persona.setContra(Contrap);
    listaPersona.add(persona);
    JOptionPane.showMessageDialog(null,"REGISTRO AGREGADO","AGREGAR",JOptionPane.INFORMATION_MESSAGE);
    listamostrar();
        txtdui.setText(null);
        txtnombre.setText(null);
        txtapellido.setText(null);
        txtedad.setText(null);
        txtdireccion.setText(null);
        txtcorreo.setText(null);
        txtusuario.setText(null);
        txtcontra.setText(null);
        txtdui.requestFocus();
    
     
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        //String nom = JOptionPane.showInputDialog ( "INGRESE EL NOMBRE A BUSCAR:" );
        int row=lista.getSelectedIndex();
        if (row==-1){
            JOptionPane.showMessageDialog(null,"SELLECIONE UN ELEMENTO DE LA LISTA","AVISO",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
         JOptionPane.showMessageDialog(null,listaPersona.get(row).getDatos(),"MOSTAR",JOptionPane.PLAIN_MESSAGE);
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
      int row=lista.getSelectedIndex();
     DefaultListModel modelo = (DefaultListModel) lista.getModel();
   
        if (row==-1){
            JOptionPane.showMessageDialog(null,"SELLECIONE UN ELEMENTO DE LA LISTA","AVISO",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        int res=JOptionPane.showConfirmDialog(this,"DESEAS ELIMINAR ESTE REGISTRO","SISTEMA",JOptionPane.INFORMATION_MESSAGE);
        if (res==JOptionPane.YES_OPTION){
            int index = lista.getSelectedIndex();
            modelo.remove(index);
       
        }
        }
    }//GEN-LAST:event_bnteliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String valor=JOptionPane.showInputDialog("INGRESE EL DUI A BUSCAR ");
        for (int i = 0; i < listaPersona.size(); i++) {
            for (int j = 0; j <9; j++) {
            if (listaPersona.get(j).equals(valor)){
         JOptionPane.showMessageDialog(null,"Valor Encontrado");
         JOptionPane.showMessageDialog(null,listaPersona.get(i).getDatos(),"MOSTAR",JOptionPane.PLAIN_MESSAGE);
        }else {
        JOptionPane.showMessageDialog(null,"Valor NO Encontrado");
        }
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        // TODO add your handling code here:
    
         for (int i=0; i<listaPersona.size(); i++){
        
        txtdui.setText(listaPersona.get(i).getdui());
        txtnombre.setText(listaPersona.get(i).getnombre());
        txtapellido.setText(listaPersona.get(i).getapellidos());
      
        String Edadp=String.valueOf(listaPersona.get(i).getedad());
        txtedad.setText(Edadp);
        txtdireccion.setText(listaPersona.get(i).getDireccion());
        txtcorreo.setText(listaPersona.get(i).getcorreo());
        txtusuario.setText(listaPersona.get(i).getusuario());
        txtcontra.setText(listaPersona.get(i).getcorreo());
    }
        
        
        
    }//GEN-LAST:event_listaMouseClicked

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        txtdui.setText(null);
        txtnombre.setText(null);
        txtapellido.setText(null);
        txtedad.setText(null);
        txtdireccion.setText(null);
        txtcorreo.setText(null);
        txtusuario.setText(null);
        txtcontra.setText(null);
        txtdui.requestFocus();
    }//GEN-LAST:event_btnlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnteliminar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcontra;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextArea txtdireccion;
    private javax.swing.JTextField txtdui;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
