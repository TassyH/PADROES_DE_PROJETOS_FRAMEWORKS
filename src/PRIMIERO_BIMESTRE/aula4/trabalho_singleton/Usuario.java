package PRIMIERO_BIMESTRE.aula4.trabalho_singleton;

public class Usuario {

    private int codigo;
    private String nome;

    public Usuario(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" + "\n"+
                "codigo = " + codigo + "\n" +
                "nome = " + nome + '\n' +
                '}';
    }
}
