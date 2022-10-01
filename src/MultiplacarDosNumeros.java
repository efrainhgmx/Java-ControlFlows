import java.util.Scanner;

public class MultiplacarDosNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el primer numero: ");
        int a = scanner.nextInt();


        System.out.println("Dame el segundo numero: ");
        int b = scanner.nextInt();

        boolean positivoA = a > -1;
        boolean positivoB = b > -1;

        int multplicacion = 0;

        if(positivoA && positivoB) {
            multplicacion = a;
            for (int i = 1; i < b ; i++) {
                multplicacion += a;
            }
        } else if(!positivoA && positivoB) {
            multplicacion = b;
            for (int i = 1 ; i < -a; i++){
                multplicacion += b;
            }
            multplicacion = (-multplicacion);
        } else if(!positivoB && positivoA) {
            multplicacion = a;
            for (int i = 1; i < -b; i++) {
                multplicacion += a;
            }

            multplicacion = (-multplicacion);
        } else if (!positivoA && !positivoB) {
            int positiveValueA = -a;
            int positiveValueB = -b;

            multplicacion = positiveValueA;

            for (int i = 1; i < positiveValueB; i++) {
                multplicacion += positiveValueA;
            }
        }
        System.out.println(multplicacion);
    }
}
