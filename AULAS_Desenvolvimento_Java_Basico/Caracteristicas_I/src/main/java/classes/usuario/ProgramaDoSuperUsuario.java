package classes.usuario;

public class ProgramaDoSuperUsuario {

    public static void main(String[] args) {
        final SuperUsuario superUsuario;
        superUsuario = new SuperUsuario("root", "1234%$#@");


        superUsuario.getLogin();

        superUsuario.getSenha();

        String root = superUsuario.nome;

    }

}