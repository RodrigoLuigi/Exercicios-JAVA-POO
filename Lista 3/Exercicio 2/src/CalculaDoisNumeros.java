import javax.swing.JOptionPane;

public class CalculaDoisNumeros {
	public static void main(String args[]) {
		String x = JOptionPane.showInputDialog("Digite dois numeros : ");
		float num1 = Float.parseFloat(x);
		String y = JOptionPane.showInputDialog("");
		float num2 = Float.parseFloat(y);
		float soma = num1+num2;
		float subtrai = num1-num2;
		float divide = num1/num2;
		float multiplica = num1*num2;
		JOptionPane.showMessageDialog(null, "soma: "+ soma + "\nsubtracao: "
		+ subtrai + "\ndivisao: " + divide + "\nmultiplicação: " + multiplica );
		
		
		
		
	}

}
