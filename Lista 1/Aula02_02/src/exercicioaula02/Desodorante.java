package exercicioaula02;

public class Desodorante {
    String modelo;
    String marca;
    int carga;
    boolean fechado;
    
    void abrir(){
        if(this.fechado == true){
        this.fechado = false;
        System.out.println("Desodorante Aberto!");
        }
        else{
            System.out.println("O desodorante já está aberto!");
        }
    }
    void fechar(){
        if(this.fechado == false){
        this.fechado = true;
        System.out.println("Desodorante Fechado!");
        }
        else{
            System.out.println("O desodorante já está fechado!");
        }
    }
    void spray(){
        if(this.fechado == true){
            System.out.println("ERRO !! Desodorante fechado !!");
        }
        else{
            System.out.println("Phssssssssssssss , Desodorante usado com sucesso!!");
        }
    }
    void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Marca: "+ this.marca);
        System.out.println("Carga: "+ this.carga);
        if(this.fechado == true){
        System.out.println("Está fechado!!");   
        }
        else{
            System.out.println("Está Aberto !");
        }
    }
   
    
}
