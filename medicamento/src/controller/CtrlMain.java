
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ClsPedido;
import view.FrmMain;
import view.FrmReport;

public final class CtrlMain implements ActionListener {
    // Attribute
    FrmMain frmMain = new FrmMain();
    
     // Construct
    public CtrlMain(FrmMain frm) {
        this.frmMain = frm;
        this.frmMain.btnConfirmar.addActionListener(this);
        this.frmMain.btnBorrar.addActionListener(this);
        hideMessages();
    }
    
     // Main Method
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmMain.btnConfirmar) {
            // Validate
            if (validate()) {
                // Confirm
                // Crea clase pedido y asigna datos
                ClsPedido p = new ClsPedido();
                p.setMedicamento(this.frmMain.txtMedicamento.getText());
                p.setTipoMedicamento(this.frmMain.cmbTipoMedicamento.getSelectedItem().toString());
                p.setCantidad(Integer.parseInt(this.frmMain.spnCantidad.getValue().toString()));
                p.setDistribuidor(this.frmMain.btgDistribuidor.getSelection().getActionCommand());
                if (this.frmMain.chkPrincipal.isSelected()) {
                    p.setDespachar(this.frmMain.chkPrincipal.getText());
                }
                if (this.frmMain.chkSucursal.isSelected()) {
                    p.setDespachar(this.frmMain.chkSucursal.getText());
                }
                // Crea formulario de reporte
                FrmReport frmReport = new FrmReport();
                CtrlReport ctrlReport = new CtrlReport(frmReport, p);
                frmReport.setVisible(true);
                frmReport.setLocationRelativeTo(frmMain);
                clear();
            }
        }
        if (e.getSource() == frmMain.btnBorrar) {
            clear();
        }
    }
    
    // Personalized Method
    public void clear() {
        this.frmMain.txtMedicamento.setText("");
        this.frmMain.cmbTipoMedicamento.setSelectedIndex(0);
        this.frmMain.spnCantidad.setValue(0);
        this.frmMain.btgDistribuidor.clearSelection();
        this.frmMain.chkPrincipal.setSelected(false);
        this.frmMain.chkSucursal.setSelected(false);
        this.frmMain.txtMedicamento.requestFocus();
        hideMessages();
    }
    
    public void hideMessages() {
        this.frmMain.lblErrMedicamento.setVisible(false);
        this.frmMain.lblErrTipoMedicamento.setVisible(false);
        this.frmMain.lblErrCantidad.setVisible(false);
        this.frmMain.lblErrDistribuidor.setVisible(false);
        this.frmMain.lblErrSucursal.setVisible(false);
    }
    
    public boolean validate() {
        // Medicamento
        if (this.frmMain.txtMedicamento.getText().isEmpty()) {
            hideMessages();
            this.frmMain.lblErrMedicamento.setVisible(true);
            this.frmMain.txtMedicamento.requestFocus();
            return false;
        }
        // Tipo de medicamento
        if (this.frmMain.cmbTipoMedicamento.getSelectedIndex() == 0) {
            hideMessages();
            this.frmMain.lblErrTipoMedicamento.setVisible(true);
            this.frmMain.cmbTipoMedicamento.requestFocus();
            return false;
        }
        // Cantidad
        int cantidad = (Integer)this.frmMain.spnCantidad.getValue();
        if (cantidad <= 0) {
            hideMessages();
            this.frmMain.lblErrCantidad.setVisible(true);
            this.frmMain.spnCantidad.requestFocus();
            return false;
        }
        // Grupo de botones del distribuidor
        if (this.frmMain.btgDistribuidor.getSelection() == null) {
            hideMessages();
            this.frmMain.lblErrDistribuidor.setVisible(true);
            this.frmMain.rdbCofarma.requestFocus();
            return false;
        }
        // Sucursales
        if (!this.frmMain.chkPrincipal.isSelected() && !this.frmMain.chkSucursal.isSelected()) {
            hideMessages();
            this.frmMain.lblErrSucursal.setVisible(true);
            this.frmMain.chkPrincipal.requestFocus();
            return false;
        }
        
        return true;
    }
}
