package Fabricas;
import Abstractas.Entrada;
import Abstractas.Salida;

public interface IOFactory {
    Entrada crearEntrada();
    Salida crearSalida();
}
