package vdesisgeditec.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import vdesisgeditec.Modelo.Proveedor;
import vdesisgeditec.Vista.login;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import vdesisgeditec.Controlador.registrarpedidosController;
import vdesisgeditec.Modelo.Conexion;
import vdesisgeditec.Modelo.Pedido;
import vdesisgeditec.Modelo.Pedido.ComboItem;

public class registrar_pedidos extends javax.swing.JFrame {

    private int idpedido = -1;

    public registrar_pedidos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Registar Pedidos");
        cargarClientes();
        cargarProductos();
        CargarTablaPedidos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vs_pedidos = new javax.swing.JTable();
        cboproveedor = new javax.swing.JComboBox<>();
        txtprecio_unidad1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtnumeroitems = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpedidos = new javax.swing.JTable();
        btnmenu = new javax.swing.JButton();
        cboproducto = new javax.swing.JComboBox<>();
        cbocliente = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtpreciounidad = new javax.swing.JTextField();
        txtpreciototalpedido = new javax.swing.JTextField();
        btncalculartotal = new javax.swing.JButton();

        tbl_vs_pedidos.setBackground(new java.awt.Color(0, 6, 73));
        tbl_vs_pedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        tbl_vs_pedidos.setForeground(new java.awt.Color(255, 255, 255));
        tbl_vs_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Pedidos", "ID Proveedor", "ID Producto", "ID Cliente", "Descripcion", "Numero Items", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_vs_pedidos.setGridColor(new java.awt.Color(0, 6, 73));
        tbl_vs_pedidos.setSelectionBackground(new java.awt.Color(0, 6, 73));
        jScrollPane1.setViewportView(tbl_vs_pedidos);

        cboproveedor.setForeground(new java.awt.Color(0, 6, 73));
        cboproveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        cboproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboproveedorActionPerformed(evt);
            }
        });

        txtprecio_unidad1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtprecio_unidad1.setForeground(new java.awt.Color(0, 6, 73));
        txtprecio_unidad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        jLabel26.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Direccion:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Registro de Pedidos");

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        jLabel21.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Producto:");

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cliente:");

        txtdireccion.setEditable(false);
        txtdireccion.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtdireccion.setForeground(new java.awt.Color(0, 6, 73));
        txtdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        jLabel25.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Numero Items:");

        txtnumeroitems.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtnumeroitems.setForeground(new java.awt.Color(0, 6, 73));
        txtnumeroitems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));
        txtnumeroitems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroitemsActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Precio Total:");

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

        tblpedidos.setBackground(new java.awt.Color(0, 6, 73));
        tblpedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        tblpedidos.setForeground(new java.awt.Color(255, 255, 255));
        tblpedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Usuario", "ID Pedido", "ID Proveedor", "ID Producto", "ID Cliente", "Direccion", "Numero Items", "Precio Total", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblpedidos.setGridColor(new java.awt.Color(0, 6, 73));
        tblpedidos.setSelectionBackground(new java.awt.Color(0, 6, 73));
        jScrollPane2.setViewportView(tblpedidos);

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

        cboproducto.setForeground(new java.awt.Color(0, 6, 73));
        cboproducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        cboproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboproductoActionPerformed(evt);
            }
        });

        cbocliente.setForeground(new java.awt.Color(0, 6, 73));
        cbocliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        cbocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboclienteActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Direccion:");

        txttelefono.setEditable(false);
        txttelefono.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txttelefono.setForeground(new java.awt.Color(0, 6, 73));
        txttelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        jLabel28.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Telefono:");

        jLabel29.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Precio Unidad:");

        txtpreciounidad.setEditable(false);
        txtpreciounidad.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtpreciounidad.setForeground(new java.awt.Color(0, 6, 73));
        txtpreciounidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        txtpreciototalpedido.setEditable(false);
        txtpreciototalpedido.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtpreciototalpedido.setForeground(new java.awt.Color(0, 6, 73));
        txtpreciototalpedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        btncalculartotal.setBackground(new java.awt.Color(0, 6, 73));
        btncalculartotal.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btncalculartotal.setForeground(new java.awt.Color(255, 255, 255));
        btncalculartotal.setText("Calcular Total");
        btncalculartotal.setAutoscrolls(true);
        btncalculartotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculartotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnmenu))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpreciototalpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel25)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel28)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtnumeroitems, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtpreciounidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btncalculartotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnregistrar)
                                .addGap(41, 41, 41)
                                .addComponent(btnactualizar)))))
                .addGap(49, 49, 49))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpreciounidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumeroitems, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpreciototalpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(402, 402, 402)
                                .addComponent(btnregistrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncalculartotal)
                            .addComponent(btnmenu))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboproveedorActionPerformed

    }//GEN-LAST:event_cboproveedorActionPerformed

    private void btncalculartotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculartotalActionPerformed
        calcularPrecioTotal();
    }//GEN-LAST:event_btncalculartotalActionPerformed

    private void cboclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboclienteActionPerformed
        cbocliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComboItem selectedItem = (ComboItem) cbocliente.getSelectedItem();
                if (selectedItem != null) {
                    int idCliente = selectedItem.getId();

                    try (Connection con = Conexion.conectar()) {
                        String sql = "SELECT direccion, numero_telefonico FROM vdsisgeditec.clientes WHERE id_cliente = ?";
                        PreparedStatement pst = con.prepareStatement(sql);
                        pst.setInt(1, idCliente);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {
                            txtdireccion.setText(rs.getString("direccion"));
                            txttelefono.setText(rs.getString("numero_telefonico"));
                        }

                        rs.close();
                        pst.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al cargar datos del cliente: " + ex.getMessage());
                    }
                }
            }
        });
    }//GEN-LAST:event_cboclienteActionPerformed

    private void cboproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboproductoActionPerformed
        cboproducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComboItem selectedItem = (ComboItem) cboproducto.getSelectedItem();
                if (selectedItem != null) {
                    int idProducto = selectedItem.getId();

                    try (Connection con = Conexion.conectar()) {
                        String sql = "SELECT precio_unidad FROM vdsisgeditec.productos WHERE id_producto = ?";
                        PreparedStatement pst = con.prepareStatement(sql);
                        pst.setInt(1, idProducto);
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {
                            txtpreciounidad.setText(String.valueOf(rs.getDouble("precio_unidad")));
                        }

                        rs.close();
                        pst.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al cargar datos del producto: " + ex.getMessage());
                    }
                }
            }
        });
    }//GEN-LAST:event_cboproductoActionPerformed

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
        Pedido pedido = new Pedido();
        registrarpedidosController controlRegistroPedidos = new registrarpedidosController();

        if (cbocliente.getSelectedItem() == null || cboproducto.getSelectedItem() == null || txtnumeroitems.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {

            ComboItem clienteItem = (ComboItem) cbocliente.getSelectedItem();
            ComboItem productoItem = (ComboItem) cboproducto.getSelectedItem();
            int idProveedor = obtenerIdProveedorDesdeProducto(productoItem.getId());

            pedido.setId_usuario(login.usuarioActivoId);
            pedido.setId_cliente(clienteItem.getId());
            pedido.setId_producto(productoItem.getId());
            pedido.setId_proveedor(idProveedor);
            pedido.setDireccion(txtdireccion.getText().trim());
            pedido.setTelefono(Long.parseLong(txttelefono.getText()));
            pedido.setNumero_items(Integer.parseInt(txtnumeroitems.getText()));
            pedido.setPrecio_total(Double.parseDouble(txtpreciototalpedido.getText()));

            if (controlRegistroPedidos.registrar(pedido)) {
                JOptionPane.showMessageDialog(null, "Pedido registrado exitosamente.");
                CargarTablaPedidos();

            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar el pedido.");
            }
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        cbocliente.setSelectedIndex(-1);
        cboproducto.setSelectedIndex(-1);
        txtdireccion.setText("");
        txttelefono.setText("");
        txtpreciounidad.setText("");
        txtnumeroitems.setText("");
        txtpreciototalpedido.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        actualizarPedido();
        CargarTablaPedidos();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtnumeroitemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroitemsActionPerformed
        txtnumeroitems.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                calcularPrecioTotal();
            }
        });
    }//GEN-LAST:event_txtnumeroitemsActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrar_pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btncalculartotal;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<ComboItem> cbocliente;
    private javax.swing.JComboBox<ComboItem> cboproducto;
    private javax.swing.JComboBox<Proveedor> cboproveedor;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_vs_pedidos;
    public static javax.swing.JTable tblpedidos;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnumeroitems;
    private javax.swing.JTextField txtprecio_unidad1;
    private javax.swing.JTextField txtpreciototalpedido;
    private javax.swing.JTextField txtpreciounidad;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarClientes() {
        cbocliente.removeAllItems();
        Connection con = Conexion.conectar();
        String sql = "SELECT id_cliente, nombre_cliente FROM vdsisgeditec.clientes";

        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            cbocliente.removeAllItems();

            while (rs.next()) {
                int idCliente = rs.getInt("id_cliente");
                String nombreCliente = rs.getString("nombre_cliente");

                cbocliente.addItem(new ComboItem(idCliente, nombreCliente));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar clientes: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void cargarProductos() {
        cboproducto.removeAllItems();
        Connection con = Conexion.conectar();
        String sql = "SELECT id_producto, nombre_producto FROM vdsisgeditec.productos";

        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                int idProducto = rs.getInt("id_producto");
                String nombreProducto = rs.getString("nombre_producto");

                cboproducto.addItem(new ComboItem(idProducto, nombreProducto));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar productos: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void calcularPrecioTotal() {
        try {
            int cantidadItems = Integer.parseInt(txtnumeroitems.getText());
            double precioUnidad = Double.parseDouble(txtpreciounidad.getText());
            double precioTotal = cantidadItems * precioUnidad;

            txtpreciototalpedido.setText(String.valueOf(precioTotal));
        } catch (NumberFormatException ex) {
            txtpreciototalpedido.setText("0.0");
        }
    }

    private int obtenerIdProveedorDesdeProducto(int idProducto) {
        int idProveedor = -1;
        Connection cn = Conexion.conectar();
        String sql = "SELECT id_proveedor FROM productos WHERE id_producto = ?";

        try {
            PreparedStatement consulta = cn.prepareStatement(sql);
            consulta.setInt(1, idProducto);
            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {
                idProveedor = rs.getInt("id_proveedor");
            }

            rs.close();
            consulta.close();
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el proveedor: " + e.getMessage());
        }
        return idProveedor;
    }

    private void EnviarDatosPedidoSeleccionado(int idPedido) {
        try {
            Connection con = Conexion.conectar();
            String sql = "SELECT p.id_cliente, p.id_producto, pr.nombre_producto, p.numero_items, p.precio_total, p.direccion, p.telefono "
                    + "FROM vdsisgeditec.pedidos p "
                    + "JOIN vdsisgeditec.productos pr ON p.id_producto = pr.id_producto "
                    + "WHERE p.id_pedido = ?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idPedido);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                idpedido = idPedido;
                txtdireccion.setText(rs.getString("direccion"));
                txttelefono.setText(rs.getString("telefono"));
                txtnumeroitems.setText(String.valueOf(rs.getInt("numero_items")));
                txtpreciototalpedido.setText(String.valueOf(rs.getDouble("precio_total")));

                cargarClientes();
                cargarProductos();

                int idCliente = rs.getInt("id_cliente");
                int idProducto = rs.getInt("id_producto");

                for (int i = 0; i < cbocliente.getItemCount(); i++) {
                    ComboItem item = (ComboItem) cbocliente.getItemAt(i);
                    if (item.getId() == idCliente) {
                        cbocliente.setSelectedIndex(i);
                        break;
                    }
                }

                for (int i = 0; i < cboproducto.getItemCount(); i++) {
                    ComboItem item = (ComboItem) cboproducto.getItemAt(i);
                    if (item.getId() == idProducto) {
                        cboproducto.setSelectedIndex(i);
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pedido no encontrado.");
            }

            rs.close();
            pst.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el pedido: " + e);
        }
    }

    private void CargarTablaPedidos() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();

        String sql = "SELECT p.id_usuario, p.id_pedido, pv.nombre_proveedor, pr.nombre_producto, c.nombre_cliente, p.direccion, p.numero_items, p.precio_total, p.telefono "
                + "FROM vdsisgeditec.pedidos p "
                + "JOIN vdsisgeditec.productos pr ON p.id_producto = pr.id_producto "
                + "JOIN vdsisgeditec.proveedores pv ON pr.id_proveedor = pv.id_proveedor "
                + "JOIN vdsisgeditec.clientes c ON p.id_cliente = c.id_cliente";

        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            model.addColumn("ID Usuario");
            model.addColumn("ID Pedido");
            model.addColumn("ID Proveedor");
            model.addColumn("ID Producto");
            model.addColumn("ID Cliente");
            model.addColumn("Dirección");
            model.addColumn("Número de Items");
            model.addColumn("Precio Total");
            model.addColumn("Teléfono");

            while (rs.next()) {
                Object[] fila = new Object[9];
                for (int i = 0; i < 9; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }

            registrar_pedidos.tblpedidos.setModel(model);
            registrar_pedidos.jScrollPane2.setViewportView(registrar_pedidos.tblpedidos);

            registrar_pedidos.tblpedidos.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila_point = registrar_pedidos.tblpedidos.rowAtPoint(e.getPoint());
                    if (fila_point > -1) {
                        int idPedido = (int) model.getValueAt(fila_point, 1); 
                        System.out.println("ID pedido seleccionado en mouseClicked: " + idPedido);
                        EnviarDatosPedidoSeleccionado(idPedido);
 
                    } else {
                        System.out.println("No hay fila seleccionada.");
                    }
                }
            });
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede cargar la tabla de pedidos: " + e);
        }
    }

   private void actualizarPedido() {
    System.out.println("ID del pedido seleccionado: " + idpedido);

    String direccion = txtdireccion.getText().trim();
    String telefono = txttelefono.getText().trim();
    int numeroItems = Integer.parseInt(txtnumeroitems.getText().trim());
    double precioTotal = Double.parseDouble(txtpreciototalpedido.getText().trim());

    // Obtener el id_cliente y id_producto del ComboBox
    int idClienteSeleccionado = ((ComboItem) cbocliente.getSelectedItem()).getId();
    int idProductoSeleccionado = ((ComboItem) cboproducto.getSelectedItem()).getId();

    if (idpedido > -1) {
        try {
            Connection con = Conexion.conectar();
            String sql = "UPDATE vdsisgeditec.pedidos SET id_cliente = ?, id_producto = ?, direccion = ?, telefono = ?, numero_items = ?, precio_total = ? WHERE id_pedido = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, idClienteSeleccionado); // Actualiza el id_cliente
            pst.setInt(2, idProductoSeleccionado); // Actualiza el id_producto
            pst.setString(3, direccion);
            pst.setString(4, telefono);
            pst.setInt(5, numeroItems);
            pst.setDouble(6, precioTotal);
            pst.setInt(7, idpedido); // ID del pedido que estás actualizando

            int filasActualizadas = pst.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Pedido actualizado exitosamente.");
                CargarTablaPedidos();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el pedido.");
            }

            pst.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el pedido: " + e);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Debe seleccionar un pedido para actualizar.");
    }
}

    
    
}
