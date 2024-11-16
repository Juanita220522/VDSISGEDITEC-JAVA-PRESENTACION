package vdesisgeditec.Vista;

import javax.swing.JOptionPane;

import vdesisgeditec.Vista.login;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import vdesisgeditec.Modelo.Conexion;

public class vs_registro_pedidos extends javax.swing.JFrame {

    public vs_registro_pedidos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Visualización de Pedidos");
        CargarTablaPedidos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnmenu1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpedidos = new javax.swing.JTable();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 6, 73));
        jPanel2.setForeground(new java.awt.Color(0, 6, 73));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Pedidos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        btnmenu1.setBackground(new java.awt.Color(51, 204, 255));
        btnmenu1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnmenu1.setForeground(new java.awt.Color(255, 255, 255));
        btnmenu1.setText("Menu");
        btnmenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenu1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmenu1)
                .addGap(413, 413, 413))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmenu1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenu1ActionPerformed
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
    }//GEN-LAST:event_btnmenu1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vs_registro_pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmenu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JTable tblpedidos;
    // End of variables declaration//GEN-END:variables
     
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
            model.addColumn("Nombre Proveedor");
            model.addColumn("Nombre Producto");
            model.addColumn("Nombre Cliente");
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
            tblpedidos.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede cargar la tabla de pedidos: " + e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex);
            }
        }
    }
}
