package metodos;

public class cadenas {

    public static int contarCaracter(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }
//------------------------------------------------------------------------------

    public static String revertirCadena(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado.append(cadena.charAt(i));
        }
        return resultado.toString();
    }
//------------------------------------------------------------------------------

    public static String trimPersonalizado(String cadena) {
        int inicio = 0;
        int fin = cadena.length() - 1;
        while (inicio <= fin && Character.isWhitespace(cadena.charAt(inicio))) {
            inicio++;
        }
        while (fin > inicio && Character.isWhitespace(cadena.charAt(fin))) {
            fin--;
        }
        return cadena.substring(inicio, fin + 1);
    }
//------------------------------------------------------------------------------

    public static char[] convertirCadenaACharArray(String cadena) {
        return cadena.toCharArray();
    }
//------------------------------------------------------------------------------

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int izquierda = 0;
        int derecha = cadena.length() - 1;
        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
//------------------------------------------------------------------------------

    public static byte contarVocales(String cadena) {

        byte contador = 0, i;
        cadena = cadena.toLowerCase();

        for (i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }
//------------------------------------------------------------------------------

    public static void verificarCadenaIncluida(String[] arr) {

        String cadena1 = arr[0];
        String cadena2 = arr[1];

        if (cadena1.contains(cadena2)) {
            System.out.println("\nLa segunda cadena esta incluida en la primera.");
        } else {
            System.out.println("\nLa segunda cadena no esta incluida en la primera.");
        }
    }

//------------------------------------------------------------------------------
    public static String eliminarVocales(String cadena) {

        StringBuilder sb = new StringBuilder();
        char caracter;

        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if ("aeiouAEIOU".indexOf(caracter) == -1) {
                sb.append(caracter);
            }
        }

        return sb.toString();
    }
}
