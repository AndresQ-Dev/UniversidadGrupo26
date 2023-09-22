
package vistas;

import accesoADatos.AlumnoData;
import entidades.Alumno;
import java.util.ArrayList;
import java.util.List;

public class InscripcionView extends javax.swing.JInternalFrame {

    private AlumnoData alumnoData = new AlumnoData();
    public InscripcionView() {
        initComponents();
        cargarCombo();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMaterias = new javax.swing.JTable();
        tbInscrip = new javax.swing.JButton();
        tbAnularInscrip = new javax.swing.JButton();
        tbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("    Formulario de Inscripción");

        jLabel2.setText("Seleccione un Alumno :");

        cbListadodeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListadodeAlumnosActionPerformed(evt);
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

        tbMaterias.setAutoCreateColumnsFromModel(false);
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
        jScrollPane1.setViewportView(tbMaterias);

        tbInscrip.setText("Inscribir");

        tbAnularInscrip.setText("Anular Inscripciones");

        tbSalir.setText("Salir");

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
                .addGap(35, 35, 35)
                .addComponent(tbInscrip)
                .addGap(60, 60, 60)
                .addComponent(tbAnularInscrip, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbSalir)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbListadodeAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(15, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbAnularInscrip)
                    .addComponent(tbSalir)
                    .addComponent(tbInscrip))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbListadodeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListadodeAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbListadodeAlumnosActionPerformed

    private void rbMatInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMatInscripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMatInscripActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cbListadodeAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbMatInscrip;
    private javax.swing.JRadioButton rbMatnoInscrip;
    private javax.swing.JButton tbAnularInscrip;
    private javax.swing.JButton tbInscrip;
    private javax.swing.JTable tbMaterias;
    private javax.swing.JButton tbSalir;
    // End of variables declaration//GEN-END:variables

    
    
    private void cargarCombo(){
           
         List<Alumno> listaAlumnos = new ArrayList(); 
         listaAlumnos = alumnoData.listarAlumnos();
         
          for (Alumno listaAlumno : listaAlumnos) {
           cbListadodeAlumnos.addItem(listaAlumno);
           
        }
  
              
            
        
    }




}
