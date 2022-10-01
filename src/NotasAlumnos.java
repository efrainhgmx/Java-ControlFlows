import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);


        double[] notas = new double[20];
        double promedio = 0;
        double promedioNotasMenores = 0;
        double promedioNotasMayores = 0;

        int notasMayores = 0;
        int notasMenores = 0;
        int notasUno = 0;

        for(int i = 0; i < notas.length; i++) {
            System.out.println("Dame la nota " + (i + 1) + " :");
            notas[i] = scanner.nextDouble();
            promedio += notas[i];

            if (notas[i] > 5) {
                notasMayores++;
                promedioNotasMayores += notas[i];
            } else if (notas[i] < 4) {
                notasMenores++;
                promedioNotasMenores += notas[i];
                if (notas[i] == 1)
                    notasUno++;
            }
        }

        promedio /= notas.length;
        promedioNotasMayores /= notasMayores;
        promedioNotasMenores /= notasMenores;





        System.out.println("Todas las notas finales" + Arrays.toString(notas));
        System.out.println("Total de notas menores a 4: " + notasMenores);
        System.out.println("Total de notas mayores a 5: " + notasMayores);
        System.out.println("Total de notas iguales a 1: " + notasUno);

        System.out.println("Promedio total: " + promedio);
        System.out.println("Premedio calificaciones menores a 4: " + promedioNotasMenores);
        System.out.println("Promedio calificaciones mayores a 5: " + promedioNotasMayores);

    }
}
