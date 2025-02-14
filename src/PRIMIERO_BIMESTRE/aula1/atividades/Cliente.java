package PRIMIERO_BIMESTRE.aula1.atividades;

public class Cliente {

    private String anoNascimento;
    private String nome;
    private String email;

    public Cliente (){

    }

    public Cliente(String anoNascimento, String nome, String email, String cpf) {
        this.anoNascimento = anoNascimento;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
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

    public void mostrarCliente(){
        System.out.println("CLIENTE");
        System.out.println("NOME: "+getNome());
        System.out.println("EMAIL: "+getEmail());
        System.out.println("CPF: "+getCpf());
        System.out.println("ANO NASCIMENTO: "+getAnoNascimento());
    }

    @Override
    public String toString() {
        return "PRIMIERO_BIMESTRE.aula1.atividades.Cliente{" +
                "anoNascimento='" + anoNascimento + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
