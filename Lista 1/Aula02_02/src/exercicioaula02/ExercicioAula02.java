
package exercicioaula02;

public class ExercicioAula02 { 
    public static void main(String[] args) {
        Desodorante d = new Desodorante();
        d.modelo = "Spray";
        d.marca = "Rexona";
        d.carga = 90;
        d.fechar();
        d.status();
        d.spray();
        d.abrir();
        d.spray();
        d.fechar();
        d.fechar();
    }
    
}
