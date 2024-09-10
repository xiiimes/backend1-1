package Backend10;
import java.util.Scanner;
public class TercerPunto {
    static String registrarCorreo;
     static String registrarContrasena;


    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarUsuario(scanner);
                    break;
                case 2:
                    iniciarSesion(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);


    }

    static void registrarUsuario(Scanner scanner) {
        System.out.println("Proceso de registro:");

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su correo electrónico: ");
        registrarCorreo = scanner.nextLine();

        while (true) {
            System.out.print("Ingrese su contraseña (mínimo 6 caracteres): ");
            registrarContrasena = scanner.nextLine();
            if (registrarContrasena.length() >= 6) {
                break;
            } else {
                System.out.println("La contraseña debe tener al menos 6 caracteres. Inténtalo de nuevo.");
            }
        }

        System.out.println("Registro exitoso. Puede iniciar sesión ahora.");
    }

     static void iniciarSesion(Scanner scanner) {
        System.out.println("Proceso de inicio de sesión:");

        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (correo.equals(registrarCorreo) && contrasena.equals(registrarContrasena)) {
            System.out.println("Inicio de sesión exitoso. Bienvenido!");
        } else {
            System.out.println("Correo electrónico o contraseña incorrectos. Inténtalo de nuevo.");
        }
    }
}
