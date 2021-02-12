package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {

        // Cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        //Add 7 estudantes para a coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contagem de elementos do Stream
        System.out.println("Contagem: " + estudantes.stream().count());

        // Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparing(String::length)));

        // Retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparing(String::length)));

        // Retorna elementos que tem uma letra R no nome
        System.out.println("Com a letra r no nome: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornar a mesma coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Tem algum elemento com W no nome? " + estudantes.stream().allMatch((elemento) ->
                elemento.contains("W")));

        // Retorna true se algumelemento possue a letra a minuscula no nome
        System.out.println("Tem algum elemento com a minuscula no nome? " + estudantes.stream().anyMatch((elememto) ->
                elememto.contains("a")));
        // Retorna o primeiro elemento da coleção se existir exibir no consiole
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
                    .peek(System.out::println)
                    .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                    .peek(System.out::println)
                    .filter((estudante) -> estudante.toLowerCase().contains("r"))
                    .collect(Collectors.toList()));
//                    .collect(Collectors.joining(", ")));
//                    .collect(Collectors.toSet()));
//                    .collect(Collectors.groupingBy(estudante) -> estudante.substring(estudantes.indexOf("-") + 1))));


    }
}
