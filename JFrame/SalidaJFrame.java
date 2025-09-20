package JFrame;
import javax.swing.JOptionPane;

import Abstractas.Salida;

public class SalidaJFrame extends Salida {
    
    @Override
    public String sacarDatos() {
        return JOptionPane.showInputDialog("Ingrese datos para salida por JFrame:");
    }
    
}
