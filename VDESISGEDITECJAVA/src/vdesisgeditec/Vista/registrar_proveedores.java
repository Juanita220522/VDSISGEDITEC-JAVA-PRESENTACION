package vdesisgeditec.Vista;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vdesisgeditec.Controlador.registrarproveedoresController;
import vdesisgeditec.Modelo.Conexion;
import vdesisgeditec.Modelo.Proveedor;

public class registrar_proveedores extends javax.swing.JFrame {

    private int idproveedor = -1;

    public registrar_proveedores() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Proveedores");
        this.CargarTablaProveedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtnombreproveedor = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txttelefonoproveedor = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproveedores = new javax.swing.JTable();
        btnmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Registro de Proveedores");

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nombre Proveedor:");

        txtnombreproveedor.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtnombreproveedor.setForeground(new java.awt.Color(0, 6, 73));
        txtnombreproveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        jLabel24.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Telefono:");

        txttelefonoproveedor.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txttelefonoproveedor.setForeground(new java.awt.Color(0, 6, 73));
        txttelefonoproveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        btnactualizar.setBackground(new java.awt.Color(0, 6, 73));
        btnactualizar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.setAutoscrolls(true);
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btnlimpiar.setBackground(new java.awt.Color(0, 6, 73));
        btnlimpiar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.setAutoscrolls(true);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnregistrar.setBackground(new java.awt.Color(0, 6, 73));
        btnregistrar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnregistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnregistrar.setText("REGISTRAR");
        btnregistrar.setAutoscrolls(true);
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        tblproveedores.setBackground(new java.awt.Color(0, 6, 73));
        tblproveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        tblproveedores.setForeground(new java.awt.Color(255, 255, 255));
        tblproveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Usuario", "ID Proveedores", "Nombre Proveedor", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblproveedores.setGridColor(new java.awt.Color(0, 6, 73));
        tblproveedores.setSelectionBackground(new java.awt.Color(0, 6, 73));
        jScrollPane1.setViewportView(tblproveedores);

        btnmenu.setBackground(new java.awt.Color(0, 6, 73));
        btnmenu.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnmenu.setForeground(new java.awt.Color(255, 255, 255));
        btnmenu.setText("Menu");
        btnmenu.setAutoscrolls(true);
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmenu)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnlimpiar))
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnombreproveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttelefonoproveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnregistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnactualizar)))
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnmenu))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombreproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelefonoproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnregistrar)
                            .addComponent(btnactualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(251, 251, 251))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        actualizarProveedor();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtnombreproveedor.setText("");
        txttelefonoproveedor.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        Proveedor proveedor = new Proveedor();
        registrarproveedoresController controlregistroproveedores = new registrarproveedoresController();

        if (txtnombreproveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Camplete todos los campos");
        } else {

            proveedor.setNombre_proveedor(txtnombreproveedor.getText().trim());
            proveedor.setNumerotelefono(Long.parseLong(txttelefonoproveedor.getText()));
            proveedor.setId_usuario(login.usuarioActivoId);

            if (controlregistroproveedores.registrar(proveedor)) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                CargarTablaProveedor();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
        }

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        if ("administrador".equals(login.tipoUsuarioActivo)) {
            indiceadmin menuadmin = new indiceadmin();
            this.dispose();
            menuadmin.setVisible(true);
        } else if ("cliente".equals(login.tipoUsuarioActivo)) {
            indicecliente menucliente = new indicecliente();
            this.dispose();
            menucliente.setVisible(true);
        } else if ("proveedor".equals(login.tipoUsuarioActivo)) {
            indiceproveedor menuproveedor = new indiceproveedor();
            this.dispose();
            menuproveedor.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Tipo de usuario desconocido");
        }
    }//GEN-LAST:event_btnmenuActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrar_proveedores().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblproveedores;
    private javax.swing.JTextField txtnombreproveedor;
    private javax.swing.JTextField txttelefonoproveedor;
    // End of variables declaration//GEN-END:variables
private void CargarTablaProveedor() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();

        String sql = "SELECT id_usuario, id_proveedor, nombre_proveedor, telefono FROM vdsisgeditec.proveedores";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            registrar_proveedores.tblproveedores.setModel(model);
            registrar_proveedores.jScrollPane1.setViewportView(registrar_proveedores.tblproveedores);

            model.addColumn("ID Usuario");
            model.addColumn("ID Proveedor");
            model.addColumn("Nombre Proveedor");
            model.addColumn("Teléfono");

            while (rs.next()) {
                Object[] fila = new Object[4];
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede cargar la tabla de proveedores: " + e);
        }

        registrar_proveedores.tblproveedores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = registrar_proveedores.tblproveedores.rowAtPoint(e.getPoint());
                if (fila_point > -1) {
                    idproveedor = (int) model.getValueAt(fila_point, 1);
                    System.out.println("ID proveedor seleccionado en mouseClicked: " + idproveedor);
                    EnviarDatosProveedorSeleccionado(idproveedor);
                }
            }
        });
    }

    private void EnviarDatosProveedorSeleccionado(int idproveedor) {
        try {
            Connection con = Conexion.conectar();
            String sql = "SELECT nombre_proveedor, telefono FROM vdsisgeditec.proveedores WHERE id_proveedor = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idproveedor);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtnombreproveedor.setText(rs.getString("nombre_proveedor"));
                txttelefonoproveedor.setText(rs.getString("telefono"));
            }

            rs.close();
            pst.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar proveedor: " + e);
        }
    }

    private void actualizarProveedor() {
        System.out.println("ID del proveedor seleccionado: " + idproveedor);
        String nombreProveedor = txtnombreproveedor.getText();
        String telefono = txttelefonoproveedor.getText();

        if (idproveedor > 0) {
            try {
                Connection con = Conexion.conectar();
                String sql = "UPDATE vdsisgeditec.proveedores SET nombre_proveedor = ?, telefono = ? WHERE id_proveedor = ?";
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, nombreProveedor);
                pst.setString(2, telefono);
                pst.setInt(3, idproveedor);

                int filasActualizadas = pst.executeUpdate();
                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(null, "Proveedor actualizado exitosamente.");
                    CargarTablaProveedor();
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede actualizar el proveedor.");
                }

                pst.close();
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar el proveedor: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor para actualizar.");
        }
    }

}
