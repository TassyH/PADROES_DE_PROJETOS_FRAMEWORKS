package PRIMIERO_BIMESTRE.aula7_proxy.trabalho_proxy;

import java.util.ArrayList;

public class ProxyBuscaLivro implements BuscarLivroInterface{

    BuscarLivro buscar = new BuscarLivro();

    @Override
    public ArrayList<Livro> buscarPorAutor(String autor) {

        ArrayList<Livro> listarPorAutor = new ArrayList<>();
        if(autor.equals("Dan Brown")){
            listarPorAutor.add(new Livro("Dan Brown", "Origem", 12345));
            listarPorAutor.add(new Livro("Dan Brown", "Inferno", 53654));
            listarPorAutor.add(new Livro("Dan Brown", "Codigo Da Vinci", 256487));
        }else{
            listarPorAutor = buscar.buscarPorAutor(autor);
        }
        return listarPorAutor;
    }

    @Override
    public ArrayList<Livro> buscarPorTitulo(String titulo) {
        ArrayList<Livro> listarPorTitulo = new ArrayList<>();
        if(titulo.equals("Dom Casmurro")){
            listarPorTitulo.add(new Livro("Machado de Assis", "Dom Casmurro", 12345));
        }else{
            listarPorTitulo = buscar.buscarPorTitulo(titulo);
        }
        return listarPorTitulo;
    }

    @Override
    public Livro buscarPorISBN(int isbn) {
        Livro buscaPorCod = new Livro();
        if(isbn == 326457){
           buscaPorCod = new Livro("Suzanne Collins", "Jogos Vorazes", 326457);
        }else{
            buscaPorCod = buscar.buscarPorISBN(isbn);
        }
        return buscaPorCod;
    }
}
