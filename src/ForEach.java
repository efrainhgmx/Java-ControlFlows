public class ForEach {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };
        String[] nombres = {"Andres", "Pepe", "Karla", "Paco"};

        //ForEach
        for (int num : numeros) {
            System.out.println(num);
        }

        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
    }
}
