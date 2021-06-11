import javax.swing.JOptionPane;

public class Equaçao2Grau {
	public static void main(String args[]) {
		double delta=0;
		String entrada = JOptionPane.showInputDialog("Escreva o valor de A: ");
		int a = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Escreva o valor de B: ");
		int b = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Escreva o valor de C: ");
		int c = Integer.parseInt(entrada);
		if (a != 0) {
			double pB = Math.pow(b, 2);
			delta = pB - 4 * a * c;
		}
		if (delta >= 0) {
			System.out.print("\nDelta: " + delta + " a: " + a + " b: " + b + " c: " + c);
			double x1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-1 * b - Math.sqrt(delta)) / (2 * a);
			System.out.print("\n" +"x1 = " + x1 + "  x2= " + x2 + "\n");
			JOptionPane.showMessageDialog(null, "\nO valor de x1 é: " + x1 + "\nOvalor de x2 é: " + x2);
		} 
		else {
			System.out.println("Nao foi possivel resolver, pois " + delta + " é menor que 0");
		}
	}
}
