package Paradigmas_Funcionais;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 23;
        UnaryOperator<Integer> retornaDobro = (v) -> {
            return v * 2;
        };
        System.out.println(retornaDobro.apply(Integer.valueOf(valor)));
        System.out.println(valor);
    }
}
