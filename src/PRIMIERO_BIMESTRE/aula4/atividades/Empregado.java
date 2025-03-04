package PRIMIERO_BIMESTRE.aula4.atividades;

public class Empregado {

    private String nome;
    private String email;
    private String cargo;
    private double salario;

    public Empregado(String nome, String email, String cargo, double salario) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void imprimeEmpregado(){
        Impressora imp = Impressora.getInstance();
        imp.imprime(toString());
    }

}
