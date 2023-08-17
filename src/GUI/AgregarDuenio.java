
package GUI;

import LOGIC.Duenio;
import LOGIC.Validacion;
import SQL.Conexion;

public class AgregarDuenio extends javax.swing.JInternalFrame {

    Validacion val = null;
    public AgregarDuenio() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        btnAggDuenio = new javax.swing.JButton();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 618, 906, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Apellido:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 70, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Direccion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 178, 52));
        jLabel2.setText("Agregar Dueño");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Edad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 200, -1));

        txtApellido.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 200, -1));

        txtNombre.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 200, -1));

        txtEdad.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 150, 30));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 240, 80));

        btnAggDuenio.setBackground(new java.awt.Color(255, 178, 52));
        btnAggDuenio.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnAggDuenio.setForeground(new java.awt.Color(217, 76, 97));
        btnAggDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informe-medico.png"))); // NOI18N
        btnAggDuenio.setText("Nuevo Dueño");
        btnAggDuenio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 76, 92)));
        btnAggDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggDuenioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAggDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 160, 40));

        cmbSexo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "F" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 110, -1));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 10)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarDuenio.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(890, 574));
        jLabel1.setMinimumSize(new java.awt.Dimension(890, 574));
        jLabel1.setPreferredSize(new java.awt.Dimension(890, 574));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 574));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAggDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggDuenioActionPerformed
        Duenio duenio = new Duenio();
        Conexion conect = new Conexion();
        val = new Validacion();
        
        if(txtNombre.getText().trim().isEmpty() || txtApellido.getText().trim().isEmpty() ||
                txtTelefono.getText().trim().isEmpty() 
                || cmbSexo.getSelectedItem().equals("-") ||
                txtDireccion.getText().trim().isEmpty())
        {
            val.mostrarMensaje("Hay campos vacios!", "Error", "Campos vacios");
            return;
        }
        
        if(!val.validarRangoAlfabe(txtNombre.getText()))
        {
            val.mostrarMensaje("El nombre debe contener letras!", "Error", "Nombre Invalido");
            return;
        }
        
        if(txtNombre.getText().length() > 50)
        {
           val.mostrarMensaje("El nombre excede el limite de caracteres!", "Error", "Nombre Invalido");
            return; 
        }
        
         if(!val.validarRangoAlfabe(txtApellido.getText()))
        {
            val.mostrarMensaje("El Apellido debe contener letras!", "Error", "Apellido Invalido");
            return;
        }
         
         if(txtApellido.getText().length() > 50)
        {
           val.mostrarMensaje("El Apellido excede el limite de caracteres!", "Error", "Nombre Invalido");
            return; 
        }
         
         if (txtNombre.getText().length() < 3) 
         {
            val.mostrarMensaje("El nombre debe tener al menos 3 caracteres.", "Error", "Nombre Inválido");
            return;
         }

        if (txtApellido.getText().length() < 3) 
        {
            val.mostrarMensaje("El apellido debe tener al menos 3 caracteres.", "Error", "Apellido Inválido");
            return;
        }
 
         if(!val.validarSoloDigitos(txtTelefono.getText()))
         {
             val.mostrarMensaje("El Apellido debe contener letras!", "Error", "Telefono Invalido");
             return;
         }
         
        if(txtTelefono.getText().length() > 8 ||txtTelefono.getText().length() < 8)
        {
            val.mostrarMensaje("El numero de telefono debe contener 8 digitos!", "Error","Error en el ingreso de telefono");
            return;
        }
        if(!val.validarSoloDigitos(txtEdad.getText()))
         {
            val.mostrarMensaje("La edad solo debe tener carecteres numericos!", "Error", "Error en el ingreso de la edad");
            return;
         }      
         int edad = Integer.parseInt(txtEdad.getText());
         
         if(edad > 100)
         {
             val.mostrarMensaje("La edad supera el limite esperado!", "Error", "Error en el ingreso de la edad");
            return;
         }
         
         if(edad <= 0)
         {
             val.mostrarMensaje("La edad no puede ser negativa ni cero", "Error", "Error en el ingreso de la edad");
            return;
         }
         if(edad<18)
         {
             val.mostrarMensaje("Se espera que el dueño sea mayor de edad!", "Error", "Error Dueño menor de edad");
             return;
         }
          if(txtDireccion.getText().length() > 60)
         {
             val.mostrarMensaje("La direccion supera el limite esperado", "Error", "Error");
             return;
         }
    

        duenio.setNombre(val.guardaConPrimeraLetraMayuscula(txtNombre.getText()));
      duenio.setApellido(val.guardaConPrimeraLetraMayuscula(txtApellido.getText()));
        duenio.setSexo((String)cmbSexo.getSelectedItem());
        duenio.setTelefono(txtTelefono.getText());
        duenio.setDireccion(txtDireccion.getText());
        duenio.settEdad(edad);
        conect.insertarDuenio(duenio);
        val.mostrarMensaje("Se agrego un nuevo Dueño!", "Info", "Se añadio un Dueño");
        limpiar();
        this.dispose();
    }//GEN-LAST:event_btnAggDuenioActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed
    public void limpiar()
      {
         txtNombre.setText("");
         txtApellido.setText("");
         cmbSexo.setSelectedItem("-");
         txtTelefono.setText("");
         txtDireccion.setText("");
      }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggDuenio;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

 
}
