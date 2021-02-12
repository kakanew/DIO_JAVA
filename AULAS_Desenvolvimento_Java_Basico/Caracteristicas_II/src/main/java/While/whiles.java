package While;

public class whiles {
    public static void main(String[] args) {
        int x = 0;

        //Testa a condição antes
        while (x < 1) {
            System.out.println("Dentro do while...");
            x++;
        }

        int y = 0;

        //Testa a condição depois
        do {
            System.out.println("Dentro do do/while...");
        } while (y++ < 1);
    }

}
