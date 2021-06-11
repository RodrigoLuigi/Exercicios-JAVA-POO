import javax.swing.JOptionPane;

public class InformaNome {
	public static void main(String args[]) {
		Pessoa p = new Pessoa();
		String n = JOptionPane.showInputDialog("Nome: ");
		p.setNome(n);
		n = JOptionPane.showInputDialog("Idade: ");
		p.setIdade(n);
		String s = "";
		s = s + "Nome: " + p.getNome() + "     Idade: " + p.getIdade();
		JOptionPane.showMessageDialog(null, s);
	}

}
