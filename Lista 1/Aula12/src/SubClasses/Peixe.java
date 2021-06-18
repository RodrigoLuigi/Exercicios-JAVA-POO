package SubClasses;

import SuperClasse.Animal;

public class Peixe extends Animal {

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo planktons");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz Som");
    }

    public void soltarBolha() {
        System.out.println("Soltou bolha!");
    }

}
