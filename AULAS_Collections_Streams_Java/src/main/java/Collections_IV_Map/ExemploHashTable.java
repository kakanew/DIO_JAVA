package Collections_IV_Map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Maria", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);
        estudantes.put("Cássia", 42);
        System.out.println(estudantes);

        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        // Remove um estudante no indice 0
        estudantes.remove("Pedro");
        System.out.println(estudantes);

        // Mostra a quantidade de estudantes
        System.out.println(estudantes.size());

        // Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        for (String key : estudantes.keySet()) {
            System.out.println(key + " -- " + estudantes.get(key));
        }
    }
}
