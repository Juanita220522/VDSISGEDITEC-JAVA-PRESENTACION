package vdesisgeditec.Vista;

import java.sql.PreparedStatement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vdesisgeditec.Controlador.registrarproductosController;
import vdesisgeditec.Modelo.Conexion;
import vdesisgeditec.Modelo.Producto;
import vdesisgeditec.Modelo.Proveedor;

public class registrar_productos extends javax.swing.JFrame {

    private int idproducto = -1;

    public registrar_productos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Productos");
        cargarProveedores();
        CargarTablaProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtnombreproducto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtpreciounidad = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproductos = new javax.swing.JTable();
        btnmenu = new javax.swing.JButton();
        cboproveedor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Registro de Productos");

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        jLabel21.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ID Proveedor:");

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nombre Producto:");

        txtnombreproducto.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtnombreproducto.setForeground(new java.awt.Color(0, 6, 73));
        txtnombreproducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Marca:");

        txtmarca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtmarca.setForeground(new java.awt.Color(0, 6, 73));
        txtmarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        jLabel24.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Precio Unidad:");

        txtpreciounidad.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtpreciounidad.setForeground(new java.awt.Color(0, 6, 73));
        txtpreciounidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

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

        tblproductos.setBackground(new java.awt.Color(0, 6, 73));
        tblproductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        tblproductos.setForeground(new java.awt.Color(255, 255, 255));
        tblproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "ID Proveedor", "Nombre Producto", "Marca", "Precio Unidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblproductos.setGridColor(new java.awt.Color(0, 6, 73));
        tblproductos.setSelectionBackground(new java.awt.Color(0, 6, 73));
        jScrollPane1.setViewportView(tblproductos);

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

        cboproveedor.setForeground(new java.awt.Color(0, 6, 73));
        cboproveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        cboproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboproveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnregistrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnactualizar))
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel24)
                                    .addComponent(cboproveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtnombreproducto)
                                    .addComponent(txtmarca)
                                    .addComponent(txtpreciounidad)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnmenu)
                        .addGap(33, 33, 33))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpreciounidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnregistrar)
                            .addComponent(btnactualizar))
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnmenu)
                .addGap(25, 25, 25))
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
                .addGap(262, 262, 262))
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

    private void cboproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboproveedorActionPerformed

    }//GEN-LAST:event_cboproveedorActionPerformed

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

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        Producto producto = new Producto();
        registrarproductosController controlRegistroProducto = new registrarproductosController();

        producto.setId_usuario(login.usuarioActivoId);
        Proveedor proveedorSeleccionado = (Proveedor) cboproveedor.getSelectedItem();
        producto.setId_proveedor(proveedorSeleccionado.getId_proveedor());
        producto.setNombre_producto(txtnombreproducto.getText().trim());
        producto.setMarca(txtmarca.getText().trim());
        producto.setPreciounidad(Double.parseDouble(txtpreciounidad.getText().trim()));

        if (controlRegistroProducto.registrar(producto)) {
            JOptionPane.showMessageDialog(null, "Producto registrado exitosamente.");
            CargarTablaProductos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el producto.");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        cboproveedor.setSelectedItem(0);
        txtnombreproducto.setText("");
        txtmarca.setText("");
        txtpreciounidad.setText("");

    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        actualizarProducto();
    }//GEN-LAST:event_btnactualizarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registrar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrar_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<Proveedor> cboproveedor;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblproductos;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnombreproducto;
    private javax.swing.JTextField txtpreciounidad;
    // End of variables declaration//GEN-END:variables

    private void cargarProveedores() {
        Connection con = Conexion.conectar();
        String sql = "SELECT id_proveedor, nombre_proveedor FROM vdsisgeditec.proveedores";

        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            cboproveedor.removeAllItems();

            while (rs.next()) {
                int idProveedor = rs.getInt("id_proveedor");
                String nombreProveedor = rs.getString("nombre_proveedor");

                Proveedor proveedor = new Proveedor(idProveedor, nombreProveedor);
                cboproveedor.addItem(proveedor);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar proveedores: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void CargarTablaProductos() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();

        String sql = "SELECT p.id_usuario, p.id_producto, pr.nombre_proveedor, p.nombre_producto, p.marca, p.precio_unidad FROM vdsisgeditec.productos p JOIN vdsisgeditec.proveedores pr ON p.id_proveedor = pr.id_proveedor";
        
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            model.addColumn("ID Usuario");
            model.addColumn("ID Producto");
            model.addColumn("Nombre Proveedor");
            model.addColumn("Nombre Producto");
            model.addColumn("Marca");
            model.addColumn("Precio Unidad");

            while (rs.next()) {
                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }

            registrar_productos.tblproductos.setModel(model);
            registrar_productos.jScrollPane1.setViewportView(registrar_productos.tblproductos);

            registrar_productos.tblproductos.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila_point = registrar_productos.tblproductos.rowAtPoint(e.getPoint());
                    if (fila_point > -1) {
                        idproducto = (int) model.getValueAt(fila_point, 1); 
                        System.out.println("ID producto seleccionado en mouseClicked: " + idproducto);
                        EnviarDatosProductoSeleccionado(idproducto);
                    }
                }
            });
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se Puede Cargar la Tabla de Productos: " + e);
        }

    }

    private void EnviarDatosProductoSeleccionado(int idProducto) {
        try {
            Connection con = Conexion.conectar();
            String sql = "SELECT id_proveedor, nombre_producto, marca, precio_unidad FROM vdsisgeditec.productos WHERE id_producto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idProducto);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtnombreproducto.setText(rs.getString("nombre_producto"));
                txtmarca.setText(rs.getString("marca"));
                txtpreciounidad.setText(rs.getString("precio_unidad"));
            }

            rs.close();
            pst.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar el producto: " + e);
        }
    }

    private void actualizarProducto() {
        System.out.println("ID del producto seleccionado: " + idproducto);
        String nombreProducto = txtnombreproducto.getText();
        String marca = txtmarca.getText();
        double precioUnidad = Double.parseDouble(txtpreciounidad.getText().trim());

        if (idproducto > -1) {
            try {
                Connection con = Conexion.conectar();
                String sql = "UPDATE vdsisgeditec.productos SET nombre_producto = ?, marca = ?, precio_unidad = ? WHERE id_producto = ?";
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, nombreProducto);
                pst.setString(2, marca);
                pst.setDouble(3, precioUnidad);
                pst.setInt(4, idproducto);

                int filasActualizadas = pst.executeUpdate();
                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(null, "Producto actualizado exitosamente.");
                    CargarTablaProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el producto.");
                }

                pst.close();
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar el producto: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto para actualizar.");
        }
    }

}
