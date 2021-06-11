package aula11;

public class Tecnico extends Aluno{
    public float registroProfissional;
    
    public void praticar(){
        System.out.println("Praticando !!");
    }

    public float getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(float registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
