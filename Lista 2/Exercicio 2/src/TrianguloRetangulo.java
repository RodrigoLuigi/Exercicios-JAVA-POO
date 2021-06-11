import javax.swing.JOptionPane;

public class TrianguloRetangulo {
	public static void main(String args[]) {
		Hipotenusa h = new Hipotenusa();
		String entradaA = JOptionPane.showInputDialog("Aresta A: ");
		double a = Double.parseDouble(entradaA);
		h.setA(a);
		String entradaB = JOptionPane.showInputDialog("Aresta B: ");
		double b = Double.parseDouble(entradaB);
		h.setB(b);
		h.hipotenusa();

	}

}
