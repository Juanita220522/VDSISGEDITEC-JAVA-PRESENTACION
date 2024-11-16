package vdesisgeditec.Vista;

public class indiceadmin extends javax.swing.JFrame {

    public indiceadmin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu Administrador");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_visualizar_usuarios = new javax.swing.JButton();
        btn_registrar_usuarios = new javax.swing.JButton();
        btn_visualizar_productos = new javax.swing.JButton();
        btn_visualizar_clientes = new javax.swing.JButton();
        btn_visualizar_proveedores = new javax.swing.JButton();
        btn_visualizar_pedidos = new javax.swing.JButton();
        btn_registrar_productos = new javax.swing.JButton();
        btn_registrar_clientes = new javax.swing.JButton();
        btn_registrar_proveedores = new javax.swing.JButton();
        btn_registrar_pedidos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 6, 73));
        jPanel1.setForeground(new java.awt.Color(0, 6, 73));

        btn_visualizar_usuarios.setBackground(new java.awt.Color(51, 204, 255));
        btn_visualizar_usuarios.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_visualizar_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_visualizar_usuarios.setText("Visualizar Usuarios");
        btn_visualizar_usuarios.setActionCommand("");
        btn_visualizar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualizar_usuariosActionPerformed(evt);
            }
        });

        btn_registrar_usuarios.setBackground(new java.awt.Color(51, 204, 255));
        btn_registrar_usuarios.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_registrar_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar_usuarios.setText("Registrar Usuarios");
        btn_registrar_usuarios.setActionCommand("");
        btn_registrar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_usuariosActionPerformed(evt);
            }
        });

        btn_visualizar_productos.setBackground(new java.awt.Color(51, 204, 255));
        btn_visualizar_productos.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_visualizar_productos.setForeground(new java.awt.Color(255, 255, 255));
        btn_visualizar_productos.setText("Visualizar Productos");
        btn_visualizar_productos.setActionCommand("");
        btn_visualizar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualizar_productosActionPerformed(evt);
            }
        });

        btn_visualizar_clientes.setBackground(new java.awt.Color(51, 204, 255));
        btn_visualizar_clientes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_visualizar_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_visualizar_clientes.setText("Visualizar Clientes");
        btn_visualizar_clientes.setActionCommand("");
        btn_visualizar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualizar_clientesActionPerformed(evt);
            }
        });

        btn_visualizar_proveedores.setBackground(new java.awt.Color(51, 204, 255));
        btn_visualizar_proveedores.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_visualizar_proveedores.setForeground(new java.awt.Color(255, 255, 255));
        btn_visualizar_proveedores.setText("Visualizar Proveedores");
        btn_visualizar_proveedores.setActionCommand("");
        btn_visualizar_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualizar_proveedoresActionPerformed(evt);
            }
        });

        btn_visualizar_pedidos.setBackground(new java.awt.Color(51, 204, 255));
        btn_visualizar_pedidos.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_visualizar_pedidos.setForeground(new java.awt.Color(255, 255, 255));
        btn_visualizar_pedidos.setText("Visualizar Pedidos");
        btn_visualizar_pedidos.setActionCommand("");
        btn_visualizar_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualizar_pedidosActionPerformed(evt);
            }
        });

        btn_registrar_productos.setBackground(new java.awt.Color(51, 204, 255));
        btn_registrar_productos.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_registrar_productos.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar_productos.setText("Registrar Productos");
        btn_registrar_productos.setActionCommand("");
        btn_registrar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_productosActionPerformed(evt);
            }
        });

        btn_registrar_clientes.setBackground(new java.awt.Color(51, 204, 255));
        btn_registrar_clientes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_registrar_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar_clientes.setText("Registrar Clientes");
        btn_registrar_clientes.setActionCommand("");
        btn_registrar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_clientesActionPerformed(evt);
            }
        });

        btn_registrar_proveedores.setBackground(new java.awt.Color(51, 204, 255));
        btn_registrar_proveedores.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_registrar_proveedores.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar_proveedores.setText("Registrar Proveedores");
        btn_registrar_proveedores.setActionCommand("");
        btn_registrar_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_proveedoresActionPerformed(evt);
            }
        });

        btn_registrar_pedidos.setBackground(new java.awt.Color(51, 204, 255));
        btn_registrar_pedidos.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_registrar_pedidos.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar_pedidos.setText("Registrar Pedidos");
        btn_registrar_pedidos.setActionCommand("");
        btn_registrar_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_pedidosActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("Administrador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        btnlogin.setBackground(new java.awt.Color(51, 204, 255));
        btnlogin.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Volver al Inicio de Sesion");
        btnlogin.setActionCommand("");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_visualizar_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_visualizar_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_visualizar_proveedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_visualizar_usuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_visualizar_pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_registrar_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_registrar_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_registrar_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_registrar_proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_registrar_pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnlogin)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_visualizar_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_visualizar_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_registrar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_visualizar_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_registrar_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_visualizar_proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_registrar_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_visualizar_pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_registrar_pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrar_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_pedidosActionPerformed
        registrar_pedidos registrarpedidos = new registrar_pedidos();
        registrarpedidos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registrar_pedidosActionPerformed

    private void btn_registrar_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_proveedoresActionPerformed
        registrar_proveedores registrarproveedores = new registrar_proveedores();
        registrarproveedores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registrar_proveedoresActionPerformed

    private void btn_registrar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_clientesActionPerformed
        registrar_clientes registrarclientes = new registrar_clientes();
        registrarclientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registrar_clientesActionPerformed

    private void btn_registrar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_productosActionPerformed
        registrar_productos registrarproductos = new registrar_productos();
        registrarproductos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registrar_productosActionPerformed

    private void btn_visualizar_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualizar_pedidosActionPerformed
        vs_registro_pedidos verpedidos = new vs_registro_pedidos();
        verpedidos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_visualizar_pedidosActionPerformed

    private void btn_visualizar_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualizar_proveedoresActionPerformed
        vs_registro_proveedores verproveedores = new vs_registro_proveedores();
        verproveedores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_visualizar_proveedoresActionPerformed

    private void btn_visualizar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualizar_clientesActionPerformed
        vs_registro_clientes verclientes = new vs_registro_clientes();
        verclientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_visualizar_clientesActionPerformed

    private void btn_registrar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_usuariosActionPerformed
        registrar registrarusuarios = new registrar();
        registrarusuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registrar_usuariosActionPerformed

    private void btn_visualizar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualizar_usuariosActionPerformed
        vs_registro_usuarios verusuarios = new vs_registro_usuarios();
        verusuarios.setVisible(true);
    }//GEN-LAST:event_btn_visualizar_usuariosActionPerformed

    private void btn_visualizar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualizar_productosActionPerformed
        vs_registro_productos verproductos = new vs_registro_productos();
        verproductos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_visualizar_productosActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        login inicio = new login();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnloginActionPerformed

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
            java.util.logging.Logger.getLogger(indiceadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(indiceadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(indiceadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(indiceadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new indiceadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar_clientes;
    private javax.swing.JButton btn_registrar_pedidos;
    private javax.swing.JButton btn_registrar_productos;
    private javax.swing.JButton btn_registrar_proveedores;
    private javax.swing.JButton btn_registrar_usuarios;
    private javax.swing.JButton btn_visualizar_clientes;
    private javax.swing.JButton btn_visualizar_pedidos;
    private javax.swing.JButton btn_visualizar_productos;
    private javax.swing.JButton btn_visualizar_proveedores;
    private javax.swing.JButton btn_visualizar_usuarios;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
