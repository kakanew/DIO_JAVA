package Paradigmas_Funcionais.Lambda.Sintaxe;

public class Lambda2 {
    public static void main(String[] args) {
        Funcao2 funcao2 = (valor) -> {
            System.out.println(valor);
            System.out.println(valor);
        };
        funcao2.gerar("Cássia");
    }
}
