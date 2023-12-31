
package GUI;

import LOGIC.Validacion;
import java.awt.Toolkit;
import java.text.DecimalFormat;

public class Convertidora extends javax.swing.JInternalFrame {

    public Convertidora() {
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

        jPanel2 = new javax.swing.JPanel();
        btnConvertir = new javax.swing.JButton();
        opcion2 = new javax.swing.JComboBox<>();
        opcion1 = new javax.swing.JComboBox<>();
        Resultado = new javax.swing.JTextField();
        btnCopiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConvertir.setBackground(new java.awt.Color(242, 82, 100));
        btnConvertir.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnConvertir.setForeground(new java.awt.Color(255, 255, 255));
        btnConvertir.setText("Convertir");
        btnConvertir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnConvertir.setBorderPainted(false);
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        jPanel2.add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 30));

        opcion2.setBackground(new java.awt.Color(255, 255, 255));
        opcion2.setForeground(new java.awt.Color(0, 0, 0));
        opcion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Libras", "Onzas", "Gramos", "Kg" }));
        opcion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        opcion1.setBackground(new java.awt.Color(255, 255, 255));
        opcion1.setForeground(new java.awt.Color(0, 0, 0));
        opcion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Libras", "Onzas", "Gramos", "Kg" }));
        opcion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });
        jPanel2.add(opcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        Resultado.setEditable(false);
        Resultado.setBackground(new java.awt.Color(255, 255, 255));
        Resultado.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Resultado.setForeground(new java.awt.Color(0, 0, 0));
        Resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 140, 30));

        btnCopiar.setBackground(new java.awt.Color(242, 82, 100));
        btnCopiar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnCopiar.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiar.setText("Copiar");
        btnCopiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnCopiar.setBorderPainted(false);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 70, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GestionarMedicamento.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 30, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bascula(1).png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 60, 40));

        input.setBackground(new java.awt.Color(255, 255, 255));
        input.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        input.setForeground(new java.awt.Color(0, 0, 0));
        input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 92, 140, 30));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Convertidor");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculadora.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion1ActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        Validacion val = new Validacion();
        String option1  = (String) opcion1.getSelectedItem(); 
        String option2  = (String) opcion2.getSelectedItem(); 
        
        if(option1.equals("-") || option2.equals("-"))
        {
            val.mostrarMensaje("Debe elegir lo que quiere convertir", "Error", "Error");
            return;
        }
        if(input.getText().isEmpty())
        {
            val.mostrarMensaje("No puede estar vacio!", "Error", "Error");
            return;
        }
        
        if(option1.equals(option2))
        {
            val.mostrarMensaje("Las opciones de conversión deben ser diferentes", "Error", "Error");
            return;    
        }
        if(!val.validarNumeroDecimal(input.getText()))
        {
            val.mostrarMensaje("No es un numero valido!", "Error", "Error");
            return;
        }
        
        double inp = Double.parseDouble(input.getText());
        double result = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.####");

        if (option1.equals("Libras") && option2.equals("Onzas")) 
        {
            result = inp * 16;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Onzas") && option2.equals("Libras")) 
        {
            result = inp / 16;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Onzas") && option2.equals("Gramos")) 
        {
            result = inp * 28.3495;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Gramos") && option2.equals("Onzas")) 
        {
            result = inp / 28.3495;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Kg") && option2.equals("Gramos")) 
        {
            result = inp * 1000;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Gramos") && option2.equals("Kg")) 
        {
            result = inp / 1000;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Kg") && option2.equals("Libras")) 
        {
            result = inp * 2.20462;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Libras") && option2.equals("Kg"))
        {
            result = inp / 2.20462;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Gramos") && option2.equals("Libras"))
        {
            result = inp / 453.592;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Libras") && option2.equals("Gramos")) 
        {
            result = inp * 453.592;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Kg") && option2.equals("Onzas")) 
        {
            result = inp * 35.274;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
        if (option1.equals("Onzas") && option2.equals("Kg")) 
        {
            result = inp / 35.274;
            String roundedResult = decimalFormat.format(result);
            Resultado.setText(roundedResult);
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
       String resultado = Resultado.getText();

    // Copiar el texto al portapapeles
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
            new java.awt.datatransfer.StringSelection(resultado), null);
    }//GEN-LAST:event_btnCopiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> opcion1;
    private javax.swing.JComboBox<String> opcion2;
    // End of variables declaration//GEN-END:variables
}
