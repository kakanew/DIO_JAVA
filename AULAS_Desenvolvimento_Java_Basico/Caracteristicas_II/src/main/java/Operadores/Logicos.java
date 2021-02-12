package Operadores;

public class Logicos {
    public static void main(String[] args) {
        final int numero = 2;
        final String letra = "A";

        //Sort Circuit
        if (numero < 5 && letra.equals("A")) {
            System.out.println("Atendeu a condição");
        }

        if (numero < 5 || letra.equals("A")) {
            System.out.println("Atendeu a outracondição");
        }

        if ((10 - 5) > 1 && (5 - 3) > 1) {
            System.out.println("Lógica maluca...");
        }

        //Non Sort Circuit
    if (verifica(8) & verifica("A")) {
        System.out.println("OK");
    } else {
        System.out.println("Não OK");
    }

    }

    private static boolean verifica(String letra) {
        System.out.println("Verificando letra...");
        return letra.equals("A");
    }

    private static boolean verifica(Integer numero) {
        System.out.println("verificando numero...");
        return numero > 10;
    }
}
