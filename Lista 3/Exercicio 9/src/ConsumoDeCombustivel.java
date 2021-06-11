import javax.swing.JOptionPane;

public class ConsumoDeCombustivel {
	public static void main(String args[]) {
		float consumo;
		for (;;) {
			String operador = JOptionPane.showInputDialog("1 - Para calcular consumo" + "\n2 - Para sair");
			int op = Integer.parseInt(operador);
			if (op == 1) {
				String quilometros = JOptionPane.showInputDialog("Quantos quilômetros foram percorridos? ");
				int km = Integer.parseInt(quilometros);
				String litros = JOptionPane.showInputDialog("Quantos litros foram gastos? ");
				int ltr = Integer.parseInt(litros);
				consumo = km / ltr;
				JOptionPane.showMessageDialog(null, "O consumo foi de " + consumo + " Km / litro!!!");
			}
			if (op == 2) {
				break;
			}
		}
	}
}
