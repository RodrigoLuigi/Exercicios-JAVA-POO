import javax.swing.JOptionPane;

public class OrdemInversa {
	public static void main(String args[]) {
		int ordem[] = new int[10];
		System.out.print("\n" + OrdemDecrescente.PreencheVetor(ordem));
		for (;;) {
			String operador = JOptionPane.showInputDialog("\n1 - Preencher novo vetor \n2 - Ordenar Inversa \n3 - Imprimir(Maior ,Menor  e Média \n4 - Sair");
			int op = Integer.parseInt(operador);
			if (op == 1) {
				JOptionPane.showMessageDialog(null , "\n" + OrdemDecrescente.PreencheVetor(ordem));
			}
			if (op == 2) {
				JOptionPane.showMessageDialog(null ,"\n" + OrdemDecrescente.Ordena(ordem));
			}
			if (op == 3) {
				JOptionPane.showMessageDialog(null ,"\n" + OrdemDecrescente.ImprimeMaiorMediaMenor(ordem));
			}
			if ( op == 4) {
				break;
			}
		}
	}
}
