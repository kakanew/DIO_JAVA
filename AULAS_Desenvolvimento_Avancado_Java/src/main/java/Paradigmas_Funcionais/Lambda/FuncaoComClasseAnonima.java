package Paradigmas_Funcionais.Lambda;

public class FuncaoComClasseAnonima {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenorNasStrings = new Funcao() {
            @Override
            public String gerar(String valor) { return "Sra. " + valor; }
        };
        System.out.println(colocarPrefixoSenorNasStrings.gerar("Cássia"));
    }
}
