package PRIMIERO_BIMESTRE.aula6_factory.factory_atividades.ativ2;

public class Homem extends Pessoa{

    public Homem (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Olá senhor "+this.nome);
    }

    @Override
    public String toString() {
        return "Homem{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
