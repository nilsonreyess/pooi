
package medicamento;

import controller.CtrlMain;
import view.FrmMain;

public class Medicamento {

    public static void main(String[] args) {
        FrmMain frmMain = new FrmMain();
        CtrlMain ctrlMain = new CtrlMain(frmMain);
        
        frmMain.setVisible(true);
        frmMain.setLocationRelativeTo(null);
    }
    
}
