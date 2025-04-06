package PRIMIERO_BIMESTRE.aula6_factory.factory_trabalho;

public class EmpregadoFactory {

    String tipoContrato;
    String nome;
    String email;
    int anoContratacao;

//    public static Empregado getEmpregado(int cargo, String nome, String email, int anoContratacao){
//        if(cargo == 1){
//            return new Gerente(nome, email, anoContratacao, 5000);
//        }else if(cargo == 2){
//            return  new PorComissao(nome, email, anoContratacao, 5712, 0.10, 5);
//        }else if(cargo == 3){
//            return new PorHora(nome, email, anoContratacao, 36, 170);
//        }else if(cargo == 4){
//            return new PorItem(nome, email, anoContratacao, 36, 80);
//        }
//        else {
//            return null;
//        }
//    }
// METODO QUE EU CRIEI PRa testar melhor esse factory
   public static Empregado getEmpregado(String nome, String email, int anoContratacao, double salario, double comissao, double valor_producao, int quantidade, int quant_hora, double valor_hora, int vendas){
        if(salario != 0 & comissao == 0 && vendas == 0){
            return new Gerente(nome, email, anoContratacao, salario);
        }else if(salario != 0 & comissao != 0){
            return  new PorComissao(nome, email, anoContratacao, salario, comissao, vendas);
        }else if(valor_hora != 0 && quant_hora != 0){
            return new PorHora(nome, email, anoContratacao, valor_hora, quant_hora);
        }else if(quantidade != 0 & valor_producao != 0){
            return new PorItem(nome, email, anoContratacao, valor_producao, quantidade);
        }
        else {
            return null;
       }
   }





}
