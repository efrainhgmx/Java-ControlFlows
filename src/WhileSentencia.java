public class WhileSentencia {
    public static void main(String[] args) {
        int count = 0;

        while (count < 5) {
            System.out.println("Valor count = " + count);
            count++;
        }

        System.out.println("count = " + count);

        boolean prueba = true;

        while (prueba){
            System.out.println("Esto nunca se ejecuta");
            prueba = false;
        }

        do {
            System.out.println("Se ejecuta por lo menos una vez");
        }while (prueba);
    }
}
