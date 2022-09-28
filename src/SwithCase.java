public class SwithCase {
    public static void main(String[] args) {
        //Decide ejecutar un bloque u otro si coincide con un valor

        int num = 3;

        switch(num) {
            case 0:
                System.out.println("Valor cero");
                break;
            case 2:
                System.out.println("Valor dos");
                break;
            case 3:
                System.out.println("Es tres");
                break;
            default:
                break;

        }

        switch (num) {
            case 0 -> System.out.println("Valor cero");
            case 2 -> System.out.println("Valor dos");
            case 3 -> System.out.println("Es tres");
            default -> {
            }
        }
    }
}
