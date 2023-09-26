package vistas;

import accesoADatos.MateriaData;
import entidades.Materia;
import java.awt.Color;
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

        setClosable(true);

        jPanel1.setLayout(null);

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(bNuevo);
        bNuevo.setBounds(30, 390, 87, 25);

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bEliminar);
        bEliminar.setBounds(140, 390, 86, 25);

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(bGuardar);
        bGuardar.setBounds(240, 390, 84, 25);

        bEditar.setText("Editar");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        jPanel1.add(bEditar);
        bEditar.setBounds(350, 390, 160, 25);

        lEstado.setText("Estado");
        jPanel1.add(lEstado);
        lEstado.setBounds(30, 300, 61, 28);

        rbEstado.setEnabled(false);
        jPanel1.add(rbEstado);
        rbEstado.setBounds(110, 310, 38, 19);

        lAño.setText("Año");
        jPanel1.add(lAño);
        lAño.setBounds(40, 230, 61, 41);

        tfanio.setEditable(false);
        tfanio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfanioKeyTyped(evt);
            }
        });
        jPanel1.add(tfanio);
        tfanio.setBounds(110, 230, 98, 33);

        lNombre.setText("Nombre");
        jPanel1.add(lNombre);
        lNombre.setBounds(30, 160, 61, 41);

        tfNombre.setEditable(false);
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });
        jPanel1.add(tfNombre);
        tfNombre.setBounds(110, 160, 216, 33);

        bBuscar.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(bBuscar);
        bBuscar.setBounds(340, 80, 178, 25);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 570, 28);

        tfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(tfCodigo);
        tfCodigo.setBounds(120, 80, 101, 33);

        lCodigo.setText("Código");
        jPanel1.add(lCodigo);
        lCodigo.setBounds(40, 80, 61, 41);

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
            rbEstado.setEnabled(true);
        } else {
            clean();
            JOptionPane.showMessageDialog(null, "Materia no encontrada");

        }


    }//GEN-LAST:event_bBuscarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        clean();
        desactivarId();
        activarNAE();
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
            Color original=bEditar.getBackground();
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
            bEditar.setBackground(Color.LIGHT_GRAY);
            editando = false;
            bEditar.setText("Editar");
            clean();
            activar();

        }


    }//GEN-LAST:event_bEditarActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        String nombreMateria = tfNombre.getText();
        String anioMateria = tfanio.getText();

        //Validar campos vacios
        if (nombreMateria.isEmpty() || anioMateria.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos");
            return;
        }
        //Validar si materia existe por nombre
        Materia materiaExistente = materiaData.buscarMateriaPorNombre(nombreMateria);
        if (materiaExistente != null) {
            //si existe, se notifica...
            JOptionPane.showMessageDialog(null, "La materia ya existe, puede editarla.");
        } else {
            //si no existe setteo y guardo...
            Materia nuevaMateria = new Materia();
            nuevaMateria.setNombre(nombreMateria);
            nuevaMateria.setAnioMateria(Integer.parseInt(anioMateria));
            nuevaMateria.setActivo(rbEstado.isSelected());
            materiaData.guardarMateria(nuevaMateria);
        }
        clean();
        activar();
    }//GEN-LAST:event_bGuardarActionPerformed

    private void tfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyTyped
        /*método para verificar si cada caracter es un numero del 0 al 9 por ASCII y
        si no lo es borra el caracter.*/
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }

    }//GEN-LAST:event_tfCodigoKeyTyped

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
        /*método para verificar si cada caracter es una letra con el método
        isLetter(). Y además verifica que si es un espacio lo deja escribir
        Si no lo es se consume el caracter y no lo escribe .*/
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfanioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfanioKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_tfanioKeyTyped

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        String idMateria = tfCodigo.getText();
//        int codigo = JOptionPane.showConfirmDialog(null, "Seguro desea borrar la materia?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
//
//        if (idMateria != null && codigo == JOptionPane.YES_OPTION) {
//            JOptionPane.showMessageDialog(null, "Seguro desea borrar la materia?");
//            materiaData.eliminarMateria(Integer.parseInt(idMateria));
//        } else if (codigo == JOptionPane.NO_OPTION) {
//            JOptionPane.showMessageDialog(null, "Cancelaste...");
//            return;
//        }

    if (idMateria!=null) {
            materiaData.eliminarMateria(Integer.parseInt(idMateria));
            clean();
            activar();
        }else{
            JOptionPane.showConfirmDialog(null, "No se seleccionó ninguna materia a eliminar.","Error",JOptionPane.YES_NO_OPTION);
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

    private void activar() {
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
}
