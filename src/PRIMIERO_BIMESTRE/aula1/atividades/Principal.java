package PRIMIERO_BIMESTRE.aula1.atividades;

public class Principal {
    public static void main(String[] args) {

    Cliente cli1 = new Cliente();
    Conta conta1 = new Conta();


    cli1.setCpf("04236317214");
    cli1.setAnoNascimento("09/06/2002");
    cli1.setNome("Mari Mar");
    cli1.setEmail("conta@gmail.com");
    conta1.setNumero("01215512-1");
    conta1.setSaldo(750.63);

    Cliente cli2 = new Cliente("19/05/1999", "Robert Patterson", "robertin@gmail.com", "01224485774");
    Conta conta2 = new Conta("32132132", 985.50);


    System.out.println("-------CLIENTE E CONTA 1-----------");
    cli1.mostrarCliente();
    conta1.mostrarConta();

    System.out.println("---------CLIENTE conta 2 (exibiççai usando o toString para a conts2----------");
    System.out.println(cli2.toString());
    System.out.println(conta2.toString());
    System.out.println("---------Chama metodos de deposito e saque ----------");

        conta2.debitaSaldo(55);
        System.out.println(conta2.toString());
        conta2.creditaSaldo(100);
        System.out.println(conta2.toString());









    }
}