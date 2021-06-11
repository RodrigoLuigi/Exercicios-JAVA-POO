package aula11;

public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        
       /* Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
       Aluno a1 = new Aluno();
       a1.setNome("Claudio");
       a1.setIdade(23);
       a1.setMatricula(1111);
       a1.setCurso("Informática");
       a1.setSexo("M");
       a1.pagarMensalidade();
       Bolsista b1 = new Bolsista();
       b1.setNome("Rodrigo");
       b1.setIdade(23);
       b1.setSexo("m");
       b1.setMatricula(2222);
       b1.setCurso("Programação");
       b1.setBolsa(12.5f);
       b1.pagarMensalidade();
    }

}
