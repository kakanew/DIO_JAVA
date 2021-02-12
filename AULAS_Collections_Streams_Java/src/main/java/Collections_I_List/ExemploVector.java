package Collections_I_List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Add 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de Mesa");
        esportes.add("Handebol");

        System.out.println(esportes);

        // Altera o valor da posicao 2 do vetor
        esportes.set(2, "Ping Pong");

        // Remove o esporte na posicao 2
        esportes.remove(2);

        System.out.println(esportes);

        // Remove o esporte Handbol do vetor
        esportes.remove("Handebol");

        // Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        // Navega nos esportes
        for (String esporte: esportes) {
            System.out.println(esporte);
        }

    }
}
