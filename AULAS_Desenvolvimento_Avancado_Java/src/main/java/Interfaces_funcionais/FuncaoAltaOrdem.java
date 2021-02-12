package Interfaces_funcionais;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a, b) -> a + b;
        Calculo SUBTRACAO = (a, b) -> a - b;
        Calculo DIVISAO = (a, b) -> a / b;
        Calculo MULTIPLICACAO = (a, b) -> a * b;
        System.out.println(executarOperacao(SOMA, 1, 3)); // 4
        System.out.println(executarOperacao(SUBTRACAO, 4, 3)); // 1
        System.out.println(executarOperacao(DIVISAO, 4, 2)); // 2
        System.out.println(executarOperacao(MULTIPLICACAO, 7, 3)); // 21
    }
    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a,b);
    }
}
interface Calculo{
    public int calcular(int a, int b);
}
// Por parametro recebe outra funcao
// Ou que ela retorna umma funcao