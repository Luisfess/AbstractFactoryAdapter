package Adapter;
import Abstractas.Salida;


public class SalidaIntAdapter implements SalidaAdapter {
    private Salida salida;

    public SalidaIntAdapter(Salida salida) {
        this.salida = salida;
    }

    public Object sacar() {
        String datos = salida.sacarDatos();
        return Integer.parseInt(datos); // Convertir String a Integer
    }

}