import javax.swing.JOptionPane;

public class Somatorio {
	public static void main(String args[]) {
		String entrada = JOptionPane.showInputDialog("Digite um numero: ");
		int x = Integer.parseInt(entrada), n = 1;
		for (int i = 1; i < x; i++) {
			n = n + i + 1;

		}
		JOptionPane.showMessageDialog(null, "O Somatório de " + x + " = " + n);
	}

}
