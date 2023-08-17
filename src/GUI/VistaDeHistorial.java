
package GUI;


import LOGIC.Duenio;
import LOGIC.Validacion;

import SQL.Conexion;

import LOGIC.HistorialMedicos;
import LOGIC.Mascota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


/**
 *
 * @author dylan
 */
public class VistaDeHistorial extends javax.swing.JInternalFrame 
{

    private int id;
    Validacion val = null;
    Conexion conect = null;
    public VistaDeHistorial(int id) 
    {
        initComponents();
        this.id = id;
        val = new Validacion();
        val.centrarInternalFrame(this, Principal.desktop_menu);
        cargarDatosPorID();
        CargarComboFechas(cmbVisitas);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSexo = new javax.swing.JTextField();
        cmbVisitas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMedicamentos = new javax.swing.JTextArea();
        fechaUltimaDespa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaUltimaVacunacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombreVacunaUltima = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        idDuenio = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        VetAtendido = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        idMascota = new javax.swing.JTextField();
        txtNombreMascota = new javax.swing.JTextField();
        MotivoDeVisita = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(1094, 579));
        setMinimumSize(new java.awt.Dimension(1094, 579));
        setPreferredSize(new java.awt.Dimension(1069, 579));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSexo.setEditable(false);
        txtSexo.setBackground(new java.awt.Color(255, 255, 255));
        txtSexo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(0, 0, 0));
        txtSexo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 100, -1));

        cmbVisitas.setBackground(new java.awt.Color(255, 255, 255));
        cmbVisitas.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        cmbVisitas.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(cmbVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, -1));

        txtMedicamentos.setEditable(false);
        txtMedicamentos.setBackground(new java.awt.Color(255, 255, 255));
        txtMedicamentos.setColumns(20);
        txtMedicamentos.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtMedicamentos.setForeground(new java.awt.Color(0, 0, 0));
        txtMedicamentos.setRows(5);
        txtMedicamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtMedicamentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, 100));

        fechaUltimaDespa.setEditable(false);
        fechaUltimaDespa.setBackground(new java.awt.Color(255, 255, 255));
        fechaUltimaDespa.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        fechaUltimaDespa.setForeground(new java.awt.Color(0, 0, 0));
        fechaUltimaDespa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(fechaUltimaDespa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 180, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, 100));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 184, 252));
        jLabel1.setText("Historial Medico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 18, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de visitas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Veterinario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Motivo de visita:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripcion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        fechaUltimaVacunacion.setEditable(false);
        fechaUltimaVacunacion.setBackground(new java.awt.Color(255, 255, 255));
        fechaUltimaVacunacion.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        fechaUltimaVacunacion.setForeground(new java.awt.Color(0, 0, 0));
        fechaUltimaVacunacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(fechaUltimaVacunacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 160, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 112, -1, -1));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Última desparasitación:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        nombreVacunaUltima.setEditable(false);
        nombreVacunaUltima.setBackground(new java.awt.Color(255, 255, 255));
        nombreVacunaUltima.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        nombreVacunaUltima.setForeground(new java.awt.Color(0, 0, 0));
        nombreVacunaUltima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(nombreVacunaUltima, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 180, -1));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Medicamentos recetados:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Última vacuna administrada:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Fecha:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Sexo:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("ID Dueño:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial-medico.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 50, 40));

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Color:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        txtColor.setEditable(false);
        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 150, -1));

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Especie:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        txtEspecie.setEditable(false);
        txtEspecie.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecie.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtEspecie.setForeground(new java.awt.Color(0, 0, 0));
        txtEspecie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 130, -1));

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Edad:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        idDuenio.setEditable(false);
        idDuenio.setBackground(new java.awt.Color(255, 255, 255));
        idDuenio.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        idDuenio.setForeground(new java.awt.Color(0, 0, 0));
        idDuenio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(idDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 70, -1));

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Peso:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        txtPeso.setEditable(false);
        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 80, -1));

        txtEdad.setEditable(false);
        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 80, -1));

        jLabel22.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Nombre del dueño:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        txtNombreDuenio.setEditable(false);
        txtNombreDuenio.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreDuenio.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtNombreDuenio.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreDuenio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNombreDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 150, -1));

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Raza");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, -1, -1));

        txtRaza.setEditable(false);
        txtRaza.setBackground(new java.awt.Color(255, 255, 255));
        txtRaza.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));
        txtRaza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 150, -1));

        jLabel24.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Nombre de Mascota:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        VetAtendido.setEditable(false);
        VetAtendido.setBackground(new java.awt.Color(255, 255, 255));
        VetAtendido.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        VetAtendido.setForeground(new java.awt.Color(0, 0, 0));
        VetAtendido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(VetAtendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 150, -1));

        jLabel25.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("ID:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        idMascota.setEditable(false);
        idMascota.setBackground(new java.awt.Color(255, 255, 255));
        idMascota.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        idMascota.setForeground(new java.awt.Color(0, 0, 0));
        idMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(idMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 70, -1));

        txtNombreMascota.setEditable(false);
        txtNombreMascota.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreMascota.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtNombreMascota.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 150, -1));

        MotivoDeVisita.setEditable(false);
        MotivoDeVisita.setBackground(new java.awt.Color(255, 255, 255));
        MotivoDeVisita.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        MotivoDeVisita.setForeground(new java.awt.Color(0, 0, 0));
        MotivoDeVisita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(MotivoDeVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDatosPorID()
    {
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        conect = new Conexion();
        HistorialMedicos HM = conect.ultimasVacunasDespa(id);
        if(HM == null)
        {
            fechaUltimaDespa.setText("No hay registros");
            fechaUltimaVacunacion.setText("No hay registros");
            nombreVacunaUltima.setText("No hay registros"); 
        }
        else
        {
            Date fechaDespa = HM.getDesparasitacion();
            String nombreVacu = HM.getNombreVacuna();
            Date fechaVacu = HM.getFechaVacuna();
            if (fechaDespa == null) 
            {
                fechaUltimaDespa.setText("No hay registros");
            } else 
            {
                fechaUltimaDespa.setText(formatoFecha.format(fechaDespa));
            }
            if (fechaVacu == null) 
            {
                fechaUltimaVacunacion.setText("No hay registros");
            } else 
            {
                fechaUltimaVacunacion.setText(formatoFecha.format(fechaVacu));
            }
                 nombreVacunaUltima.setText(nombreVacu);
            
        } 
        
        Mascota masco =  conect.obtenerMascotaPorID(id);
        txtNombreMascota.setText(masco.getNombre());
        idMascota.setText(String.valueOf(id));
        txtEspecie.setText(masco.getEspecie());
        txtEdad.setText(String.valueOf(masco.getEdad()));
        txtPeso.setText(String.valueOf(masco.getPeso()));
        txtSexo.setText(masco.getSexo());
        txtRaza.setText(masco.getRaza());
        txtColor.setText(masco.getColor());
        idDuenio.setText(String.valueOf(masco.getId_duenio()));
        Duenio duenio =  conect.obtenerDuenioPorID(masco.getId_duenio());
        txtNombreDuenio.setText(duenio.getNombre());
    }   

    private void CargarComboFechas(JComboBox c )
    {
        conect = new Conexion();
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        List<java.sql.Date> listFechasID = conect.obtenerFechasDeVisitasPorID(id);
    for(java.sql.Date Dates : listFechasID) 
    {
        combo.addElement(Dates);
    }  
     c.setModel(combo);
     
     c.addActionListener(new ActionListener() 
     {
        public void actionPerformed(ActionEvent e) 
        {
            java.sql.Date fechaSeleccionada = (java.sql.Date) c.getSelectedItem();
            HistorialMedicos hm = conect.obtenerDatosSegunFecha(fechaSeleccionada);
            MotivoDeVisita.setText(hm.getMotivoVisita());
            txtDescripcion.setText(hm.getDescripcion());
            txtMedicamentos.setText(hm.getMedicamentos());
            int idVet = hm.getVeterinarioID();
            String nombreVet = conect.obtenerNombreVetPorID(idVet);
            VetAtendido.setText(nombreVet);

        }
    });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MotivoDeVisita;
    private javax.swing.JTextField VetAtendido;
    private javax.swing.JComboBox<String> cmbVisitas;
    private javax.swing.JTextField fechaUltimaDespa;
    private javax.swing.JTextField fechaUltimaVacunacion;
    private javax.swing.JTextField idDuenio;
    private javax.swing.JTextField idMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombreVacunaUltima;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextArea txtMedicamentos;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables

   
}
