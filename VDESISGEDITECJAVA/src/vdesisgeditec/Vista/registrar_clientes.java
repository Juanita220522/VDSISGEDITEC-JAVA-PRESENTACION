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
import vdesisgeditec.Modelo.Clientes;
import vdesisgeditec.Controlador.registrarclientesController;
import vdesisgeditec.Modelo.Conexion;

public class registrar_clientes extends javax.swing.JFrame {

    private int idcliente = -1;

    public registrar_clientes() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Clientes");
        this.CargarTablaClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_vs_clientes = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        txtusuario18 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtnombreempresa = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtnombrecliente = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtlinea = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblclientes = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        txtnumerotelefonico = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();

        tbl_vs_clientes.setBackground(new java.awt.Color(0, 6, 73));
        tbl_vs_clientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        tbl_vs_clientes.setForeground(new java.awt.Color(255, 255, 255));
        tbl_vs_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "ID Pedido", "Nombre Empresa", "Nombre Cliente", "Linea", "Direccion", "Numero Telefonico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_vs_clientes.setGridColor(new java.awt.Color(0, 6, 73));
        tbl_vs_clientes.setSelectionBackground(new java.awt.Color(0, 6, 73));
        jScrollPane3.setViewportView(tbl_vs_clientes);

        jLabel26.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Direccion:");

        txtusuario18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtusuario18.setForeground(new java.awt.Color(0, 6, 73));
        txtusuario18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Registro de Clientes");

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nombre Empresa:");

        txtnombreempresa.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtnombreempresa.setForeground(new java.awt.Color(0, 6, 73));
        txtnombreempresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nombre Cliente:");

        txtnombrecliente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtnombrecliente.setForeground(new java.awt.Color(0, 6, 73));
        txtnombrecliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));
        txtnombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreclienteActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Linea:");

        txtlinea.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtlinea.setForeground(new java.awt.Color(0, 6, 73));
        txtlinea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        jLabel25.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Direccion:");

        txtdireccion.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtdireccion.setForeground(new java.awt.Color(0, 6, 73));
        txtdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

        tblclientes.setBackground(new java.awt.Color(0, 6, 73));
        tblclientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        tblclientes.setForeground(new java.awt.Color(255, 255, 255));
        tblclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Usuario", "ID Cliente", "Nombre Empresa", "Nombre Cliente", "Linea", "Direccion", "Numero Telefonico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblclientes.setGridColor(new java.awt.Color(0, 6, 73));
        tblclientes.setSelectionBackground(new java.awt.Color(0, 6, 73));
        jScrollPane6.setViewportView(tblclientes);

        jLabel27.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Numero Telefonico:");

        txtnumerotelefonico.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtnumerotelefonico.setForeground(new java.awt.Color(0, 6, 73));
        txtnumerotelefonico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 204, 255)));

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
                .addGap(89, 921, Short.MAX_VALUE)
                .addComponent(btnmenu)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombreempresa)
                            .addComponent(txtnombrecliente)
                            .addComponent(txtlinea)
                            .addComponent(txtdireccion)
                            .addComponent(txtnumerotelefonico)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23))
                                    .addComponent(jLabel27)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 108, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnactualizar)
                                .addGap(6, 6, 6))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnmenu)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombreempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtlinea, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumerotelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnregistrar)
                            .addComponent(btnactualizar))
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        actualizarCliente();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed

        txtnombreempresa.setText("");
        txtnombrecliente.setText("");
        txtlinea.setText("");
        txtdireccion.setText("");
        txtnumerotelefonico.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        Clientes clientes = new Clientes();
        registrarclientesController controlregistroclientes = new registrarclientesController();

        if (txtnombreempresa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Camplete todos los campos");
        } else {

            clientes.setNombre_empresa(txtnombreempresa.getText().trim());
            clientes.setNombre_cliente(txtnombrecliente.getText().trim());
            clientes.setLinea(txtlinea.getText().trim());
            clientes.setDireccion(txtdireccion.getText().trim());
            clientes.setNumerotelefono(Long.parseLong(txtnumerotelefonico.getText()));
            clientes.setId_usuario(login.usuarioActivoId);

            if (controlregistroclientes.registrar(clientes)) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                CargarTablaClientes();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
        }

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtnombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreclienteActionPerformed

    }//GEN-LAST:event_txtnombreclienteActionPerformed

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
                new registrar_clientes().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tbl_vs_clientes;
    public static javax.swing.JTable tblclientes;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtlinea;
    private javax.swing.JTextField txtnombrecliente;
    private javax.swing.JTextField txtnombreempresa;
    private javax.swing.JTextField txtnumerotelefonico;
    private javax.swing.JTextField txtusuario18;
    // End of variables declaration//GEN-END:variables

    private void CargarTablaClientes() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();

        String sql = "SELECT id_usuario, id_cliente, nombre_empresa, nombre_cliente, linea, direccion, numero_telefonico FROM vdsisgeditec.clientes";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            registrar_clientes.tblclientes.setModel(model);
            registrar_clientes.jScrollPane6.setViewportView(registrar_clientes.tblclientes);

            model.addColumn("ID Usuario");
            model.addColumn("ID Cliente");
            model.addColumn("Nombre Empresa");
            model.addColumn("Nombre Cliente");
            model.addColumn("Línea");
            model.addColumn("Dirección");
            model.addColumn("Teléfono");

            while (rs.next()) {
                Object[] fila = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede cargar la tabla de clientes: " + e);
        }

        registrar_clientes.tblclientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = registrar_clientes.tblclientes.rowAtPoint(e.getPoint());
                if (fila_point > -1) {
                    idcliente = (int) model.getValueAt(fila_point, 1);
                    System.out.println("ID cliente seleccionado en mouseClicked: " + idcliente);
                    EnviarDatosClientesSeleccionado(idcliente);
                }
            }
        });
    }

    private void EnviarDatosClientesSeleccionado(int idcliente) {
        try {
            Connection con = Conexion.conectar();
            String sql = "SELECT nombre_empresa, nombre_cliente, linea, direccion, numero_telefonico FROM vdsisgeditec.clientes WHERE id_cliente = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idcliente);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtnombreempresa.setText(rs.getString("nombre_empresa"));
                txtnombrecliente.setText(rs.getString("nombre_cliente"));
                txtlinea.setText(rs.getString("linea"));
                txtdireccion.setText(rs.getString("direccion"));
                txtnumerotelefonico.setText(rs.getString("numero_telefonico"));
            }

            rs.close();
            pst.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar el cliente: " + e);
        }
    }

    private void actualizarCliente() {
        System.out.println("ID del cliente seleccionado: " + idcliente);
        String nombreEmpresa = txtnombreempresa.getText();
        String nombreCliente = txtnombrecliente.getText();
        String linea = txtlinea.getText();
        String direccion = txtdireccion.getText();
        String numeroTelefonico = txtnumerotelefonico.getText();

        if (idcliente > 0) {
            try {
                Connection con = Conexion.conectar();
                String sql = "UPDATE vdsisgeditec.clientes SET nombre_empresa = ?, nombre_cliente = ?, linea = ?, direccion = ?, numero_telefonico = ? WHERE id_cliente = ?";
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, nombreEmpresa);
                pst.setString(2, nombreCliente);
                pst.setString(3, linea);
                pst.setString(4, direccion);
                pst.setString(5, numeroTelefonico);
                pst.setInt(6, idcliente);

                int filasActualizadas = pst.executeUpdate();
                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente actualizado exitosamente.");
                    CargarTablaClientes();
                    registrar_clientes.tblclientes.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el cliente.");
                }

                pst.close();
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar el cliente: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente para actualizar.");
        }
    }

}
