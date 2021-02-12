package Strings;

public class StringBuilder {

    public static void main(String[] args) {

        String nome = "Cassia";

        final java.lang.StringBuilder builder;
        builder = new java.lang.StringBuilder(nome);
        System.out.println(builder.append("Maciel"));

        final java.lang.StringBuilder reverse;
        reverse = builder.reverse();

        System.out.println(reverse);

        final java.lang.StringBuilder insert;
        insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(insert);

    }

}
