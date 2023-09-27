package vistas;

import accesoADatos.AlumnoData;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InscripcionView extends javax.swing.JInternalFrame {
    
    private AlumnoData alumnoData = new AlumnoData();
    private InscripcionData inscripcionData = new InscripcionData();
    private DefaultTableModel modelo = new DefaultTableModel();
    private Boolean materiasInscriptasSeleccionadas = false;
    private MateriaData materiaData = new MateriaData();
    
    public InscripcionView() {
        initComponents();
        setSize(586, 524);
        cargarCombo();
        armarCabecera();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInscrip = new javax.swing.JButton();
        btAnularInscrip = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMaterias = new javax.swing.JTable();
        rbMatInscrip = new javax.swing.JRadioButton();
        rbMatnoInscrip = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbListadodeAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(586, 524));

        jPanel1.setBackground(new java.awt.Color(39, 60, 117));
        jPanel1.setPreferredSize(new java.awt.Dimension(586, 524));
        jPanel1.setLayout(null);

        btInscrip.setBackground(new java.awt.Color(12, 43, 135));
        btInscrip.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btInscrip.setForeground(new java.awt.Color(255, 255, 255));
        btInscrip.setText("Inscribir");
        btInscrip.setEnabled(false);
        btInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscripActionPerformed(evt);
            }
        });
        jPanel1.add(btInscrip);
        btInscrip.setBounds(30, 450, 120, 28);

        btAnularInscrip.setBackground(new java.awt.Color(12, 43, 135));
        btAnularInscrip.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btAnularInscrip.setForeground(new java.awt.Color(255, 255, 255));
        btAnularInscrip.setText("Anular Inscripcion");
        btAnularInscrip.setEnabled(false);
        btAnularInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnularInscripActionPerformed(evt);
            }
        });
        jPanel1.add(btAnularInscrip);
        btAnularInscrip.setBounds(220, 450, 180, 28);

        btSalir.setBackground(new java.awt.Color(12, 43, 135));
        btSalir.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btSalir);
        btSalir.setBounds(470, 450, 72, 28);

        tbMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbMaterias);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(29, 210, 510, 213);

        rbMatInscrip.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        rbMatInscrip.setForeground(new java.awt.Color(255, 255, 255));
        rbMatInscrip.setText("Materias Inscriptas");
        rbMatInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMatInscripActionPerformed(evt);
            }
        });
        jPanel1.add(rbMatInscrip);
        rbMatInscrip.setBounds(30, 170, 152, 22);

        rbMatnoInscrip.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        rbMatnoInscrip.setForeground(new java.awt.Color(255, 255, 255));
        rbMatnoInscrip.setText("Materias no Inscriptas");
        rbMatnoInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMatnoInscripActionPerformed(evt);
            }
        });
        jPanel1.add(rbMatnoInscrip);
        rbMatnoInscrip.setBounds(370, 170, 173, 22);

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de Materias");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(29, 119, 520, 23);

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un Alumno :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(29, 67, 158, 18);

        cbListadodeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListadodeAlumnosActionPerformed(evt);
            }
        });
        cbListadodeAlumnos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbListadodeAlumnosPropertyChange(evt);
            }
        });
        jPanel1.add(cbListadodeAlumnos);
        cbListadodeAlumnos.setBounds(212, 64, 330, 25);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("    Formulario de Inscripción");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(42, 6, 490, 24);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 40, 510, 10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbListadodeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListadodeAlumnosActionPerformed
        limpiarTabla();
        resetearRb();
        btInscrip.setEnabled(false);
    }//GEN-LAST:event_cbListadodeAlumnosActionPerformed

    private void rbMatInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMatInscripActionPerformed
        limpiarTabla();
        materiasInscriptasSeleccionadas = true;
        rbMatnoInscrip.setSelected(false);
        cargarMateriasInscriptas();
        btInscrip.setEnabled(false);
        btAnularInscrip.setEnabled(true);
    }//GEN-LAST:event_rbMatInscripActionPerformed

    private void rbMatnoInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMatnoInscripActionPerformed
        limpiarTabla();
        materiasInscriptasSeleccionadas = false;
        rbMatInscrip.setSelected(false);
        cargarMateriasNoInscriptas();
        btInscrip.setEnabled(true);
        btAnularInscrip.setEnabled(false);

    }//GEN-LAST:event_rbMatnoInscripActionPerformed

    private void cbListadodeAlumnosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbListadodeAlumnosPropertyChange

    }//GEN-LAST:event_cbListadodeAlumnosPropertyChange

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscripActionPerformed
        
        Alumno alumnoSeleccionado = (Alumno) cbListadodeAlumnos.getSelectedItem();
        int indiceFila = tbMaterias.getSelectedRow();
        if (indiceFila != -1) {
            int idMateria = (int) tbMaterias.getValueAt(indiceFila, 0);
            Materia materiaSeleccionada = materiaData.buscarMateria(idMateria);
            Inscripcion inscripcion = new Inscripcion(alumnoSeleccionado, materiaSeleccionada);
            inscripcionData.guardarInscripcion(inscripcion);
        } else {
            JOptionPane.showMessageDialog(null, "Debe escoger una materia en la lista.");
        }
        limpiarTabla();
        resetearRb();

    }//GEN-LAST:event_btInscripActionPerformed

    private void btAnularInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnularInscripActionPerformed
        Alumno alumnoSeleccionado = (Alumno) cbListadodeAlumnos.getSelectedItem();
        int indiceFila = tbMaterias.getSelectedRow();
        if (indiceFila != -1) {
            int idMateria = (int) tbMaterias.getValueAt(indiceFila, 0);
            inscripcionData.borrarInscripcionMateriaAlumno(alumnoSeleccionado.getIdAlumno(), idMateria);
        } else {
            JOptionPane.showMessageDialog(null, "Debe escoger una materia en la lista.");
        }
        limpiarTabla();
        resetearRb();
    }//GEN-LAST:event_btAnularInscripActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnularInscrip;
    private javax.swing.JButton btInscrip;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> cbListadodeAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbMatInscrip;
    private javax.swing.JRadioButton rbMatnoInscrip;
    private javax.swing.JTable tbMaterias;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        
        List<Alumno> listaAlumnos = new ArrayList();
        listaAlumnos = alumnoData.listarAlumnos();
        Collections.sort(listaAlumnos);
        for (Alumno listaAlumno : listaAlumnos) {
            cbListadodeAlumnos.addItem(listaAlumno);
        }
    }
    
    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        tbMaterias.setModel(modelo);
    }
    
    private void cargarMateriasInscriptas() {
        List<Materia> listaMaterias = new ArrayList();
        Alumno alumno = (Alumno) cbListadodeAlumnos.getSelectedItem();
        listaMaterias = inscripcionData.obtenerMateriasCursadas(alumno.getIdAlumno());
        
        if (listaMaterias != null) {
            for (Materia listaMateria : listaMaterias) {
                modelo.addRow(new Object[]{listaMateria.getIdMateria(), listaMateria.getNombre(), listaMateria.getAnioMateria()});
            }
        }
    }
    
    private void cargarMateriasNoInscriptas() {
        List<Materia> listaMaterias = new ArrayList();
        Alumno alumno = (Alumno) cbListadodeAlumnos.getSelectedItem();
        listaMaterias = inscripcionData.obtenerMateriasNoCursadas(alumno.getIdAlumno());
        
        if (listaMaterias != null) {
            for (Materia listaMateria : listaMaterias) {
                modelo.addRow(new Object[]{listaMateria.getIdMateria(), listaMateria.getNombre(), listaMateria.getAnioMateria()});
            }
        }
    }

//    private void limpiarTabla() {
//        int index = modelo.getRowCount() - 1;
//        for (int i = index; i >= 0; i--) {
//            modelo.removeRow(i);
//        }
//    }
    private void limpiarTabla() {
        modelo.setRowCount(0);
    }
    
    private void resetearRb() {
        rbMatInscrip.setSelected(false);
        rbMatnoInscrip.setSelected(false);
    }
    
    public void centrarEnDesktopPane() {
        Dimension desktopSize = this.getDesktopPane().getSize();
        Dimension internalFrameSize = this.getSize();
        int x = (desktopSize.width - internalFrameSize.width) / 2;
        int y = (desktopSize.height - internalFrameSize.height) / 2;
        this.setLocation(x, y);
    }
}
