package aula05;

public class Aula05 {
        public static void main(String[] args) {
            ContaBanco c1 = new ContaBanco();
            c1.setNumConta(1111);
            c1.setDono("Jubileu");
            c1.abrirConta("cc");
            
            
            
            ContaBanco c2= new ContaBanco();
            c2.setNumConta(2222);
            c2.setDono("Creuza");
            c2.abrirConta("cp");
            
            c1.depositar(300);
            c2.depositar(500);
            c1.sacar(300);
            c2.sacar(550);
            
            c1.pagarMensal();
            c2.pagarMensal();
            
            c1.fecharConta();
            c2.fecharConta();
            
            c1.sacar(38);
            c2.sacar(1000);
            
            c1.pagarMensal();
            c2.pagarMensal();
            
            c1.fecharConta();
            c2.fecharConta();
            
            c1.status();
            c2.status();
            
            
            
            
           
            
    }
    
}
