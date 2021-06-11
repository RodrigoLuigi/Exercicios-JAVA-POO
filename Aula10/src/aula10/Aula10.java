package aula10;

public class Aula10 {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p2.setCurso("Informática");
        p3.setSalario(2300.50f);
        p4.setSetor("Financeiro");
        
        p1.setIdade(22);
        p2.setIdade(28);
        p3.setIdade(18);
        p4.setIdade(20);
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
       // p1.receberAum(550.20f);
       // p2.mudarTrabalho();
       // p4.cancelarMatr();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }

}
