package Paradigmas_Funcionais;

import java.util.function.UnaryOperator;

public class Paradigma_Funcional {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor * 3;
        int valor = 10;
        System.out.println("O resultado é :: " + calcularValorVezes3.apply(10));
    }
}