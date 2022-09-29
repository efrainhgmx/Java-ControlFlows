public class ArreglosFor {
    public static void main(String[] args) {
        String[] nombres = {"Andres", "Pepe", "Karla", "Paco"};

        for(int i = 0; i < nombres.length; i++) {
            if(nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepe")) {
                continue;
            }
            System.out.println("Nombre: " + nombres[i]);
        }
    }
}
