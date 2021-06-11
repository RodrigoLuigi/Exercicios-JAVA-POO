import javax.swing.JOptionPane;

public class SalarioFuncionarios {
	public static void main(String args[]) {
		int contador = 0;
		float salario,y=0;
		for (;;) {
			String entrada = JOptionPane.showInputDialog("Salario: ");
			salario = Float.parseFloat(entrada);
			y = y + salario;
			contador = contador + 1;
			System.out.println(y + " " + contador);
			if (salario == -1) {
				contador = contador - 1;
				y = y + 1;
				break;
			}
		}
			
		float total = y / contador;
		JOptionPane.showMessageDialog(null , "\nValor total dos Salários: R$" + y + "\nQuantidade de Salários: " + contador + "\nMédia total dos Pagamentos: R$" + total);
	}
}
