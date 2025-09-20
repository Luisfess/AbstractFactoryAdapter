package Fabricas;
import Consola.EntradaConsola;
import Consola.SalidaConsola;
import Abstractas.Entrada;
import Abstractas.Salida;

public class ConsolaFactory implements IOFactory {
    @Override
    public Entrada crearEntrada() {
        return new EntradaConsola();
    }

    @Override
    public Salida crearSalida() {
        return new SalidaConsola();
    }
    
}
