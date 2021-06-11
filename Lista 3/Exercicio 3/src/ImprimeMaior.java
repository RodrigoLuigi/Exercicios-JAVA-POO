import javax.swing.JOptionPane;

public class ImprimeMaior {
	public static void main(String args[]) {
		int v[] = new int[5];
		int maior = 0;
		String s = "";
		for (int i = 0; i < 5; i++) {
			String x = JOptionPane.showInputDialog("Digite dois números: ");
			v[i] = Integer.parseInt(x);
			s = s + "\n " + v[i];
			if (maior < v[i]) {
				maior = v[i];
			}

		}
		JOptionPane.showMessageDialog(null, s + "\nO maior numero é: "+maior);
	}
}