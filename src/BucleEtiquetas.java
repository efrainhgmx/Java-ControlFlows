public class BucleEtiquetas {
    public static void main(String[] args) {
        //Etiqueta para hacer referencia al for
        bucle1: for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if( i == 2) {
                continue bucle1;
            }
            System.out.println("j = " + j + "i: " + i);
        }
        }

        bucle2: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if( i == 2) {
                    break bucle2;
                }
                System.out.println("j = " + j + "i: " + i);
            }
        }
    }
}