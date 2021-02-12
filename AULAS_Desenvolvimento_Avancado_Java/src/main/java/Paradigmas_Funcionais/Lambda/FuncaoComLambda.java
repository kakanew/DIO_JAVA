package Paradigmas_Funcionais.Lambda;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNasString = (valor) -> {
            return "Sra. " + valor;
        };
        System.out.println(colocarPrefixoSenhorNasString.gerar("Cássia"));
    }
}
