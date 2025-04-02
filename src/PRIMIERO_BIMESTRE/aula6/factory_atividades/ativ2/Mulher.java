package PRIMIERO_BIMESTRE.aula6.factory_atividades.ativ2;

public class Mulher extends Pessoa{

    public Mulher(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Olá Senhor "+this.nome);
    }

    @Override
    public String toString() {
        return "Mulher{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
