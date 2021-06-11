package exercicioaula09;

public class ExercicioAula09 {

    public static void main(String[] args) {
        Pessoa leitor[] = new Pessoa[2];
        Livro livro[] = new Livro[3];

        leitor[0] = new Pessoa("Rodrigo", 23, "masculino");
        leitor[1] = new Pessoa("Maria", 25, "feminino");
        
        livro[0] = new Livro("Fumanchu", "Maria Juana", 300 , leitor[0]);
        livro[1] = new Livro("Java Júnior" , "Rodrigo Luigi" , 500 , leitor[1]);
        livro[2] = new Livro("Java Avançado" , "João Candido" , 400 , leitor[0]);
        
       //System.out.println(livro[0].detalhes());
        livro[1].detalhes();
        livro[1].abrir();
        livro[1].folhear(55);
        livro[1].avancarPag();
        livro[1].detalhes();
        

        

    }

}
