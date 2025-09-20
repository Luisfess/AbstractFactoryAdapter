import Abstractas.Entrada;
import Abstractas.Salida;
import Fabricas.IOFactory;
import Fabricas.JFrameFactory;
import java.util.Scanner;
import Fabricas.ConsolaFactory;
import Adapter.EntradaAdapter;
import Adapter.EntradaIntAdapter;
import Adapter.SalidaAdapter;
import Adapter.SalidaIntAdapter;




public class Cliente {
    public static void main(String[] args) {
        IOFactory factory;
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Patrón Abstract Factory + Adapter ===");
        System.out.println("\n");
        System.out.println("Desea hacerlo por:");
        System.out.println("1. Consola");
        System.out.println("2. JFrame");
        int opcion = sc.nextInt();
        sc.nextLine();  // Consumir el salto de línea

        if (opcion == 1) {
            factory = new ConsolaFactory();
        } else {
            factory = new JFrameFactory();
        }

        System.out.println("Desea ingresar:");
        System.out.println("1. String");
        System.out.println("2. Entero");
        int tipoDato = sc.nextInt();
        sc.nextLine();

        Entrada entrada = factory.crearEntrada();
        Salida salida = factory.crearSalida();

        if (tipoDato == 1) {
            // flujo normal con String
            String datos = salida.sacarDatos();
            entrada.recibirDatos(datos);
        } else {
            // flujo con int usando Adapter
            EntradaAdapter entradaInt = new EntradaIntAdapter(entrada);
            SalidaAdapter salidaInt = new SalidaIntAdapter(salida);

            int datos = (int) salidaInt.sacar();
            entradaInt.recibir(datos);
        }

        sc.close();
    }
}