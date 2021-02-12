package Paradigmas_Funcionais.Lambda.Sintaxe;

public class Lambda1 {
    public static void main(String[] args) {
        Funcao1 funcao1 = (valor) -> {
            System.out.println(valor);
        };
        funcao1.gerar("Cássia");
    }
}