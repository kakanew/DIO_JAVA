package Collections_IV_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExemploHashMap {
    private static String key;

    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        // Add os campeoes mundiais fifa no
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);
        System.out.println(campeoesMundialFifa);

        // Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        // Retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        // Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        // Remove o campeão França
        campeoesMundialFifa.remove("França");

        // Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        // Retorna se existe ou não aguma seleção hexa campeã
        System.out.println(campeoesMundialFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());
        System.out.println(campeoesMundialFifa);

        // Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Iterator<Map.Entry<String, Integer>> iterator = campeoesMundialFifa.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " >> " + entry.getValue());
        }

        // Verifica se o mapa contem a cave Estados Unidos
        System.out.println(campeoesMundialFifa.containsValue("Estados Unidos"));

        // Verifica se o mapa contem o valor 5
        System.out.println(campeoesMundialFifa.containsKey(5));

        // Verifica o tamanho e depois de limpar o mapa
        System.out.println(campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.size());

    }
}
