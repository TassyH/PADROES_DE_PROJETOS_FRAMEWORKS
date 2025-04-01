package PRIMIERO_BIMESTRE.aula6.factory_trabalho;

public class Principal {
    public static void main(String[] args) {
     //   Empregado g = EmpregadoFactory.getEmpregadoTassy('G', "Pericles", "pesricless@gmail.com", 2008, 3540);

        Empregado g = EmpregadoFactory.getEmpregado(1, "Pericles", "pesricless@gmail.com", 2008);
        System.out.println(g.toString());
        System.out.println("salario: "+g.ganhar());

        System.out.println("............................");

        Empregado c = EmpregadoFactory.getEmpregado(2, "Turma do pagade", "pesricless@gmail.com", 2009);
        System.out.println(c.toString());
        System.out.println("salario: "+c.ganhar());

        System.out.println("............................");

        Empregado h = EmpregadoFactory.getEmpregado(3, "Só pra contrariar", "pesricless@gmail.com", 2005);
        System.out.println(h.toString());
        System.out.println("salario: "+h.ganhar());

        System.out.println("............................");
        Empregado i = EmpregadoFactory.getEmpregado(4, "Grupo Revelaçao", "pesricless@gmail.com", 2001);
        System.out.println(i.toString());
        System.out.println("salario: "+i.ganhar());





    }
}
