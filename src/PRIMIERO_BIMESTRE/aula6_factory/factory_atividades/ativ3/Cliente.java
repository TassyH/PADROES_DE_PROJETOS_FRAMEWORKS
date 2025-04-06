package PRIMIERO_BIMESTRE.aula6_factory.factory_atividades.ativ3;

public class Cliente {
    private String nome;
    private char preferencia;

    public Cliente(String nome, char preferencia) {
        this.nome = nome;
        this.preferencia = preferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(char preferencia) {
        this.preferencia = preferencia;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", preferencia=" + preferencia +
                '}';
    }
}
