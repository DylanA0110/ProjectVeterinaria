
package GUI;

import LOGIC.Validacion;
import LOGIC.Veterinario;
import SQL.Conexion;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class InterVeterinario extends javax.swing.JInternalFrame 
{
    private DefaultTableModel tabla;
    Validacion val;
    public InterVeterinario()
    {
        initComponents();
        tabla = new DefaultTableModel();
        cargarTabla();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tabla);
        TablaVet.setRowSorter(sorter);
        val = new Validacion();
        val.centrarInternalFrame(this, Principal.desktop_menu);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVet = new javax.swing.JTable();
        btnEditVeterinario = new javax.swing.JButton();
        btnNuevoVeterinario = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        btnDeshacer = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 618, 906, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Veterinarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        TablaVet.setBackground(new java.awt.Color(255, 255, 255));
        TablaVet.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        TablaVet.setForeground(new java.awt.Color(0, 0, 0));
        TablaVet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaVet.setGridColor(new java.awt.Color(0, 0, 0));
        TablaVet.setSelectionBackground(new java.awt.Color(0, 102, 255));
        TablaVet.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TablaVet.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(TablaVet);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 820, 420));

        btnEditVeterinario.setBackground(new java.awt.Color(241, 117, 221));
        btnEditVeterinario.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnEditVeterinario.setForeground(new java.awt.Color(255, 255, 255));
        btnEditVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GestionVet.png"))); // NOI18N
        btnEditVeterinario.setText("Editar Veterinario");
        btnEditVeterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnEditVeterinario.setBorderPainted(false);
        btnEditVeterinario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditVeterinarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 180, 40));

        btnNuevoVeterinario.setBackground(new java.awt.Color(241, 117, 221));
        btnNuevoVeterinario.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnNuevoVeterinario.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Veterinario.png"))); // NOI18N
        btnNuevoVeterinario.setText("Nuevo Veterinario");
        btnNuevoVeterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnNuevoVeterinario.setBorderPainted(false);
        btnNuevoVeterinario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoVeterinarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 170, 40));

        txtBusqueda.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 190, -1));

        btnDeshacer.setBackground(new java.awt.Color(110, 135, 222));
        btnDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deshacer(1).png"))); // NOI18N
        btnDeshacer.setBorder(null);
        btnDeshacer.setBorderPainted(false);
        btnDeshacer.setFocusable(false);
        btnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshacerActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeshacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 20, 40));

        btnBuscar.setBackground(new java.awt.Color(110, 135, 222));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda-de-lupa(1).png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 16, 30, 30));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Busqueda:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario(4).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoINternal2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 906, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoVeterinarioActionPerformed
        Registros regis = new Registros();
        regis.setVisible(true);
        regis.setLocationRelativeTo(null);
        val = new Validacion();
        regis.addWindowListener(new WindowAdapter() {
        public void windowClosed(WindowEvent e) {
            cargarTabla();
        }
    });
    }//GEN-LAST:event_btnNuevoVeterinarioActionPerformed

    private void btnEditVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditVeterinarioActionPerformed
         val = new Validacion();
            // Controlo que la tabla no esté vacía
            if (TablaVet.getRowCount() > 0) 
            {
            // Controlo que haya seleccionado a un veterinario
            if (TablaVet.getSelectedRow() != -1) 
            {
            // Obtener ID
            int id = Integer.parseInt(String.valueOf(TablaVet.getValueAt(TablaVet.getSelectedRow(), 0)));
            EditarVeterinario EV = new EditarVeterinario(id);
            EV.setVisible(true);
            EV.setLocationRelativeTo(null);
            EV.addWindowListener(new WindowAdapter() {
        public void windowClosed(WindowEvent e) {
            cargarTabla();
        }
        });
        } 
            
        else 
        {
            val.mostrarMensaje("No se seleccionó ningún Veterinario", "Error", "Error al seleccionar");
        }
            
       }
            
    }//GEN-LAST:event_btnEditVeterinarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tabla);
    TablaVet.setRowSorter(sorter);

    List<RowFilter<Object, Object>> filters = new ArrayList<>();
    int[] columnasABuscar = {0, 1, 2, 6};

    for (int columna : columnasABuscar) 
    {
        filters.add(RowFilter.regexFilter("(?i)" + txtBusqueda.getText(), columna));
    }

    RowFilter<Object, Object> rowFilter = RowFilter.orFilter(filters);
    sorter.setRowFilter(rowFilter);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
    TableRowSorter<DefaultTableModel> sorter = (TableRowSorter<DefaultTableModel>) TablaVet.getRowSorter();
    sorter.setRowFilter(null);
    }//GEN-LAST:event_btnDeshacerActionPerformed
    public void cargarTabla() 
    {
     tabla = new DefaultTableModel() 
        {
            @Override
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
    };

        Conexion conect = new Conexion();
    String[] titulos = {
    "<html><b><font face='Liberation Sans' size='4'>ID</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Nombre</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Apellido</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Edad</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Sexo</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Teléfono</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Especialidad</font></b></html>"
};

        tabla.setColumnIdentifiers(titulos);

        List<Veterinario> listaVet = conect.traerVeterinario();

        if (listaVet != null) 
        {
            for (Veterinario vet : listaVet) 
            {
                Object[] objeto = 
                {
                        vet.getId(),
                        vet.getNombre(),
                        vet.getApellido(),
                        vet.getEdad(),
                        vet.getTelefono(),
                        vet.getSexo(),
                        vet.getEspecialidad()
                };
                tabla.addRow(objeto);
            }
        }
        TablaVet.setModel(tabla);
        TableColumnModel columnModel = TablaVet.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(30);
        columnModel.getColumn(2).setPreferredWidth(30);
        columnModel.getColumn(3).setPreferredWidth(20);
        columnModel.getColumn(4).setPreferredWidth(30);
        columnModel.getColumn(5).setPreferredWidth(30);



        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        TablaVet.setDefaultRenderer(Object.class, centerRenderer);
        TablaVet.getTableHeader().setReorderingAllowed(false);

        for (int i = 0; i < columnModel.getColumnCount(); i++) 
        {
            columnModel.getColumn(i).setResizable(false);
        }
        TablaVet.getTableHeader().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
         TablaVet.setBackground(Color.WHITE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVet;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnEditVeterinario;
    private javax.swing.JButton btnNuevoVeterinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
