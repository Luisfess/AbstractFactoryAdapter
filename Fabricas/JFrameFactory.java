package Fabricas;
import JFrame.EntradaJFrame;
import JFrame.SalidaJFrame;
import Abstractas.Entrada;  
import Abstractas.Salida;

public class JFrameFactory implements IOFactory {
    @Override
    public Entrada crearEntrada() {
        return new EntradaJFrame();
    }

    @Override
    public Salida crearSalida() {
        return new SalidaJFrame();
    }
    
}