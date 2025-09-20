package Adapter;
import Abstractas.Entrada;


public class EntradaIntAdapter implements EntradaAdapter {
    
    private Entrada entrada;

    public EntradaIntAdapter(Entrada entrada) {
        this.entrada = entrada;
    }

    public void recibir(Object datos) {
        if (datos instanceof Integer) {
            int valor = (Integer) datos;
            entrada.recibirDatos(String.valueOf(valor)); // int -> String
        } else {
            throw new IllegalArgumentException("Tipo de dato no soportado");
        }
    }

}