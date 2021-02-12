package Collections_V_Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));
        estudantes.add(new Estudante("Cássia", 42));
        System.out.println("--- ordem de inscrição ---");
        System.out.println(estudantes);
        System.out.println("------------------");

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("--- ordem natural dos numeros - idade ---");
        System.out.println(estudantes);
        System.out.println("------------------");

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("--- ordem reversa dos numeros - idade ---");
        System.out.println(estudantes);
        System.out.println("------------------");

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("--- ordem natural dos numeros - idade (method reference) ---");
        System.out.println(estudantes);
        System.out.println("------------------");

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("--- ordem reversa dos numeros - idade (method reference) ---");
        System.out.println(estudantes);
        System.out.println("------------------");

        Collections.sort(estudantes);
        System.out.println("--- ordem natural dos numeros - idade (interface Comparable) ---");
        System.out.println(estudantes);
        System.out.println("------------------");

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaCamparator());
        System.out.println("--- ordem reversa dos numeros - idade (interface Comparator) ---");
        System.out.println(estudantes);
        System.out.println("------------------");

    }
}
