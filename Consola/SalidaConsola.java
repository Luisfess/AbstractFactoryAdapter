package Consola;
import java.util.Scanner;

import Abstractas.Salida;

public class SalidaConsola extends Salida {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String sacarDatos() {
        System.out.println("Ingrese datos por consola:");
        return scanner.nextLine();
    }
    
}
