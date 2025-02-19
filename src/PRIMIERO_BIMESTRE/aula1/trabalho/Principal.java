package PRIMIERO_BIMESTRE.aula1.trabalho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Cliente> listaCliente = new ArrayList<>();
        Endereco end1;
        Cliente cli1 = null;
        Scanner scn = new Scanner(System.in);

        int laco = 1;
        while (laco < 4){

            System.out.println("------------------------------------");

            System.out.println("ENTRE COM O NOME");
            String nome = scn.nextLine();

            System.out.println("ENTRE COM O ANO DE NASCIMENTO");
            int ano = scn.nextInt();
            scn.nextLine();

            System.out.println("ENTRE COM O EMAIL");
            String email = scn.nextLine();

            System.out.println("ENTRE COM O CPF");
            String cpf = scn.nextLine();

            System.out.println("--ENDEREÇO--");

            System.out.println("ENTRE COM O NOME DA RUA");
            String rua = scn.nextLine();

            System.out.println("ENTRE COM O BAIRRO");
            String bairro = scn.nextLine();

            System.out.println("ENTRE COM O NUMERO");
            int num = scn.nextInt();
            scn.nextLine();

            end1 = new Endereco(rua, bairro, num);
            cli1 = new Cliente(cpf, ano, email, nome, end1);

            listaCliente.add(cli1);

            laco++;
        }

        System.out.println(".......... LISTA DE CLIENTES ................");
        for  (int i = 0; i < listaCliente.size(); i++){
            cli1 = listaCliente.get(i);
            System.out.println(cli1.toString());
        }

    }
}
