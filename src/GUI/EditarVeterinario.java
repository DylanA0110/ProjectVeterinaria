package GUI;

import LOGIC.Veterinario;
import LOGIC.Validacion;
import SQL.Conexion;

public class EditarVeterinario extends javax.swing.JFrame 
{
    Conexion conect = null;
    Validacion val = null;
    int id;

    public EditarVeterinario(int id) 
    {
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.setTitle("Editar Veterinario");
        this.id = id;
        initComponents();
        cargarDatos(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario(4).png"))); // NOI18N

        Editar.setBackground(new java.awt.Color(241, 117, 221));
        Editar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setText("Guardar Cambios");
        Editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Editar.setBorderPainted(false);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ellipse 209.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre:");

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Edad:");

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Sexo:");

        cmbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cmbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "F" }));
        cmbSexo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Teléfono:");

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Especialidad:");

        cmbEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        cmbEspecialidad.setForeground(new java.awt.Color(0, 0, 0));
        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Jefe", "Asistente", "Cirugía", "Estética" }));
        cmbEspecialidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cmbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspecialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel2)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(136, 136, 136)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 560, 430));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Union(1).png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 220, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    public void limpiar()
    {
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        cmbSexo.setSelectedItem("-");
        cmbEspecialidad.setSelectedItem("-");
    }
    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        val = new Validacion();
       
        if (txtNombre.getText().trim().isEmpty() || txtApellido.getText().trim().isEmpty()
                || txtEdad.getText().trim().isEmpty() || cmbSexo.getSelectedItem().equals("-") || cmbEspecialidad.getSelectedItem().equals("-")) 
        {
            val.mostrarMensaje("Hay campos vacíos, debe llenar todos los campos", "Error", "Campos vacíos");
            return;
        }
        
        if(!val.validarRangoAlfabe(txtNombre.getText()))
        {
            val.mostrarMensaje("El Nombre solo debe contener letras", "Error", "Nombre invalido");
            return;
        }
        
        if(!val.validarRangoAlfabe(txtApellido.getText()))
        {
            val.mostrarMensaje("El Apellido solo debe contener letras", "Error", "Apellido invalido");
            return;
        }
        
         if(txtNombre.getText().length() > 50)
        {
            val.mostrarMensaje("El nombre excede el limite esperado", "Error", "Error en el ingreso del nombre");
        }
        
         if(txtApellido.getText().length() > 50)
        {
            val.mostrarMensaje("El Apellido excede el limite esperado", "Error", "Error en el ingreso del Apellido");
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
        
        if(!val.validarSoloDigitos(txtEdad.getText()))
        {
            val.mostrarMensaje("La edad debe ser un número válido", "Error", "Error en el ingreso de edad");
            return;
        }
        
        int edad = Integer.parseInt(txtEdad.getText());
        
        if(edad>100)
        {
            val.mostrarMensaje("La edad supera el limite", "Error","Error en el de la edad");
            return;
        }
          
          if(edad<=0)
        {
            val.mostrarMensaje("La edad no puede ser negativa ni cero", "Error", "Error");
            return;
        }
        if(edad<18)
         {
             val.mostrarMensaje("Se espera que el Veterinario sea mayor de edad!", "Error", "Error, Veterinario menor de edad");
             return;
         }
        
        if(!val.validarSoloDigitos(txtTelefono.getText()))
        {
            val.mostrarMensaje("El telefono no puede contener letras!", "Error","Error en el ingreso de telefono");
            return;
        }
        
        if(txtTelefono.getText().length() > 8 || txtTelefono.getText().length() < 8)
        {
            val.mostrarMensaje("El numero de telefono debe contener 8 digitos!", "Error","Error en el ingreso de telefono");
            return;
        }
        
        String nombre = txtNombre.getText();
        nombre = val.guardaConPrimeraLetraMayuscula(nombre);
        String apellido = txtApellido.getText();
        apellido = val.guardaConPrimeraLetraMayuscula(apellido);
        String telefono = txtTelefono.getText();
        String sexo = cmbSexo.getSelectedItem().toString();
        String especialidad = cmbEspecialidad.getSelectedItem().toString();
        
        Veterinario veterinario = new Veterinario(id, nombre, apellido, edad,"","", telefono, sexo, especialidad);
        try 
        {
            conect.actualizarVeterinario(veterinario);
            val.mostrarMensaje("Los datos del veterinario se han actualizado correctamente.","Info","Actualizacion exitosa");
            limpiar();
            this.dispose();
        } 
        catch (Exception e) 
        {
            val.mostrarMensaje("Error: " + e.getMessage(),"Error","Error");
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void cmbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEspecialidadActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

   private void cargarDatos(int id) 
   {
        conect = new Conexion();
        Veterinario vet = conect.obtenerVeterinarioPorId(id);
        val = new Validacion();

        if (vet != null) 
        {
            txtNombre.setText(vet.getNombre());
            txtApellido.setText(vet.getApellido());
            txtEdad.setText(String.valueOf(vet.getEdad()));
            txtTelefono.setText(vet.getTelefono());  

            if (vet.getSexo().equals("M")) 
            {
                cmbSexo.setSelectedIndex(1);  
            } 
            else if (vet.getSexo().equals("F"))
            {
                cmbSexo.setSelectedIndex(2);  
            } 
            else 
            {
                cmbSexo.setSelectedIndex(0);  
            }

            if (vet.getEspecialidad().equals("Jefe")) 
            {
                cmbEspecialidad.setSelectedIndex(1);  
            } else if (vet.getEspecialidad().equals("Asistente")) 
            {
                cmbEspecialidad.setSelectedIndex(2); 
            } else if (vet.getEspecialidad().equals("Cirugía")) 
            {
                cmbEspecialidad.setSelectedIndex(3);  
            } else if (vet.getEspecialidad().equals("Estética"))
            {
                cmbEspecialidad.setSelectedIndex(4);  
            } else 
            {
                cmbEspecialidad.setSelectedIndex(0);  
            }
            } else 
            {
                val.mostrarMensaje("No se encontró el ID", "Error", "Error");
            }
        
        

       }

}
