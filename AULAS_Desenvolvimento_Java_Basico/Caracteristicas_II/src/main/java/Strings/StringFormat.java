package Strings;

public class StringFormat {

    public static void main(String[] args) {

        String nome = "Cássia";
        String sobreNome = " Maciel Watakabe";
        final String nomeCompleto;
        nomeCompleto = nome + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " + nomeCompleto);
        final String mensagem = String.format("O cliente %s possui sobrenome %s ", nome, sobreNome);
        System.out.println(mensagem);

        System.out.println(String.format("Numero %.2f ", 1.2375d));
    }

}
