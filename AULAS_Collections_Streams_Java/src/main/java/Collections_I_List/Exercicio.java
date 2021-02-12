package Collections_I_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<String> nomes1 = new ArrayList<>();

        // Add 5 nomes
        nomes1.add("Juliana");
        nomes1.add("Pedro");
        nomes1.add("Carlos");
        nomes1.add("Larissa");
        nomes1.add("João");

        // Navegue pela lista
        for (String nomes: nomes1) {
            System.out.println("-->" + nomes);
        }

        // Substituir Carlos por Roberto
        nomes1.set(2, "Roberto");
        System.out.println(nomes1);

        // Retornar o nome da posicao 1
        System.out.println(nomes1.get(1));

        // Remover o nome da posicao 4
        nomes1.remove(4);
        System.out.println(nomes1);

        // Remover o nome João
        nomes1.remove("João");

        // Retornar a quantidade de itens na lista
        int quant = nomes1.size();
        System.out.println(quant);

        // Verique se o nome Juliano existe na lista
        boolean temJuliano = nomes1.contains("Juliano");
        System.out.println(temJuliano);

        // Criar uma nova lista e add todos os itens nessa lista
        List<String> nomes2 = new ArrayList<>();

        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        nomes2.addAll(nomes1);
        System.out.println(nomes2);

        for (String nomes: nomes2) {
            System.out.println("---->" + nomes);
        }

        // Ordene os itens da lista por ordem alfabetica
        Collections.sort(nomes2);
        System.out.println(nomes2);

        // Verifique se a lista está vazia
        boolean listaEstaVazia = nomes2.isEmpty();
        System.out.println(listaEstaVazia);
    }
}
