package Backend10;

import java.util.Scanner;

public class SegundoPunto {
    public static void main(String[] args) {


        Scanner dato = new Scanner(System.in);

        System.out.print("Digite su nombre: ");
        String nombre = dato.nextLine();

        System.out.print("Digite su correo electrónico: ");
        String correo = dato.nextLine();

        System.out.print("Digite su contraseña: ");
        String contrasena = dato.nextLine();

        System.out.println("\nDatos registrados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("Contraseña: " + contrasena);
    }
}
