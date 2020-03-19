
package archives;

/**
 *
 * @author angel
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_carreras = new javax.swing.JDialog();
        jPanel_VER_carreras = new javax.swing.JPanel();
        jtp_VER_carreras = new javax.swing.JTabbedPane();
        jPanel_VER_CARRERA_agregar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel_VER_CARRERA_modificar = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel_VER_CARRERA_ver = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel_VER_CARRERA_eliminar = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jd_investigadores = new javax.swing.JDialog();
        jd_proyectos = new javax.swing.JDialog();
        jd_publicaciones = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        btg_VER_estado = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_FILE = new javax.swing.JMenu();
        jmi_FILE_abrir = new javax.swing.JMenuItem();
        jmi_FILE_guardar = new javax.swing.JMenuItem();
        jmi_FILE_close = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_FILE_exit = new javax.swing.JMenuItem();
        jm_VER = new javax.swing.JMenu();
        jmi_VER_carreras = new javax.swing.JMenuItem();
        jmi_VER_investigadores = new javax.swing.JMenuItem();
        jmi_VER_proyectos = new javax.swing.JMenuItem();
        jmi_VER_publicaciones = new javax.swing.JMenuItem();

        jd_carreras.setTitle("Carreras");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Estado:");

        btg_VER_estado.add(jRadioButton1);
        jRadioButton1.setText("Activo");

        btg_VER_estado.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Inactivo");

        jButton1.setText("Agregar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton1)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_VER_CARRERA_agregarLayout = new javax.swing.GroupLayout(jPanel_VER_CARRERA_agregar);
        jPanel_VER_CARRERA_agregar.setLayout(jPanel_VER_CARRERA_agregarLayout);
        jPanel_VER_CARRERA_agregarLayout.setHorizontalGroup(
            jPanel_VER_CARRERA_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_VER_CARRERA_agregarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel_VER_CARRERA_agregarLayout.setVerticalGroup(
            jPanel_VER_CARRERA_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VER_CARRERA_agregarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel_VER_CARRERA_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jtp_VER_carreras.addTab("Agregar", jPanel_VER_CARRERA_agregar);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jLabel4.setText("Código:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Estado:");

        jRadioButton3.setText("Activo");

        jRadioButton4.setText("Inactivo");

        jButton2.setText("Guardar");

        jButton3.setText("Editar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField4))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton4)
                                .addComponent(jRadioButton3)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_VER_CARRERA_modificarLayout = new javax.swing.GroupLayout(jPanel_VER_CARRERA_modificar);
        jPanel_VER_CARRERA_modificar.setLayout(jPanel_VER_CARRERA_modificarLayout);
        jPanel_VER_CARRERA_modificarLayout.setHorizontalGroup(
            jPanel_VER_CARRERA_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_VER_CARRERA_modificarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel_VER_CARRERA_modificarLayout.setVerticalGroup(
            jPanel_VER_CARRERA_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VER_CARRERA_modificarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel_VER_CARRERA_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jtp_VER_carreras.addTab("Modificar", jPanel_VER_CARRERA_modificar);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel_VER_CARRERA_verLayout = new javax.swing.GroupLayout(jPanel_VER_CARRERA_ver);
        jPanel_VER_CARRERA_ver.setLayout(jPanel_VER_CARRERA_verLayout);
        jPanel_VER_CARRERA_verLayout.setHorizontalGroup(
            jPanel_VER_CARRERA_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VER_CARRERA_verLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel_VER_CARRERA_verLayout.setVerticalGroup(
            jPanel_VER_CARRERA_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VER_CARRERA_verLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jtp_VER_carreras.addTab("Ver", jPanel_VER_CARRERA_ver);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable2);

        jButton4.setText("Eliminar");

        javax.swing.GroupLayout jPanel_VER_CARRERA_eliminarLayout = new javax.swing.GroupLayout(jPanel_VER_CARRERA_eliminar);
        jPanel_VER_CARRERA_eliminar.setLayout(jPanel_VER_CARRERA_eliminarLayout);
        jPanel_VER_CARRERA_eliminarLayout.setHorizontalGroup(
            jPanel_VER_CARRERA_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VER_CARRERA_eliminarLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel_VER_CARRERA_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel_VER_CARRERA_eliminarLayout.setVerticalGroup(
            jPanel_VER_CARRERA_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VER_CARRERA_eliminarLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jtp_VER_carreras.addTab("Eliminar", jPanel_VER_CARRERA_eliminar);

        javax.swing.GroupLayout jPanel_VER_carrerasLayout = new javax.swing.GroupLayout(jPanel_VER_carreras);
        jPanel_VER_carreras.setLayout(jPanel_VER_carrerasLayout);
        jPanel_VER_carrerasLayout.setHorizontalGroup(
            jPanel_VER_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_VER_carreras)
        );
        jPanel_VER_carrerasLayout.setVerticalGroup(
            jPanel_VER_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_VER_carreras)
        );

        javax.swing.GroupLayout jd_carrerasLayout = new javax.swing.GroupLayout(jd_carreras.getContentPane());
        jd_carreras.getContentPane().setLayout(jd_carrerasLayout);
        jd_carrerasLayout.setHorizontalGroup(
            jd_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_VER_carreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_carrerasLayout.setVerticalGroup(
            jd_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_VER_carreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_investigadores.setTitle("Investigadores");

        javax.swing.GroupLayout jd_investigadoresLayout = new javax.swing.GroupLayout(jd_investigadores.getContentPane());
        jd_investigadores.getContentPane().setLayout(jd_investigadoresLayout);
        jd_investigadoresLayout.setHorizontalGroup(
            jd_investigadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_investigadoresLayout.setVerticalGroup(
            jd_investigadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_proyectos.setTitle("Proyectos");

        javax.swing.GroupLayout jd_proyectosLayout = new javax.swing.GroupLayout(jd_proyectos.getContentPane());
        jd_proyectos.getContentPane().setLayout(jd_proyectosLayout);
        jd_proyectosLayout.setHorizontalGroup(
            jd_proyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_proyectosLayout.setVerticalGroup(
            jd_proyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_publicaciones.setTitle("Publicaciones");

        javax.swing.GroupLayout jd_publicacionesLayout = new javax.swing.GroupLayout(jd_publicaciones.getContentPane());
        jd_publicaciones.getContentPane().setLayout(jd_publicacionesLayout);
        jd_publicacionesLayout.setHorizontalGroup(
            jd_publicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_publicacionesLayout.setVerticalGroup(
            jd_publicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base Datos de Investigadores");

        jm_FILE.setText("File");

        jmi_FILE_abrir.setText("Abrir");
        jm_FILE.add(jmi_FILE_abrir);

        jmi_FILE_guardar.setText("Guardar");
        jm_FILE.add(jmi_FILE_guardar);

        jmi_FILE_close.setText("Close");
        jm_FILE.add(jmi_FILE_close);
        jm_FILE.add(jSeparator1);

        jmi_FILE_exit.setText("Exit");
        jm_FILE.add(jmi_FILE_exit);

        jMenuBar1.add(jm_FILE);

        jm_VER.setText("Ver");

        jmi_VER_carreras.setText("Carreras");
        jmi_VER_carreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_VER_carrerasActionPerformed(evt);
            }
        });
        jm_VER.add(jmi_VER_carreras);

        jmi_VER_investigadores.setText("Investigadores");
        jmi_VER_investigadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_VER_investigadoresActionPerformed(evt);
            }
        });
        jm_VER.add(jmi_VER_investigadores);

        jmi_VER_proyectos.setText("Proyectos");
        jmi_VER_proyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_VER_proyectosActionPerformed(evt);
            }
        });
        jm_VER.add(jmi_VER_proyectos);

        jmi_VER_publicaciones.setText("Publicaciones");
        jmi_VER_publicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_VER_publicacionesActionPerformed(evt);
            }
        });
        jm_VER.add(jmi_VER_publicaciones);

        jMenuBar1.add(jm_VER);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_VER_proyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_VER_proyectosActionPerformed
        jd_proyectos.pack();
        jd_proyectos.setModal(true);
        jd_proyectos.setLocationRelativeTo(this);
        jd_proyectos.setVisible(true);
    }//GEN-LAST:event_jmi_VER_proyectosActionPerformed

    private void jmi_VER_publicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_VER_publicacionesActionPerformed
        jd_publicaciones.pack();
        jd_publicaciones.setModal(true);
        jd_publicaciones.setLocationRelativeTo(this);
        jd_publicaciones.setVisible(true);
    }//GEN-LAST:event_jmi_VER_publicacionesActionPerformed

    private void jmi_VER_carrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_VER_carrerasActionPerformed
        jd_carreras.pack();
        jd_carreras.setModal(true);
        jd_carreras.setLocationRelativeTo(this);
        jd_carreras.setVisible(true);
    }//GEN-LAST:event_jmi_VER_carrerasActionPerformed

    private void jmi_VER_investigadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_VER_investigadoresActionPerformed
        jd_investigadores.pack();
        jd_investigadores.setModal(true);
        jd_investigadores.setLocationRelativeTo(this);
        jd_investigadores.setVisible(true);
    }//GEN-LAST:event_jmi_VER_investigadoresActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_VER_estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel_VER_CARRERA_agregar;
    private javax.swing.JPanel jPanel_VER_CARRERA_eliminar;
    private javax.swing.JPanel jPanel_VER_CARRERA_modificar;
    private javax.swing.JPanel jPanel_VER_CARRERA_ver;
    private javax.swing.JPanel jPanel_VER_carreras;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JDialog jd_carreras;
    private javax.swing.JDialog jd_investigadores;
    private javax.swing.JDialog jd_proyectos;
    private javax.swing.JDialog jd_publicaciones;
    private javax.swing.JMenu jm_FILE;
    private javax.swing.JMenu jm_VER;
    private javax.swing.JMenuItem jmi_FILE_abrir;
    private javax.swing.JMenuItem jmi_FILE_close;
    private javax.swing.JMenuItem jmi_FILE_exit;
    private javax.swing.JMenuItem jmi_FILE_guardar;
    private javax.swing.JMenuItem jmi_VER_carreras;
    private javax.swing.JMenuItem jmi_VER_investigadores;
    private javax.swing.JMenuItem jmi_VER_proyectos;
    private javax.swing.JMenuItem jmi_VER_publicaciones;
    private javax.swing.JTabbedPane jtp_VER_carreras;
    // End of variables declaration//GEN-END:variables
}
