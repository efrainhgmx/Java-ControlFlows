import java.util.Scanner;

public class MinimoValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar: ");
        int cantidad = scanner.nextInt();

         if (cantidad < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {
            int menorNumero = Integer.MAX_VALUE;
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                menorNumero = (numero < menorNumero) ? numero : menorNumero;
            }

            System.out.println("El número menor es: " + menorNumero);

            if (menorNumero < 10) {
                System.out.println("El número " + menorNumero + " es menor que 10!");
            } else {
                System.out.println("El número " + menorNumero + " es igual o mayor que 10!");
            }
        }
    }
}
