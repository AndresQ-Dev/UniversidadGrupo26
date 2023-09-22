
package vistas;

import accesoADatos.AlumnoData;
import accesoADatos.InscripcionData;
import entidades.Alumno;
import entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class InscripcionView extends javax.swing.JInternalFrame {

    
    private AlumnoData alumnoData = new AlumnoData();
    private InscripcionData inscripcionData=new InscripcionData();
    private DefaultTableModel modelo=new DefaultTableModel();
    private Boolean materiasInscriptasSeleccionadas=false;
    
    
    public InscripcionView() {
        initComponents();
        cargarCombo();
        armarCabecera();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbListadodeAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rbMatInscrip = new javax.swing.JRadioButton();
        rbMatnoInscrip = new javax.swing.JRadioButton();
        btInscrip = new javax.swing.JButton();
        btAnularInscrip = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMaterias = new javax.swing.JTable();

        jLabel1.setText("    Formulario de Inscripción");

        jLabel2.setText("Seleccione un Alumno :");

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

        jLabel3.setText("Listado de Materias");

        rbMatInscrip.setText("Materias Inscriptas");
        rbMatInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMatInscripActionPerformed(evt);
            }
        });

        rbMatnoInscrip.setText("Materias no Inscriptas");
        rbMatnoInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMatnoInscripActionPerformed(evt);
            }
        });

        btInscrip.setText("Inscribir");

        btAnularInscrip.setText("Anular Inscripciones");

        btSalir.setText("Salir");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGap(464, 464, 464)
                .addComponent(btInscrip)
                .addGap(60, 60, 60)
                .addComponent(btAnularInscrip, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalir)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbMatInscrip)
                        .addGap(61, 61, 61)
                        .addComponent(rbMatnoInscrip)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbListadodeAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbListadodeAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMatInscrip)
                    .addComponent(rbMatnoInscrip))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAnularInscrip)
                    .addComponent(btSalir)
                    .addComponent(btInscrip))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbListadodeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListadodeAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbListadodeAlumnosActionPerformed

    private void rbMatInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMatInscripActionPerformed
      limpiarTabla();
      materiasInscriptasSeleccionadas=true;
      rbMatnoInscrip.setSelected(false);
      cargarMateriasInscriptas();
    }//GEN-LAST:event_rbMatInscripActionPerformed

    private void rbMatnoInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMatnoInscripActionPerformed
      limpiarTabla();
      materiasInscriptasSeleccionadas=false;
      rbMatInscrip.setSelected(false);
      cargarMateriasNoInscriptas();  
    }//GEN-LAST:event_rbMatnoInscripActionPerformed

    private void cbListadodeAlumnosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbListadodeAlumnosPropertyChange
      limpiarTabla();
      //resetearRb();
    }//GEN-LAST:event_cbListadodeAlumnosPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnularInscrip;
    private javax.swing.JButton btInscrip;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> cbListadodeAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbMatInscrip;
    private javax.swing.JRadioButton rbMatnoInscrip;
    private javax.swing.JTable tbMaterias;
    // End of variables declaration//GEN-END:variables

    
    
    private void cargarCombo(){
           
         List<Alumno> listaAlumnos = new ArrayList(); 
         listaAlumnos = alumnoData.listarAlumnos();
         
          for (Alumno listaAlumno : listaAlumnos) {
           cbListadodeAlumnos.addItem(listaAlumno);  
        }    
    }
    
    
    private void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        tbMaterias.setModel(modelo);
    }

    private void cargarMateriasInscriptas(){
    List<Materia> listaMaterias=new ArrayList();
    Alumno alumno=(Alumno) cbListadodeAlumnos.getSelectedItem();
    listaMaterias=inscripcionData.obtenerMateriasCursadas(alumno.getIdAlumno());
        for (Materia listaMateria : listaMaterias) {
            modelo.addRow(new Object []{listaMateria.getIdMateria(), listaMateria.getNombre(),listaMateria.getAnioMateria()});
        }
}
    
 private void cargarMateriasNoInscriptas(){
    List<Materia> listaMaterias=new ArrayList();
    Alumno alumno=(Alumno) cbListadodeAlumnos.getSelectedItem();
    listaMaterias=inscripcionData.obtenerMateriasNoCursadas(alumno.getIdAlumno());
        for (Materia listaMateria : listaMaterias) {
            modelo.addRow(new Object []{listaMateria.getIdMateria(), listaMateria.getNombre(),listaMateria.getAnioMateria()});
        }
}
 private void limpiarTabla(){
     int index=modelo.getRowCount()-1;
     for (int i = index; i >= 0; i--) {
         modelo.removeRow(i);
     }
 }
 }
 
 /*private void limpiarTabla(){
     modelo.setRowCount(0);
 }*/

   /*private void resetearRb() {
    rbMatInscrip.setSelected(false);
    rbMatnoInscrip.setSelected(false); 
    }*/


