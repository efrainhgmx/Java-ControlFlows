public class EtiquetasDos {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragaban trigo trigotrigo en un trigal";
        String palabra = "trigo";

        int cantidad  = 0;
        char letra = 't';

        bucle1:
        for(int i = 0; i < frase.length(); i++) {
            int k = i;
            for (int j = 0; j < palabra.length(); j++) {
                if(frase.charAt(k++) != palabra.charAt(j)) {
                    continue bucle1;
                }
            }
            cantidad++;
        }

        System.out.println("Encontrado la palabra: " + palabra + " una cantidad de: " + cantidad);
    }
}
