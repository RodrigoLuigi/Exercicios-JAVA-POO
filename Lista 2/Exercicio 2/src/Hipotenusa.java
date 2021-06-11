import javax.swing.JOptionPane;

public class Hipotenusa {
	private double a;
	private double b;
	private double h;

	public void setA(double a) {
		this.a = a;

	}

	public void setB(double b) {
		this.b = b;
	}

	public void hipotenusa() {
		h = (a * a) + (b * b);
		h = Math.sqrt(h);
		JOptionPane.showMessageDialog(null, "Hipotenusa é de: " + h);
	}
}
