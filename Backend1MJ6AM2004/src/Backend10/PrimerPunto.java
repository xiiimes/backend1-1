package Backend10;
import java.util.Scanner;
public class PrimerPunto {
    public static void main(String[] args) {

        final int DIAS = 5;
        int[] pasos = new int[DIAS];
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int totalPasos = 0;


        while (i < DIAS) {
            System.out.print("Ingrese la cantidad de pasos para el día " + (i + 1) + ": ");

            if (scanner.hasNextInt()) {
                pasos[i] = scanner.nextInt();
                totalPasos += pasos[i];
                i++;
            } else {
                System.out.println("Entrada no válida. Por favor ingrese un número entero.");

                scanner.next();
            }
        }


        double promedioPasos = (double) totalPasos / DIAS;


        System.out.println("\nCantidad de pasos dados cada día:");
        for (i = 0; i < DIAS; i++) {
            System.out.println("Día " + (i + 1) + ": " + pasos[i] + " pasos");
        }


        System.out.printf("\nEl promedio de pasos durante los %d días es: %.2f pasos%n", DIAS, promedioPasos);


        scanner.close();
    }
}
