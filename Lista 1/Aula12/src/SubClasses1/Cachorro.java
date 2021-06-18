package SubClasses1;

import SubClasses.Mamifero;

public class Cachorro extends Mamifero {

    public void enterrarOsso() {
        System.out.println("Enterrando osso");

    }

    public void abanarRabo() {
        System.out.println("Abanando o Rabo");

    }
    
    @Override
    public void emitirSom(){
        System.out.println("AU! AU! AU!");
    }

}
