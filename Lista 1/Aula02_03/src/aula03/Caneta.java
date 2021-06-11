package aula03;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Caneta tampada , não posso rabiscar !!");
        } else {
            System.out.println("Estou rabiscando !!");
        }
    }

    public void tampar() {
        if (this.tampada == false) {
            this.tampada = true;
            System.out.println("A caneta foi tampada!!");

        } else {
            System.out.println("Caneta ja está Tampada!!");
        }

    }

    public void destampar() {
        if (this.tampada == true) {
            this.tampada = false;
            System.out.println("A caneta foi destampada!!");
        } else {
            System.out.println("Caneta ja está destampada!!");
        }

    }

    public void status() {
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.print("Está tampada? " + this.tampada);
        System.out.println();
    }

}
