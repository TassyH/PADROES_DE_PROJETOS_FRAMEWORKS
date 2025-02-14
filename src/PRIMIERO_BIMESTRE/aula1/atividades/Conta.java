package PRIMIERO_BIMESTRE.aula1.atividades;

public class Conta {

    private String numero;
    private double saldo;

    public Conta(){

    }

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarConta(){
        System.out.println("CONTA");
        System.out.println("NUMERO: "+getNumero());
        System.out.println("SALDO: "+getSaldo());

    }

    @Override
    public String toString() {
        return "PRIMIERO_BIMESTRE.aula1.atividades.Conta{" +
                "numero='" + getNumero() + '\'' +
                ", saldo=" + getSaldo() +
                '}';
    }

    public void debitaSaldo(double valor){
        setSaldo(saldo-=valor);
    }

    public void creditaSaldo(double valor){
        setSaldo(saldo+=valor);
    }
}
