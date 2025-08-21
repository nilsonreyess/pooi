
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.ClsPedido;
import view.FrmReport;

public final class CtrlReport implements ActionListener {
    // Attribute
    FrmReport f = new FrmReport();
    ClsPedido p = new ClsPedido();
    
    // Construct
    public CtrlReport(FrmReport frmPedido, ClsPedido pedido) {
        this.f = frmPedido;
        this.p = pedido;
        this.f.setTitle("Pedido al distribuidor " + p.getDistribuidor());
        this.f.btnCancelar.addActionListener(this);
        this.f.btnEnviar.addActionListener(this);
        print();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.f.btnEnviar) {
            JOptionPane.showMessageDialog(this.f, "Pedido enviado.");
            this.f.dispose();
        }
        if (e.getSource() == this.f.btnCancelar) {
            this.f.dispose();
        }
    }
    
    public void print() {
        this.f.lblPedido.setText(this.p.getCantidad() + " unidades del " + this.p.getTipoMedicamento() + " " + this.p.getMedicamento());
        this.f.lblDespachar.setText(this.p.getDespachar());
    }
    
}
