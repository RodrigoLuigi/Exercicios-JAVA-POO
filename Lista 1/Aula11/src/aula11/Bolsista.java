package aula11;

public class Bolsista extends Aluno {

    public float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando Bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome()+ " è Bolsista , pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
