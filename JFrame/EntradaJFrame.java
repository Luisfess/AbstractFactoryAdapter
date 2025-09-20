package JFrame;

import javax.swing.JOptionPane;

import Abstractas.Entrada;

public class EntradaJFrame extends Entrada {
    
    @Override
    public void recibirDatos(String datos) {
        JOptionPane.showMessageDialog(null, "Entrada por JFrame: " + datos);
    }
    
}
