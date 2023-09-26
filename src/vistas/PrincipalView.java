
package vistas;

/**
 *
 * @author andres
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("ULP University");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumno = new javax.swing.JMenu();
        jMenuItemAlumno = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jMenuFormularioMateria = new javax.swing.JMenuItem();
        jMenuAdministracion = new javax.swing.JMenu();
        jMenuItemInscripciones = new javax.swing.JMenuItem();
        jMenuItemNotas = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemAlumXMateria = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1024, 769));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/navy.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 769));

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setOpaque(false);

        jMenuAlumno.setText("Alumno");
        jMenuAlumno.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N

        jMenuItemAlumno.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jMenuItemAlumno.setText("Formulario de Alumno");
        jMenuItemAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlumnoActionPerformed(evt);
            }
        });
        jMenuAlumno.add(jMenuItemAlumno);

        jMenuBar1.add(jMenuAlumno);

        jMenuMateria.setText("Materia");
        jMenuMateria.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jMenuMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMateriaActionPerformed(evt);
            }
        });

        jMenuFormularioMateria.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jMenuFormularioMateria.setText("Formulario de Materia");
        jMenuFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormularioMateriaActionPerformed(evt);
            }
        });
        jMenuMateria.add(jMenuFormularioMateria);

        jMenuBar1.add(jMenuMateria);

        jMenuAdministracion.setText("Administracion");
        jMenuAdministracion.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N

        jMenuItemInscripciones.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jMenuItemInscripciones.setText("Manejo de Inscripciones");
        jMenuItemInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInscripcionesActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(jMenuItemInscripciones);

        jMenuItemNotas.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jMenuItemNotas.setText("Manipulacion de Notas");
        jMenuItemNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNotasActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(jMenuItemNotas);

        jMenuBar1.add(jMenuAdministracion);

        jMenuConsultas.setText("Consultas");
        jMenuConsultas.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N

        jMenuItemAlumXMateria.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jMenuItemAlumXMateria.setText("Alumnos por Materia");
        jMenuItemAlumXMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlumXMateriaActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemAlumXMateria);

        jMenuBar1.add(jMenuConsultas);

        jMenuSalir.setText("Salir");
        jMenuSalir.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlumnoActionPerformed
    AlumnoView alumnoView=new AlumnoView();
    jDesktopPane1.add(alumnoView);
    alumnoView.centrarEnDesktopPane();
    alumnoView.setVisible(true);
    alumnoView.moveToFront();        
    }//GEN-LAST:event_jMenuItemAlumnoActionPerformed

    private void jMenuMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMateriaActionPerformed
    
    }//GEN-LAST:event_jMenuMateriaActionPerformed

    private void jMenuFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormularioMateriaActionPerformed
    MateriaView materiaView=new MateriaView();
    jDesktopPane1.add(materiaView);
    materiaView.setVisible(true);
    materiaView.moveToFront();
    }//GEN-LAST:event_jMenuFormularioMateriaActionPerformed

    private void jMenuItemInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInscripcionesActionPerformed
        InscripcionView inscripcionView = new InscripcionView();
        jDesktopPane1.add( inscripcionView);
        inscripcionView.setVisible(true);
        inscripcionView.moveToFront();
    }//GEN-LAST:event_jMenuItemInscripcionesActionPerformed

    private void jMenuItemNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNotasActionPerformed
        NotaView notaView=new NotaView();
        jDesktopPane1.add(notaView);
        notaView.setVisible(true);
        notaView.moveToFront();
    }//GEN-LAST:event_jMenuItemNotasActionPerformed

    private void jMenuItemAlumXMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlumXMateriaActionPerformed
       AlumnoPorMateria alumnoPorMateria=new AlumnoPorMateria();
       jDesktopPane1.add(alumnoPorMateria);
       alumnoPorMateria.setVisible(true);
       alumnoPorMateria.moveToFront();
    }//GEN-LAST:event_jMenuItemAlumXMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAdministracion;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuFormularioMateria;
    private javax.swing.JMenuItem jMenuItemAlumXMateria;
    private javax.swing.JMenuItem jMenuItemAlumno;
    private javax.swing.JMenuItem jMenuItemInscripciones;
    private javax.swing.JMenuItem jMenuItemNotas;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
