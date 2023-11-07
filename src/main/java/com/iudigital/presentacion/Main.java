package com.iudigital.presentacion;

import controller.FuncionarioController;
import domain.Funcionario;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    private final FuncionarioController funcionarioController;
    private final static String[] COLUMNS = {"ID FUNCIONARIO", "ID TIPO IDENTIFICACIÓN", "ID", "NOMBRES", "APELLIDOS", "DIRECCIÓN", "TELÉFONO", "FECHA NACIMIENTO",
        "ID ESTADO CIVIL", "ID SEXO"};
    private DefaultTableModel defaultTableModel = new DefaultTableModel();

    public Main() {
        defaultTableModel.setColumnIdentifiers(COLUMNS);
        initComponents();
        funcionarioController = new FuncionarioController();
        listarFuncionarios();
    }

    private void listarFuncionarios() {

        Funcionario funcionario = new Funcionario();
        funcionario.setNombres("--SELECCIONE--");
        JCombox_Funcionarios_Actu.addItem(funcionario);
        JCombox_Funcionarios_Eli.addItem(funcionario);
        try {
            List<Funcionario> funcionarios = funcionarioController.getFuncionarios();
            if (funcionarios.isEmpty()) {
                return;
            }

            defaultTableModel.setRowCount(funcionarios.size());
            int row = 0;
            for (Funcionario func : funcionarios) {
                defaultTableModel.setValueAt(func.getId_funcionario(), row, 0);
                defaultTableModel.setValueAt(func.getTipo_id(), row, 1);
                defaultTableModel.setValueAt(func.getNumero_id(), row, 2);
                defaultTableModel.setValueAt(func.getNombres(), row, 3);
                defaultTableModel.setValueAt(func.getApellidos(), row, 4);
                defaultTableModel.setValueAt(func.getDireccion(), row, 5);
                defaultTableModel.setValueAt(func.getTelefono(), row, 6);
                defaultTableModel.setValueAt(func.getFecha_nacimiento(), row, 7);
                defaultTableModel.setValueAt(func.getId_estado_civil(), row, 8);
                defaultTableModel.setValueAt(func.getId_sexo(), row, 9);
                row++;

                JCombox_Funcionarios_Eli.addItem(func);
                JCombox_Funcionarios_Actu.addItem(func);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void addListener() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTPanels = new javax.swing.JTabbedPane();
        jPFun1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_id_funcionario_reg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_numero_id_reg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombres_reg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_apellidos_reg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_direccion_reg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_telefono_reg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_guardar_reg = new javax.swing.JButton();
        btn_limpiar_reg = new javax.swing.JButton();
        JCombox_Tipo_Id_reg = new javax.swing.JComboBox<>();
        JCombox_Id_Estado_Civil_reg = new javax.swing.JComboBox<>();
        JCombox_Id_sexo_reg = new javax.swing.JComboBox<>();
        jDateChooser_reg = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txt_id_bus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Funcionarios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        JCombox_Funcionarios_Eli = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jPFun2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_id_actu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_numero_id_actu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_nombres_actu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_apellidos_actu = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_direccion_actu = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_telefono_actu = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btn_limpiar_actu = new javax.swing.JButton();
        btn_guardar_actu = new javax.swing.JButton();
        JCombox_Estado_Civil_Actu = new javax.swing.JComboBox<>();
        JCombox_Id_Sexo_Actu = new javax.swing.JComboBox<>();
        JCombox_Tipo_Id_Actu = new javax.swing.JComboBox<>();
        JDateChooser_Nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        JCombox_Funcionarios_Actu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ADMINISTRACIÓN FUNCIONARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 190, 20));

        jLabel2.setText("ID Funcionario");

        txt_id_funcionario_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_funcionario_regActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo ID");

        jLabel4.setText("Número ID");

        txt_numero_id_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numero_id_regActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombres");

        txt_nombres_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombres_regActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellidos");

        txt_apellidos_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidos_regActionPerformed(evt);
            }
        });

        jLabel7.setText("Dirección");

        txt_direccion_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion_regActionPerformed(evt);
            }
        });

        jLabel8.setText("Teléfono");

        txt_telefono_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_regActionPerformed(evt);
            }
        });

        jLabel9.setText("Fecha nacimiento");

        jLabel10.setText("ID Estado Civil");

        jLabel11.setText("ID Sexo");

        btn_guardar_reg.setText("Guardar");
        btn_guardar_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_regActionPerformed(evt);
            }
        });

        btn_limpiar_reg.setText("Limpiar");
        btn_limpiar_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar_regActionPerformed(evt);
            }
        });

        JCombox_Tipo_Id_reg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registro Civil", "TI", "CC", "CE", "Pasaporte" }));

        JCombox_Id_Estado_Civil_reg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Union libre", "Viudo" }));

        JCombox_Id_sexo_reg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(txt_telefono_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(txt_direccion_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(txt_apellidos_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(txt_nombres_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(txt_numero_id_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_id_funcionario_reg, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(JCombox_Tipo_Id_reg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(37, 37, 37)
                        .addComponent(btn_guardar_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_limpiar_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JCombox_Id_Estado_Civil_reg, 0, 200, Short.MAX_VALUE)
                            .addComponent(JCombox_Id_sexo_reg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser_reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id_funcionario_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar_reg)
                    .addComponent(btn_limpiar_reg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JCombox_Tipo_Id_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_numero_id_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nombres_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_apellidos_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_direccion_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_telefono_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jDateChooser_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(JCombox_Id_Estado_Civil_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(JCombox_Id_sexo_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPFun1Layout = new javax.swing.GroupLayout(jPFun1);
        jPFun1.setLayout(jPFun1Layout);
        jPFun1Layout.setHorizontalGroup(
            jPFun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPFun1Layout.setVerticalGroup(
            jPFun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPanels.addTab("Registrar Funcionario", jPFun1);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel25.setText("Número ID");

        JTable_Funcionarios.setModel(defaultTableModel);
        JTable_Funcionarios.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(JTable_Funcionarios);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_id_bus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txt_id_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btn_buscar)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPanels.addTab("Buscar Funcionarios", jPanel2);

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel23.setText("Funcionarios");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCombox_Funcionarios_Eli, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(526, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCombox_Funcionarios_Eli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(btn_eliminar)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPanels.addTab("Eliminar Funcionario", jPanel3);

        jLabel12.setText("ID Funcionario");

        txt_id_actu.setEditable(false);
        txt_id_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_actuActionPerformed(evt);
            }
        });

        jLabel13.setText("Tipo ID");

        jLabel14.setText("Número ID");

        txt_numero_id_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numero_id_actuActionPerformed(evt);
            }
        });

        jLabel15.setText("Nombres");

        txt_nombres_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombres_actuActionPerformed(evt);
            }
        });

        jLabel16.setText("Apellidos");

        txt_apellidos_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidos_actuActionPerformed(evt);
            }
        });

        jLabel17.setText("Dirección");

        txt_direccion_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion_actuActionPerformed(evt);
            }
        });

        jLabel18.setText("Teléfono");

        txt_telefono_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_actuActionPerformed(evt);
            }
        });

        jLabel19.setText("Fecha nacimiento");

        jLabel20.setText("Estado Civil");

        jLabel21.setText("Sexo");

        btn_limpiar_actu.setText("Limpiar");
        btn_limpiar_actu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar_actuActionPerformed(evt);
            }
        });

        btn_guardar_actu.setText("Guardar");
        btn_guardar_actu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_actuActionPerformed(evt);
            }
        });

        JCombox_Estado_Civil_Actu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Union libre", "Viudo" }));

        JCombox_Id_Sexo_Actu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        JCombox_Tipo_Id_Actu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registro civil", "TI", "CC", "CE", "Pasaporte" }));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Funcionarios");

        javax.swing.GroupLayout jPFun2Layout = new javax.swing.GroupLayout(jPFun2);
        jPFun2.setLayout(jPFun2Layout);
        jPFun2Layout.setHorizontalGroup(
            jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFun2Layout.createSequentialGroup()
                        .addComponent(btn_limpiar_actu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar_actu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPFun2Layout.createSequentialGroup()
                        .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPFun2Layout.createSequentialGroup()
                                .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_numero_id_actu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txt_id_actu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txt_apellidos_actu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(JCombox_Funcionarios_Actu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPFun2Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_telefono_actu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPFun2Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCombox_Estado_Civil_Actu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74)
                        .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPFun2Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCombox_Id_Sexo_Actu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPFun2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nombres_actu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPFun2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCombox_Tipo_Id_Actu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPFun2Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_direccion_actu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPFun2Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDateChooser_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPFun2Layout.setVerticalGroup(
            jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFun2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(JCombox_Funcionarios_Actu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFun2Layout.createSequentialGroup()
                        .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_id_actu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(JCombox_Tipo_Id_Actu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txt_nombres_actu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txt_numero_id_actu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_apellidos_actu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)
                                .addComponent(txt_direccion_actu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFun2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txt_telefono_actu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPFun2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(JDateChooser_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFun2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(JCombox_Estado_Civil_Actu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCombox_Id_Sexo_Actu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar_actu)
                    .addComponent(btn_limpiar_actu))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTPanels.addTab("Actualizar Funcionario", jPFun2);

        getContentPane().add(jTPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 940, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_funcionario_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_funcionario_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_funcionario_regActionPerformed

    private void txt_numero_id_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numero_id_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numero_id_regActionPerformed

    private void txt_nombres_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombres_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombres_regActionPerformed

    private void txt_apellidos_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidos_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidos_regActionPerformed

    private void txt_direccion_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccion_regActionPerformed

    private void txt_telefono_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_regActionPerformed

    private void btn_guardar_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_regActionPerformed

        long funcionario_id = Long.parseLong(txt_id_funcionario_reg.getText());
        long tipo_id = Long.parseLong(txt_id_funcionario_reg.getText());
        long numero_id = Long.parseLong(txt_numero_id_reg.getText());
        String nombres = txt_nombres_reg.getText();
        String fechaNacimiento = jDateChooser_reg.toString();

        Funcionario funcionario = new Funcionario();
        funcionario.setId_funcionario(funcionario_id);
        funcionario.setTipo_id(tipo_id);
        funcionario.setNumero_id(numero_id);
        funcionario.setNombres(nombres);
        funcionario.setApellidos(txt_apellidos_reg.getText());
        funcionario.setDireccion(txt_direccion_reg.getText());
        funcionario.setTelefono(txt_telefono_reg.getText());
        funcionario.setFecha_nacimiento(LocalDate.parse(fechaNacimiento));
        funcionario.setId_estado_civil(JCombox_Id_Estado_Civil_reg.getSelectedIndex() + 1);
        funcionario.setId_sexo(JCombox_Id_sexo_reg.getSelectedIndex() + 1);

        try {
            funcionarioController.createFuncionario(funcionario);
            listarFuncionarios();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_guardar_regActionPerformed

    private void btn_limpiar_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar_regActionPerformed
        txt_id_funcionario_reg.setText("");
        txt_nombres_reg.setText("");
        txt_numero_id_reg.setText("");
        txt_apellidos_reg.setText("");
        txt_direccion_reg.setText("");
        txt_telefono_reg.setText("");
    }//GEN-LAST:event_btn_limpiar_regActionPerformed

    private void txt_id_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_actuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_actuActionPerformed

    private void txt_numero_id_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numero_id_actuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numero_id_actuActionPerformed

    private void txt_nombres_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombres_actuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombres_actuActionPerformed

    private void txt_apellidos_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidos_actuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidos_actuActionPerformed

    private void txt_direccion_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion_actuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccion_actuActionPerformed

    private void txt_telefono_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_actuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_actuActionPerformed

    private void btn_limpiar_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar_actuActionPerformed
        txt_id_actu.setText("");
        txt_nombres_actu.setText("");
        txt_numero_id_actu.setText("");
        txt_apellidos_actu.setText("");
        txt_direccion_actu.setText("");
        txt_telefono_actu.setText("");
    }//GEN-LAST:event_btn_limpiar_actuActionPerformed

    private void btn_guardar_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_actuActionPerformed
        String[] datos = JCombox_Funcionarios_Actu.getSelectedItem().toString().split(" ");
        long funcionario_id = Long.parseLong(datos[0]);
        long tipo_id = Long.parseLong(txt_id_actu.getText());
        long numero_id = Long.parseLong(txt_id_actu.getText());
        String nombres = txt_nombres_actu.getText();
        String fechaNacimiento = JDateChooser_Nacimiento.toString();

        Funcionario funcionario = new Funcionario();
        funcionario.setId_funcionario(funcionario_id);
        funcionario.setTipo_id(tipo_id);
        funcionario.setNumero_id(numero_id);
        funcionario.setNombres(nombres);
        funcionario.setApellidos(txt_apellidos_actu.getText());
        funcionario.setDireccion(txt_direccion_actu.getText());
        funcionario.setTelefono(txt_telefono_actu.getText());
        funcionario.setFecha_nacimiento(LocalDate.parse(fechaNacimiento));
        funcionario.setId_estado_civil(JCombox_Estado_Civil_Actu.getSelectedIndex() + 1);
        funcionario.setId_sexo(JCombox_Id_Sexo_Actu.getSelectedIndex() + 1);

        try {
            funcionarioController.updateFuncionario(funcionario_id, funcionario);
            listarFuncionarios();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_guardar_actuActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        String[] datos = JCombox_Funcionarios_Eli.getSelectedItem().toString().split(" ");
        long id = Long.parseLong(datos[0]);
        try {
            funcionarioController.deleteFuncionario(id);
            listarFuncionarios();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        long id = Long.parseLong(txt_id_bus.getText());
        try {
            Funcionario funcionario = funcionarioController.getFuncionarioById(id);
            if (funcionario != null) {
                defaultTableModel = new DefaultTableModel();
                defaultTableModel.setColumnIdentifiers(COLUMNS);

                defaultTableModel.addRow(new String[]{funcionario.getId_funcionario() + "", funcionario.getTipo_id() + "",
                    funcionario.getNumero_id() + "", funcionario.getNombres(),
                    funcionario.getApellidos(),
                    funcionario.getDireccion(),
                    funcionario.getTelefono(),
                    funcionario.getFecha_nacimiento().toString(),
                    funcionario.getId_estado_civil() + "",
                    funcionario.getId_sexo() + ""});
                JTable_Funcionarios.setModel(defaultTableModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btn_buscarActionPerformed

    public static void main(String args[]) {
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
    private javax.swing.JComboBox<String> JCombox_Estado_Civil_Actu;
    private javax.swing.JComboBox<Funcionario> JCombox_Funcionarios_Actu;
    private javax.swing.JComboBox<Funcionario> JCombox_Funcionarios_Eli;
    private javax.swing.JComboBox<String> JCombox_Id_Estado_Civil_reg;
    private javax.swing.JComboBox<String> JCombox_Id_Sexo_Actu;
    private javax.swing.JComboBox<String> JCombox_Id_sexo_reg;
    private javax.swing.JComboBox<String> JCombox_Tipo_Id_Actu;
    private javax.swing.JComboBox<String> JCombox_Tipo_Id_reg;
    private com.toedter.calendar.JDateChooser JDateChooser_Nacimiento;
    private javax.swing.JTable JTable_Funcionarios;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar_actu;
    private javax.swing.JButton btn_guardar_reg;
    private javax.swing.JButton btn_limpiar_actu;
    private javax.swing.JButton btn_limpiar_reg;
    private com.toedter.calendar.JDateChooser jDateChooser_reg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPFun1;
    private javax.swing.JPanel jPFun2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTPanels;
    private javax.swing.JTextField txt_apellidos_actu;
    private javax.swing.JTextField txt_apellidos_reg;
    private javax.swing.JTextField txt_direccion_actu;
    private javax.swing.JTextField txt_direccion_reg;
    private javax.swing.JTextField txt_id_actu;
    private javax.swing.JTextField txt_id_bus;
    private javax.swing.JTextField txt_id_funcionario_reg;
    private javax.swing.JTextField txt_nombres_actu;
    private javax.swing.JTextField txt_nombres_reg;
    private javax.swing.JTextField txt_numero_id_actu;
    private javax.swing.JTextField txt_numero_id_reg;
    private javax.swing.JTextField txt_telefono_actu;
    private javax.swing.JTextField txt_telefono_reg;
    // End of variables declaration//GEN-END:variables
}
