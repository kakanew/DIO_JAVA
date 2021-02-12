package classes.pessoa;

import classes.cliente.Cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        final Cliente cliente = new Cliente(18);

        cliente.getIdade();

        cliente.getPeso();

        //System.out.println(cliente.relatorio()); //OK
    }

}