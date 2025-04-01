package PRIMIERO_BIMESTRE.aula6.factory_trabalho;

import java.util.HashMap;

public class EmpregadoFactory {

    String tipoContrato;
    String nome;
    String email;
    int anoContratacao;

    public static Empregado getEmpregado(int cargo, String nome, String email, int anoContratacao){
        if(cargo == 1){
            return new Gerente(nome, email, anoContratacao, 5000);
        }else if(cargo == 2){
            return  new PorComissao(nome, email, anoContratacao, 5712, 0.10, 5);
        }else if(cargo == 3){
            return new PorHora(nome, email, anoContratacao, 36, 170);
        }else if(cargo == 4){
            return new PorItem(nome, email, anoContratacao, 36, 80);
        }
        else {
            return null;
        }
    }
// METODO QUE EU CRIEI PRa testar melhor esse factory
//    public static Empregado getEmpregadoTassy(char tipoContrato, String nome, String email, int anoContratacao, double salario, double comissao, double valor_producao, int quantidade, int quant_hora, double valor_hora, int vendas){
//        if(tipoContrato == 'G'){
//            return new Gerente(nome, email, anoContratacao, salario);
//        }else if(tipoContrato == 'C'){
//            return  new PorComissao(nome, email, anoContratacao, salario, comissao, vendas);
//        }else if(tipoContrato == 'H'){
//            return new PorHora(nome, email, anoContratacao, valor_hora, quant_horas);
//        }else if(tipoContrato == 'I'){
//            return new PorItem(nome, email, anoContratacao, valor_producao, quantidade);
//        }
//        else {
//            return null;
//        }
//    }





}
