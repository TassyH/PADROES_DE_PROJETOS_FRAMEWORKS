package PRIMIERO_BIMESTRE.aula6_factory.factory_trabalho;

public class Principal {
    public static void main(String[] args) {
     //   Empregado g = EmpregadoFactory.getEmpregadoTassy('G', "Pericles", "pesricless@gmail.com", 2008, 3540);

        Empregado g = EmpregadoFactory.getEmpregado("Pericles", "pesricless@gmail.com", 2008, 5000, 0, 0, 0, 0, 0, 0);
        System.out.println(g.toString());
        System.out.println("salario: "+g.ganhar());

        System.out.println("............................");

        Empregado c = EmpregadoFactory.getEmpregado("Turma do pagade", "pesricless@gmail.com", 2009, 2144, 10, 0, 0, 0, 0, 0);
        System.out.println(c.toString());
        System.out.println("salario total: "+c.ganhar());

        System.out.println("............................");

        Empregado h = EmpregadoFactory.getEmpregado("Só pra contrariar", "pesricless@gmail.com", 2005, 0, 0, 0, 0, 170, 36, 0);
        System.out.println(h.toString());
        System.out.println("salario total: "+h.ganhar());

        System.out.println("............................");
        Empregado i = EmpregadoFactory.getEmpregado( "Grupo Revelaçao", "pesricless@gmail.com", 2001, 0, 0, 50.66, 10, 0, 0,0);
        System.out.println(i.toString());
        System.out.println("salario total: "+i.ganhar());





    }
}
