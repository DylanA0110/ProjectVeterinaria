
package GUI;

import LOGIC.Mascota;
import LOGIC.Validacion;
import SQL.Conexion;
import java.util.List;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;



public class GestionarMascotas extends javax.swing.JInternalFrame {

    Validacion val = null;
    private DefaultTableModel tabla;
    public GestionarMascotas() 
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelMasco = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVet = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        bntAgregarMascotas = new javax.swing.JButton();
        btnEditarMascota = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnDeshacer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(890, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(220, 76, 68));
        jLabel3.setText("Busqueda:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 618, 906, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 76, 68));
        jLabel2.setText("Mascotas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

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
        jScrollPane1.setViewportView(TablaVet);

        javax.swing.GroupLayout PanelMascoLayout = new javax.swing.GroupLayout(PanelMasco);
        PanelMasco.setLayout(PanelMascoLayout);
        PanelMascoLayout.setHorizontalGroup(
            PanelMascoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        PanelMascoLayout.setVerticalGroup(
            PanelMascoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        getContentPane().add(PanelMasco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 830, 420));
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 160, -1));

        bntAgregarMascotas.setBackground(new java.awt.Color(220, 76, 68));
        bntAgregarMascotas.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bntAgregarMascotas.setForeground(new java.awt.Color(255, 255, 255));
        bntAgregarMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mascotas.png"))); // NOI18N
        bntAgregarMascotas.setText("  Agregar Mascota");
        bntAgregarMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgregarMascotasActionPerformed(evt);
            }
        });
        getContentPane().add(bntAgregarMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 190, 40));

        btnEditarMascota.setBackground(new java.awt.Color(220, 76, 68));
        btnEditarMascota.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnEditarMascota.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mascotas.png"))); // NOI18N
        btnEditarMascota.setText("Editar Mascota");
        btnEditarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 190, 40));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda-de-lupa(1).png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 30, 40));

        btnDeshacer.setBackground(new java.awt.Color(255, 255, 255));
        btnDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deshacer(1).png"))); // NOI18N
        btnDeshacer.setBorder(null);
        btnDeshacer.setBorderPainted(false);
        btnDeshacer.setFocusable(false);
        btnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshacerActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeshacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 20, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuidado-de-mascotas.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInternal.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(880, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(880, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(880, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        btnBuscar1.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda-de-lupa(1).png"))); // NOI18N
        btnBuscar1.setBorder(null);
        btnBuscar1.setBorderPainted(false);
        btnBuscar1.setFocusable(false);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 30, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAgregarMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgregarMascotasActionPerformed
        AgregarMascotas AM = new AgregarMascotas();
        val = new Validacion();
        Principal.desktop_menu.add(AM);
        AM.setVisible(true);
        AM.addInternalFrameListener(new InternalFrameAdapter()
        {
            @Override
            public void internalFrameClosed(InternalFrameEvent e)
            {
                cargarTabla();
            }
        });
       val.centrarInternalFrame(AM, Principal.desktop_menu);
        
    }//GEN-LAST:event_bntAgregarMascotasActionPerformed

    private void btnEditarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMascotaActionPerformed
           val = new Validacion();

            // Controlo que la tabla no esté vacía
            if (TablaVet.getRowCount() > 0) 
            {
        // Controlo que haya seleccionado a una Mascota
            if (TablaVet.getSelectedRow() != -1) 
            {
            int id = Integer.parseInt(String.valueOf(TablaVet.getValueAt(TablaVet.getSelectedRow(), 0)));
            EditarMascota EM = new EditarMascota(id);
            Principal.desktop_menu.add(EM);
            EM.setVisible(true);
            EM.setResizable(false);
            EM.addInternalFrameListener(new InternalFrameAdapter()
        {
            @Override
            public void internalFrameClosed(InternalFrameEvent e)
            {
                cargarTabla();
            }
        });
            val.centrarInternalFrame(EM, Principal.desktop_menu);
            }
            
            else 
            {
                val.mostrarMensaje("No se seleccionó ninguna Mascota", "Error", "Error al seleccionar");
                return; 
            }
        }
    }//GEN-LAST:event_btnEditarMascotaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tabla);
        TablaVet.setRowSorter(sorter);

        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        int[] columnasABuscar = {0, 1, 3, 8};

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

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

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
        String[] titulos = 
        {
    "<html><b><font face='Liberation Sans' size='4'>ID</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Nombre</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Sexo</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Especie</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Raza</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Edad(meses)</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Color</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>Peso(Kg)</font></b></html>",
    "<html><b><font face='Liberation Sans' size='4'>ID dueño</font></b></html>"
};

        tabla.setColumnIdentifiers(titulos);

        List<Mascota> Listmasco = conect.traerMascota();

        if (Listmasco != null) 
        {
            for (Mascota masco : Listmasco) 
            {
                Object[] objeto = 
                {
                      masco.getId_mascota(),
                      masco.getNombre(),
                      masco.getSexo(),
                      masco.getEspecie(),
                      masco.getRaza(),
                      masco.getEdad(),
                      masco.getColor(),
                      masco.getPeso(),
                      masco.getId_duenio()      
                };
                tabla.addRow(objeto);
            }
        }
        
  
        TablaVet.setModel(tabla);
        TableColumnModel columnModel = TablaVet.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(3);
        columnModel.getColumn(1).setPreferredWidth(30);
        columnModel.getColumn(2).setPreferredWidth(15);
        columnModel.getColumn(3).setPreferredWidth(30);
        columnModel.getColumn(4).setPreferredWidth(80);
        columnModel.getColumn(5).setPreferredWidth(35);
        columnModel.getColumn(6).setPreferredWidth(20);
        columnModel.getColumn(7).setPreferredWidth(20);
        columnModel.getColumn(8).setPreferredWidth(3);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        TablaVet.setDefaultRenderer(Object.class, centerRenderer);
       TablaVet.getTableHeader().setReorderingAllowed(false);

        for (int i = 0; i < columnModel.getColumnCount(); i++) 
        {
            columnModel.getColumn(i).setResizable(false);
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMasco;
    private javax.swing.JTable TablaVet;
    private javax.swing.JButton bntAgregarMascotas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnEditarMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
