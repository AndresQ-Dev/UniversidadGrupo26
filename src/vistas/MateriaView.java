package vistas;

import accesoADatos.MateriaData;
import entidades.Materia;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author telma
 */
public class MateriaView extends javax.swing.JInternalFrame {

    MateriaData materiaData = new MateriaData();
    private boolean editando = false; //Flag para controlar si se está editando una materia

    /**
     * Creates new form MateriaView
     */
    public MateriaView() {
        initComponents();
        setSize(586, 524);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bNuevo = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        lEstado = new javax.swing.JLabel();
        rbEstado = new javax.swing.JRadioButton();
        lAño = new javax.swing.JLabel();
        tfanio = new javax.swing.JTextField();
        lNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lCodigo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(39, 60, 117));
        jPanel1.setLayout(null);

        bNuevo.setBackground(new java.awt.Color(12, 43, 135));
        bNuevo.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bNuevo.setForeground(new java.awt.Color(255, 255, 255));
        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(bNuevo);
        bNuevo.setBounds(30, 430, 87, 28);

        bEliminar.setBackground(new java.awt.Color(12, 43, 135));
        bEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bEliminar.setText("Eliminar");
        bEliminar.setEnabled(false);
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bEliminar);
        bEliminar.setBounds(130, 430, 97, 28);

        bGuardar.setBackground(new java.awt.Color(12, 43, 135));
        bGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bGuardar.setForeground(new java.awt.Color(255, 255, 255));
        bGuardar.setText("Guardar");
        bGuardar.setEnabled(false);
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(bGuardar);
        bGuardar.setBounds(240, 430, 94, 28);

        bEditar.setBackground(new java.awt.Color(12, 43, 135));
        bEditar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bEditar.setForeground(new java.awt.Color(255, 255, 255));
        bEditar.setText("Editar");
        bEditar.setEnabled(false);
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        jPanel1.add(bEditar);
        bEditar.setBounds(350, 430, 180, 28);

        lEstado.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        lEstado.setForeground(new java.awt.Color(255, 255, 255));
        lEstado.setText("Estado");
        lEstado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lEstado);
        lEstado.setBounds(30, 350, 110, 28);

        rbEstado.setEnabled(false);
        jPanel1.add(rbEstado);
        rbEstado.setBounds(140, 350, 38, 19);

        lAño.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        lAño.setForeground(new java.awt.Color(255, 255, 255));
        lAño.setText("Año");
        jPanel1.add(lAño);
        lAño.setBounds(30, 280, 61, 41);

        tfanio.setEditable(false);
        tfanio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfanioKeyTyped(evt);
            }
        });
        jPanel1.add(tfanio);
        tfanio.setBounds(140, 280, 98, 33);

        lNombre.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        lNombre.setForeground(new java.awt.Color(255, 255, 255));
        lNombre.setText("Nombre");
        jPanel1.add(lNombre);
        lNombre.setBounds(30, 200, 61, 41);

        tfNombre.setEditable(false);
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });
        jPanel1.add(tfNombre);
        tfNombre.setBounds(140, 200, 216, 33);

        bBuscar.setBackground(new java.awt.Color(12, 43, 135));
        bBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bBuscar.setForeground(new java.awt.Color(255, 255, 255));
        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(bBuscar);
        bBuscar.setBounds(340, 80, 190, 28);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 570, 28);

        tfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(tfCodigo);
        tfCodigo.setBounds(140, 80, 101, 33);

        lCodigo.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        lCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lCodigo.setText("Código");
        jPanel1.add(lCodigo);
        lCodigo.setBounds(30, 80, 61, 41);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(40, 50, 490, 3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        String idBuscado = tfCodigo.getText();
        if (idBuscado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un código válido");
            return;
        }
        int codigo = Integer.parseInt(idBuscado);
        Materia materiaEncontrada = materiaData.buscarMateria(codigo);
        if (materiaEncontrada != null) {
            tfCodigo.setText(idBuscado);
            tfNombre.setText(materiaEncontrada.getNombre());
            tfanio.setText(Integer.toString(materiaEncontrada.getAnioMateria()));
            rbEstado.setSelected(materiaEncontrada.isActivo());
            rbEstado.setEnabled(false);
            activarBotones();
        } else {
            clean();
            JOptionPane.showMessageDialog(null, "Materia no encontrada");
        }


    }//GEN-LAST:event_bBuscarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        clean();
        desactivarId();
        activarNAE();
        bGuardar.setEnabled(true);
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        //Color original = bEditar.getBackground();
        Color original = new Color(12, 43, 135);
        if (!editando) {//si no se está editando...
            String idMateria = tfCodigo.getText();
            if (idMateria.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un Código valido.");
                return;
            }
            Materia materiaExistente = materiaData.buscarMateria(Integer.parseInt(idMateria));

            if (materiaExistente == null) {
                JOptionPane.showMessageDialog(null, "No se encontró la materia");
                return;
            }
            //habilito edicion de nombre y año ydesactivo ID
            activarNAE();
            desactivarId();

            //Cambiar texto de botón            
            bEditar.setText("Terminar Edicion");
            bEditar.setBackground(Color.red);
            //cambio el estado de editando
            editando = true;
        } else {
            //si se está editando...
            int idMateria = Integer.parseInt(tfCodigo.getText());
            String nombreMateria = tfNombre.getText();
            int anioMateria = Integer.parseInt(tfanio.getText());
            boolean estado = rbEstado.isSelected();

            //validar si no estan vacios
            if (nombreMateria.isEmpty() || tfanio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete los campo");
                return;
            }
            //creo una nueva instancia Materia
            Materia materiaEditada = new Materia();
            materiaEditada.setIdMateria(idMateria);
            materiaEditada.setNombre(nombreMateria);
            materiaEditada.setAnioMateria(anioMateria);
            materiaEditada.setActivo(estado);
            //llamo al método actualizar
            materiaData.modificarMateria(materiaEditada);

            //limpiar
            bEditar.setBackground(original);
            editando = false;
            bEditar.setText("Editar");
            clean();
            desactivarElementos();
            desactivarBotones();
        }
    }//GEN-LAST:event_bEditarActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        String nombreMateria = tfNombre.getText();
        String anioMateria = tfanio.getText();

        //Validar campos vacios
        int anio = Integer.parseInt(anioMateria);
        if (anio < 1 || anio > 5) {
            JOptionPane.showMessageDialog(null, "El año de la materia debe ser entre 1 y 5.");
            return;
        }
        //Validar que el año entre 1 y 5
        if (anio < 1 || anio > 5) {
            JOptionPane.showMessageDialog(null, "El año de la materia debe ser entre 1 y 5.");
            return;
        }
        //Validar si materia existe por nombre
        Materia materiaExistente = materiaData.buscarMateriaPorNombre(nombreMateria);
        if (materiaExistente != null) {
            //si existe, se notifica...
            JOptionPane.showMessageDialog(null, "La materia ya existe, sólo puede editarla.");
            //y se settean los campos habilitando la opción editar
            tfCodigo.setText(String.valueOf(materiaExistente.getIdMateria()));
            tfNombre.setText(nombreMateria);
            tfanio.setText(String.valueOf(materiaExistente.getAnioMateria()));
            rbEstado.setSelected(materiaExistente.isActivo());
            activarBotones();
            desactivarElementos();
        } else {
            //si no existe setteo y guardo...
            Materia nuevaMateria = new Materia();
            nuevaMateria.setNombre(nombreMateria);
            nuevaMateria.setAnioMateria(Integer.parseInt(anioMateria));
            nuevaMateria.setActivo(rbEstado.isSelected());
            materiaData.guardarMateria(nuevaMateria);
            clean();
            desactivarElementos();
            desactivarBotones();
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void tfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyTyped
        AccesoService.Service.esNumero(evt);
    }//GEN-LAST:event_tfCodigoKeyTyped

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
        AccesoService.Service.esLetra(evt);
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfanioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfanioKeyTyped
        AccesoService.Service.esNumero(evt);
    }//GEN-LAST:event_tfanioKeyTyped

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        String idMateria = tfCodigo.getText();
        if (idMateria != null) {
            materiaData.eliminarMateria(Integer.parseInt(idMateria));
            clean();
            desactivarElementos();
        } else {
            JOptionPane.showConfirmDialog(null, "No se seleccionó ninguna materia a eliminar.", "Error", JOptionPane.YES_NO_OPTION);
        }
    }//GEN-LAST:event_bEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lAño;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lNombre;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfanio;
    // End of variables declaration//GEN-END:variables

    private void clean() {
        tfCodigo.setText("");
        tfNombre.setText("");
        tfanio.setText("");
        rbEstado.setSelected(false);
    }

    private void desactivarId() {
        tfCodigo.setEditable(false);
    }

    private void desactivarElementos() {
        tfCodigo.setEditable(true);
        tfNombre.setEditable(false);
        tfanio.setEditable(false);
        rbEstado.setEnabled(false);
    }

    private void activarNAE() {
        tfNombre.setEditable(true);
        tfanio.setEditable(true);
        rbEstado.setEnabled(true);
    }

    private void activarBotones() {
        bEliminar.setEnabled(true);
        bGuardar.setEnabled(true);
        bEditar.setEnabled(true);
    }

    public void centrarEnDesktopPane() {
        Dimension desktopSize = this.getDesktopPane().getSize();
        Dimension internalFrameSize = this.getSize();
        int x = (desktopSize.width - internalFrameSize.width) / 2;
        int y = (desktopSize.height - internalFrameSize.height) / 2;
        this.setLocation(x, y);
    }

    private void desactivarBotones() {
        bEliminar.setEnabled(false);
        bGuardar.setEnabled(false);
        bEditar.setEnabled(false);
    }
}
