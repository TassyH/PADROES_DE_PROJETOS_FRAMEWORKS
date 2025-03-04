package PRIMIERO_BIMESTRE.aula2;

public class Principla {

    public static void main(String[] args) {

        Livro li = new Livro(2, 65, 1, "Susan Colins", "Arquiro", 300);
        Livro li2 = new Livro(4, 1000, 1, "JK ROLLING", "Arqueiro", 500);

        Midia mi = new Midia(3, 1000, 2, "Twenty One Pilots");
        Midia mi2 = new Midia(5, 1000, 2, "Alt-J");


        System.out.println("----- valores originais ------");

        System.out.println(li.toString());
        System.out.println(mi.toString());
        System.out.println(li2.toString());
        System.out.println(mi2.toString());

        System.out.println("----- valores alterados com metodos ------");
        li.darDesconto(10);
        li2.darDesconto(20);

        mi.darDesconto(15);
        mi2.darDesconto(30);

        System.out.println("Livro 1: "+li.getPreco());
        System.out.println("Preço com imposto "+li.calculaImposto());
        System.out.println("Livro 2: "+li2.getPreco());

        System.out.println("Midia 1: "+mi.getPreco());
        System.out.println("Midia 2': "+mi2.getPreco());









    }

}
