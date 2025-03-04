package PRIMIERO_BIMESTRE.aula2.trabalho2;


public class Principal {

    public static void main(String[] args) {

        Livro li = new Livro(1, 1000.00, "Machado de Assis", "Editora Beta", 132);
        Midia mi = new Midia(2, 500.00, "Metalica");


        System.out.println("----- valores originais ------");

        System.out.println(li.toString());
        System.out.println(mi.toString());


        System.out.println("----- valores alterados com metodos ------");
        li.darDesconto(10);
        mi.reajustarPreco(20);
        System.out.println(li.toString());
        System.out.println(mi.toString());







    }

}
