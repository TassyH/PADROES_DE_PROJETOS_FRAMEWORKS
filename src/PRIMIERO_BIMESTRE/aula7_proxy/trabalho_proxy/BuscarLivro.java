package PRIMIERO_BIMESTRE.aula7_proxy.trabalho_proxy;

import java.util.ArrayList;

public class BuscarLivro implements BuscarLivroInterface{


    @Override
    public ArrayList<Livro> buscarPorAutor(String autor) {
        ArrayList<Livro> listarPorAutor = new ArrayList<>();
        System.out.println("INICIANDO PROCESSO DE BUSCA NO BANCO DE DADS");
        listarPorAutor.add(new Livro("Clarice Lispector", "A hora da estrela", 56987));
        listarPorAutor.add(new Livro("Clarice Lispector", "Felicidade Clandestina", 211156));
        listarPorAutor.add(new Livro("Clarice Lispector", "Laços de Familia", 333256));
        System.out.println("ENCERRANDO PROCESSO DE BUSCA NO BANCO DE DADOS");
        return listarPorAutor;
    }

    @Override
    public ArrayList<Livro> buscarPorTitulo(String titulo) {
        ArrayList<Livro> listarPorTitulo = new ArrayList<>();
        System.out.println("INICIANDO PROCESSO DE BUSCA NO BANCO DE DADS");
        listarPorTitulo.add(new Livro("Jorge Amado", "Capitaes da Areia", 9887));
        System.out.println("ENCERRANDO PROCESSO DE BUSCA NO BANCO DE DADOS");
        return listarPorTitulo;    }

    @Override
    public Livro buscarPorISBN(int isbn) {
        System.out.println("INICIANDO PROCESSO DE BUSCA NO BANCO DE DADS");
        Livro livro = new Livro("Carlos Drumond Andrade", "Poemas", 111111);
        System.out.println("ENCERRANDO PROCESSO DE BUSCA NO BANCO DE DADOS");
        return livro;     }
}
