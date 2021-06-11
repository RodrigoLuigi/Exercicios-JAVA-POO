import javax.swing.JOptionPane;

public class InformaNome {
	public static void main(String args[]){
		int t = 1;
		Pessoa p[] = new Pessoa[t];
		for (int i = 0; i < t; i++) {
			p[i] = new Pessoa();
			String n = JOptionPane.showInputDialog("Nome: ");
			p[i].setNome(n);
			n = JOptionPane.showInputDialog("Idade: ");
			p[i].setIdade(n);
		}
		String s = "";
		for (int i=0 ; i<t ; i++) {
			s = s + "Nome: " + p[i].getNome() + " Idade: " + p[i].getIdade();
			JOptionPane.showMessageDialog(null, s);
		}
		
	}
}
