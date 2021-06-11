import javax.swing.JOptionPane;

public class ImprimeSequencia {
	public static void main(String args[]) {
		String x= "*";
		String s = "";
		for (int i = 0 ; i< 6 ; i++) {
			System.out.println(x);
			s = s + x + " ";
			x = x+'*';
			s += "\n";
		}
		JOptionPane.showMessageDialog(null, s);
		
	}

}
