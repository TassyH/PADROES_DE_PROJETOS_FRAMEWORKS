package PRIMIERO_BIMESTRE.aula6.factory_atividades.ativ2;

public class PessoaFactory {

    public static Pessoa getPessoa(String nome, char sexo, int idade) {

        if (sexo == 'M') {
            return new Homem(nome, idade);
        } else if (sexo == 'F') {
            return new Mulher(nome, idade);
        }else {
            return null;
        }
//        switch (sexo){
//            case "M":
//                return new Homem(nome, idade);
//            case "F":
//                return new Mulher(nome, idade);
//            default:
//                return null;
//        }

    }


}
