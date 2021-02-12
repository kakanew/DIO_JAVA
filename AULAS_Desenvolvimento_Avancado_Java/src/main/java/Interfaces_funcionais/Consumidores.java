package Interfaces_funcionais;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        // Method Reference
        // apenas utilizar o parametro da forma que ele foi recebido

        Consumer<String> ImprimirUmaFrase = System.out::println;
        ImprimirUmaFrase.accept("Hello Kassy!!");

//        Consumer<String> ImprimirUmaFrase = frase -> System.out.println(frase);
//        ImprimirUmaFrase.accept("Hello Kassy!!");
    }
}
