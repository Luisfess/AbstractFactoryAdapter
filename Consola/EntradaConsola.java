package Consola;
import Abstractas.Entrada;

public class EntradaConsola extends Entrada {
    
    @Override
    public void recibirDatos(String datos) {
        System.out.println("Entrada por consola: " + datos);
    }
    
}
