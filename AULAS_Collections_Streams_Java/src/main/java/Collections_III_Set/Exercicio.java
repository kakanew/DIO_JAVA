package Collections_III_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercicio {
    public static void main(String[] args) {
       TreeSet<Integer> serieNumeros = new TreeSet<>();

        // Add 5 números
        serieNumeros.add(3);
        serieNumeros.add(88);
        serieNumeros.add(20);
        serieNumeros.add(44);
        serieNumeros.add(3);
        System.out.println(serieNumeros);

        // Navegue no Set exibindo cada numero
        Iterator<Integer> iterator = serieNumeros.iterator();

        while (iterator.hasNext());{
           System.out.println(iterator.hasNext());
        }

        // Remova o primeiro item do Set
        System.out.println(serieNumeros.pollFirst());

        // Add novo numero: 23
        serieNumeros.add(23);
        System.out.println(serieNumeros);

        // Verique o tamanho do set
        System.out.println(serieNumeros.size());

        // Verique se o Set está vazio
        System.out.println(serieNumeros.isEmpty());
    }
}
