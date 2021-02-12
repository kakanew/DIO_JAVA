package Collections_II_Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicios {
    public static void main(String[] args) {
        Queue<String> filaCaixa = new LinkedList<>();

        // Add 5 nomes
        filaCaixa.add("Juliana");
        filaCaixa.add("Pedro");
        filaCaixa.add("Carlos");
        filaCaixa.add("Larissa");
        filaCaixa.add("João");
        System.out.println(filaCaixa);

        // Navegar na fila exibindo cada nome

        Iterator<String> iteratorFilaCaixa = filaCaixa.iterator();

        while (iteratorFilaCaixa.hasNext()) {
            System.out.println(iteratorFilaCaixa.next());
        }

        // Retorne o primeiro item sem remove-lo

        String primeiroClienteContinua = filaCaixa.peek();
        System.out.println(primeiroClienteContinua);
        System.out.println(filaCaixa);

        // Retorne o primeiro item removendo-o

        String primeiroClienteSai = filaCaixa.poll();
        System.out.println(primeiroClienteSai);
        System.out.println(filaCaixa);

        // Adicionar Daniel na fia e verificar a posição dele

        filaCaixa.add("Daniel");
        System.out.println(filaCaixa);

        // Retorne o tamanho da lista

        System.out.println(filaCaixa.size());

        // Verifique se a lista está vazia

        System.out.println(filaCaixa.isEmpty());

        // Verifique se o Carlos está na lista

        boolean temCarlos = filaCaixa.contains("Carlos");
        System.out.println(temCarlos);
    }
}
