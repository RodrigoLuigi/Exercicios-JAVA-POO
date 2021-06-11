import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastraCliente extends JFrame {
	JButton botao;
	JLabel caixatexto;

	public CadastraCliente() {
		getContentPane().setLayout(null);
		EventoBotao objetolistener = new EventoBotao();
		caixatexto = new JLabel();
		caixatexto.setText("CADASTRO DE PESSOAS FISICA E JURIDICA");
		caixatexto.setBounds(10, 10, 250, 30);
		add(caixatexto);
		botao = new JButton();
		botao.setText("Cadastrar Cliente");
		botao.addActionListener(objetolistener);
		botao.setBounds(60, 80, 150, 30);
		add(botao);
		setSize(300, 160);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String args[]) {
		CadastraCliente janela = new CadastraCliente();
	}

	public class EventoBotao implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == botao) {
				Clientes cadastro = new Clientes();
				cadastro.Cadastra();
			}
		}
	}
}
