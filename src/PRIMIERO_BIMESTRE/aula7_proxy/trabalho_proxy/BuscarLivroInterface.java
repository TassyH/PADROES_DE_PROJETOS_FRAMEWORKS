package PRIMIERO_BIMESTRE.aula7_proxy.trabalho_proxy;

import java.util.ArrayList;

public interface BuscarLivroInterface {

    public ArrayList<Livro> buscarPorAutor(String autor);
    public ArrayList<Livro> buscarPorTitulo(String titulo);
    public Livro buscarPorISBN(int isbn);

}
