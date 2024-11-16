package vdesisgeditec.Vista;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vdesisgeditec.Modelo.Conexion;
public class vs_registro_productos extends javax.swing.JFrame {
  
    public vs_registro_productos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Visualización de Productos");
        CargarTablaProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnmenu1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 6, 73));
        jPanel2.setForeground(new java.awt.Color(0, 6, 73));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(346, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmenu1)
                .addGap(410, 410, 410))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmenu1)
                .addContainerGap(18, Short.MAX_VALUE))
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
                new vs_registro_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmenu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblproductos;
    // End of variables declaration//GEN-END:variables
    private void CargarTablaProductos() {
    Connection con = null;
    DefaultTableModel model = new DefaultTableModel();

    String sql = "SELECT p.id_usuario, p.id_producto, pr.nombre_proveedor, p.nombre_producto, p.marca, p.precio_unidad " +
                 "FROM vdsisgeditec.productos p " +
                 "JOIN vdsisgeditec.proveedores pr ON p.id_proveedor = pr.id_proveedor";

    try {
        con = Conexion.conectar(); 
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
            tblproductos.setModel(model);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No se puede cargar la tabla de productos: " + e);
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
