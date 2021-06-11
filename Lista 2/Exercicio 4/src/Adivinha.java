import java.util.Random;

import javax.swing.JOptionPane;

public class Adivinha {
	Random random = new Random();
	private int numero;
	private int x;
	private int n;

	public void setNum(int n) {
		this.n = n;
	}

	public void adivinha() {
		numero = random.nextInt(10);
		x = numero;
		if (n == x) {
			JOptionPane.showMessageDialog(null, "Você acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Você errou! \nO número é: " + x);
		}

	}

}
