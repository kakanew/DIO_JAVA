package finals;

public class Programa {

    public static void main(String[] args) {
        final HardcoreGamer hardcoreGamer;
        hardcoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        final String game;
        game = "PUBG";

        //game = "WoW";

        System.out.println(casualGamer.play(game));
    }

}
