
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
                FrmReport frmReport = new FrmReport();
                frmReport.setVisible(true);
                frmReport.setLocationRelativeTo(frmMain);
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
            this.frmMain.lblErrMedicamento.setVisible(true);
            this.frmMain.txtMedicamento.requestFocus();
            return false;
        }
        if (this.frmMain.cmbTipoMedicamento.getSelectedIndex() == 0) {
            this.frmMain.lblErrTipoMedicamento.setVisible(true);
            this.frmMain.cmbTipoMedicamento.requestFocus();
            return false;
        }
        return true;
    }
}
