package SubClasses1;

import SubClasses.Mamifero;

public class Canguru extends Mamifero {

    public void usarBolsa(){
        System.out.println("Usando a Bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
    
    

}
