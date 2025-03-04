package PRIMIERO_BIMESTRE.aula2.atividades;

public class Livro extends Produto{

    protected String autor;
    protected String editora;
    protected int pagina;

    public Livro(int codigo, double preco, double imposto,  String autor, String editora, int pagina) {
        super(codigo, preco, imposto);
        this.autor = autor;
        this.editora = editora;
        this.pagina = pagina;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    @Override
    public double calculaImposto() {
        return this.preco = this.preco * 0.01;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor= '" + autor + '\'' +
                ", editora = '" + editora + '\'' +
                ", pagina = " + pagina +
                ", codigo = " + codigo +
                ", Preco = " + preco +
                ", Imposto = "+ calculaImposto() +
                ", Preço com IMPOSTO: " +getPreco()+calculaImposto() +
                '}';
    }
}
