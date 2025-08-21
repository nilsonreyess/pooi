package view;

public class FrmMain extends javax.swing.JFrame {

    public FrmMain() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDistribuidor = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblMedicamento = new javax.swing.JLabel();
        txtMedicamento = new javax.swing.JTextField();
        lblTipoMedicamento = new javax.swing.JLabel();
        cmbTipoMedicamento = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        lblDistribuidor = new javax.swing.JLabel();
        rdbCofarma = new javax.swing.JRadioButton();
        rdbEmpsephar = new javax.swing.JRadioButton();
        rdbCemefar = new javax.swing.JRadioButton();
        lblDespachar = new javax.swing.JLabel();
        chkPrincipal = new javax.swing.JCheckBox();
        chkSucursal = new javax.swing.JCheckBox();
        btnBorrar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        lblErrMedicamento = new javax.swing.JLabel();
        lblErrTipoMedicamento = new javax.swing.JLabel();
        lblErrCantidad = new javax.swing.JLabel();
        lblErrDistribuidor = new javax.swing.JLabel();
        lblErrSucursal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedido de medicamentos");
        setBackground(new java.awt.Color(204, 204, 255));
        setName("frmIntro"); // NOI18N

        lblTitle.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Crear pedido");

        lblMedicamento.setLabelFor(txtMedicamento);
        lblMedicamento.setText("Medicamento: ");

        lblTipoMedicamento.setLabelFor(cmbTipoMedicamento);
        lblTipoMedicamento.setText("Tipo de medicamento: ");

        cmbTipoMedicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Analgésico", "Analéptico", "Anestésico", "Antiácido", "Antidepresivo", "Antibiótico" }));

        lblCantidad.setText("Cantidad: ");

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lblDistribuidor.setLabelFor(rdbCofarma);
        lblDistribuidor.setText("Distribuidor: ");

        btgDistribuidor.add(rdbCofarma);
        rdbCofarma.setText("Cofarma");
        rdbCofarma.setActionCommand("Cofarma");

        btgDistribuidor.add(rdbEmpsephar);
        rdbEmpsephar.setText("Empsephar");
        rdbEmpsephar.setActionCommand("Empsephar");

        btgDistribuidor.add(rdbCemefar);
        rdbCemefar.setText("Cemefar");
        rdbCemefar.setActionCommand("Cemefar");

        lblDespachar.setLabelFor(chkPrincipal);
        lblDespachar.setText("Despachar a: ");

        chkPrincipal.setText("Principal");

        chkSucursal.setText("Sucursal");

        btnBorrar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnBorrar.setText("Borrar");

        btnConfirmar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnConfirmar.setText("Confirmar");

        lblErrMedicamento.setFont(new java.awt.Font("Liberation Sans", 1, 10)); // NOI18N
        lblErrMedicamento.setForeground(new java.awt.Color(255, 0, 0));
        lblErrMedicamento.setText("Digite un medicamento");

        lblErrTipoMedicamento.setFont(new java.awt.Font("Liberation Sans", 1, 10)); // NOI18N
        lblErrTipoMedicamento.setForeground(new java.awt.Color(255, 0, 0));
        lblErrTipoMedicamento.setText("Seleccione un tipo");

        lblErrCantidad.setFont(new java.awt.Font("Liberation Sans", 1, 10)); // NOI18N
        lblErrCantidad.setForeground(new java.awt.Color(255, 0, 0));
        lblErrCantidad.setText("Digite un valor numerico");

        lblErrDistribuidor.setFont(new java.awt.Font("Liberation Sans", 1, 10)); // NOI18N
        lblErrDistribuidor.setForeground(new java.awt.Color(255, 0, 0));
        lblErrDistribuidor.setText("Seleccione un distribuidor");

        lblErrSucursal.setFont(new java.awt.Font("Liberation Sans", 1, 10)); // NOI18N
        lblErrSucursal.setForeground(new java.awt.Color(255, 0, 0));
        lblErrSucursal.setText("Seleccione una sucursal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedicamento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipoMedicamento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDistribuidor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDespachar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrMedicamento)
                    .addComponent(cmbTipoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrTipoMedicamento)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrCantidad)
                    .addComponent(rdbCofarma)
                    .addComponent(rdbEmpsephar)
                    .addComponent(rdbCemefar)
                    .addComponent(lblErrDistribuidor)
                    .addComponent(chkPrincipal)
                    .addComponent(chkSucursal)
                    .addComponent(lblErrSucursal))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnBorrar)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedicamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrMedicamento)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoMedicamento)
                    .addComponent(cmbTipoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrTipoMedicamento)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(lblErrCantidad)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDistribuidor)
                    .addComponent(rdbCofarma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbEmpsephar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbCemefar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrDistribuidor)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblDespachar))
                    .addComponent(chkPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar)
                    .addComponent(btnBorrar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup btgDistribuidor;
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnConfirmar;
    public javax.swing.JCheckBox chkPrincipal;
    public javax.swing.JCheckBox chkSucursal;
    public javax.swing.JComboBox<String> cmbTipoMedicamento;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDespachar;
    private javax.swing.JLabel lblDistribuidor;
    public javax.swing.JLabel lblErrCantidad;
    public javax.swing.JLabel lblErrDistribuidor;
    public javax.swing.JLabel lblErrMedicamento;
    public javax.swing.JLabel lblErrSucursal;
    public javax.swing.JLabel lblErrTipoMedicamento;
    private javax.swing.JLabel lblMedicamento;
    private javax.swing.JLabel lblTipoMedicamento;
    private javax.swing.JLabel lblTitle;
    public javax.swing.JRadioButton rdbCemefar;
    public javax.swing.JRadioButton rdbCofarma;
    public javax.swing.JRadioButton rdbEmpsephar;
    public javax.swing.JSpinner spnCantidad;
    public javax.swing.JTextField txtMedicamento;
    // End of variables declaration//GEN-END:variables
}
