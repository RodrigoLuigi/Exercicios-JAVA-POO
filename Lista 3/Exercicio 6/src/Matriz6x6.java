import javax.swing.JOptionPane;

public class Matriz6x6 {
	public static void main(String args[]) {
		String m[][] = new String[6][6];
		String s = "";
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				String x = "*";
				m[i][j] = x;
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				s = s + " " + m[i][j];

			}
			s += "\n";
		}
		JOptionPane.showMessageDialog(null, s);
	}
}
