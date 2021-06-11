package aula05;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public float getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if ("cc".equals(tipo)) {
            this.setSaldo(50);
        } else if ("cp".equals(getTipo())) {
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com sucesso!!");
        
    }      

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro!!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com débito!!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }

    }

    public void depositar(float valor) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!!");
        } else {
            System.out.println("A Conta está fechada");
        }

    }

    public void sacar(float valor) {

        if (this.getStatus() == true) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente para saque!");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        int valor = 10;
        if ("cc".equals(this.getTipo())) {
            valor = 12;
        } else if ("cp".equals(this.getTipo())) {
            valor = 20;
        }
        if (this.getStatus() == true) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso!");
            } else {
                System.out.println("Saldo insuficiente , Impossivel pagar a mensalidade!!");            
            }
        } else {
            System.out.println("Não é possivel cobrar mensalidade de uma conta fechada!");
        }
    }

    public void status() {
        System.out.println("------------------------");
        System.out.println("Número da Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }
}
