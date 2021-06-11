import javax.swing.JOptionPane;

public class QuadradoDosNumeros {
	public static void main(String args[]) {
		String entrada = JOptionPane.showInputDialog("Digite um numero: ");
		int x = Integer.parseInt(entrada);
		int n;
		String s = "";
		for (int i = 1; i < x + 1; i++) {
			n = i * i;
			s = s + i + "^2"+ " -> " + n + "\n";
		}
		JOptionPane.showMessageDialog(null, s);

	}

}
