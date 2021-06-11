package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Caneta tampada , não posso rabiscar !!");
        }
        else{
            System.out.println("Estou rabiscando !!");
        }
    }
    void tampar(){
        if(this.tampada == false){
            this.tampada = true;
            System.out.println("A caneta foi tampada!!");
            
        }
           else{
            System.out.println("Caneta ja está Tampada!!");
        }
        
    }
    void destampar(){
        if(this.tampada == true){
        this.tampada = false;
        System.out.println("A caneta foi destampada!!");
        }else{
                System.out.println("Caneta ja está destampada!!");
                }
        
    }
    void status(){
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.print("Está tampada? " + this.tampada);
        System.out.println();
    }
    
}
