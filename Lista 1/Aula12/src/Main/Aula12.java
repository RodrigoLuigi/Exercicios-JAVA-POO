package Main;

import SubClasses.Reptil;
import SubClasses.Peixe;
import SubClasses.Mamifero;
import SubClasses.Ave;
import SubClasses1.Arara;
import SubClasses1.Cachorro;
import SubClasses1.Canguru;
import SubClasses1.Cobra;
import SubClasses1.GoldFish;
import SubClasses1.Tartaruga;

public class Aula12 {
    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        //p.locomover();
        //a.locomover();
        //r.locomover();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        c.locomover();
        j.locomover();
        t.locomover();
        k.emitirSom();
    }
    
}
