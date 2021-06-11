import javax.swing.JOptionPane;

public class OrdemDecrescente {

	public static String PreencheVetor(int ordem[]) {
		String s = " ";
		for (int i = 0; i < ordem.length; i++) {
			String entrada = JOptionPane.showInputDialog("Digite um número: ");
			ordem[i] = Integer.parseInt(entrada);
			s = s + "\n " + ordem[i] + "  posição -> " + i;
		}
		return s;
	}

	public static String Ordena(int ordem[]) {
		String f = " ";
		for (int i = ordem.length - 1; i >= 0; i--) {
			f = f + "\n " + ordem[i] + "  posição -> " + i;
		}
		return f;
	}

	public static String ImprimeMaiorMediaMenor(int ordem[]) {
		int contador = 0, soma = 0, media, maior = ordem[0], menor = ordem[0];
		for (int i = 0; i < ordem.length; i++) {
			soma = soma + ordem[i];
			contador = contador + 1;
			if (maior < ordem[i]) {
				maior = ordem[i];
				ordem[i] = maior;
			}
			if (menor > ordem[i]) {
				menor = ordem[i];
				ordem[i] = menor;
			}
		}
		media = soma / contador;
		String x = " ";
		x = x + "\nMaior número: " + maior + "\nMenor número: " + menor + "\nMédia: " + media;
		return x;
	}
}