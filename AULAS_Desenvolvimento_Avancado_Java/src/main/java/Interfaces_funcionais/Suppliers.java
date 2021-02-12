package Interfaces_funcionais;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> supplier = () -> new Pessoa();
        System.out.println(supplier.get());
    }
}
class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "Cassia";
        idade = 23;
    }
    @Override
    public  String toString() {
        return String.format("nome: %s, idade: %d anos", nome, idade);
    }
}