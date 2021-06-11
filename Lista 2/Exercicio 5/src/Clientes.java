import javax.swing.JOptionPane;

public class Clientes {
	private String nome;
	private int idade;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void Cadastra() {
		Clientes c[] = new Clientes[5];
		PessoaFisica pf[] = new PessoaFisica[5];
		PessoaJuridica pj[] = new PessoaJuridica[5];
		String spf = " ", spj = " ", cliente = " ";
		for (int i = 0; i < 5; i++) {
			String operador = JOptionPane.showInputDialog("          CADASTRO CLIENTES \n1 - Pessoa Fisica \n2 - Pessoa Juridica");
			int op = Integer.parseInt(operador);
				c[i] = new Clientes();
				String nome = JOptionPane.showInputDialog("Nome: ");
				c[i].setNome(nome);
				String idade = JOptionPane.showInputDialog("Idade: ");
				int id = Integer.parseInt(idade);
				c[i].setIdade(id);
				if (op == 1) {
					pf[i] = new PessoaFisica();
					pf[i].setNome(nome);
					pf[i].setIdade(id);
					String cpf = JOptionPane.showInputDialog("CPF: ");
					pf[i].setCPF(cpf);
					c[i] = pf[i];
					cliente = cliente + "\n" + c[i].getClass() + "\nNome: " + c[i].getNome() + "\nIdade: "
							+ c[i].getIdade() + "\nCPF: " + pf[i].getCPF() + "\n------------";
					spf = spf + "\n" + c[i].getClass() + "\nNome: " + pf[i].getNome() + "\nIdade: " + pf[i].getIdade()
							+ "\nCPF: " + pf[i].getCPF() + "\n-------------";
				}
				if (op == 2) {
					pj[i] = new PessoaJuridica();
					pj[i].setNome(nome);
					pj[i].setIdade(id);
					String cnpj = JOptionPane.showInputDialog("CNPJ: ");
					pj[i].setCNPJ(cnpj);
					c[i] = pj[i];
					cliente = cliente + "\n" + c[i].getClass() + "\nNome: " + c[i].getNome() + "\nIdade: "
							+ c[i].getIdade() + "\nCPF: " + pj[i].getCNPJ() + "\n-----------------------";
					spj = spj + "\n" + c[i].getClass() + "\nNome: " + pj[i].getNome() + "\nIdade: " + pj[i].getIdade()
							+ "\nCPF: " + pj[i].getCNPJ() + "\n------------------------";

				}
			}
			System.out.println("\n       Clientes\n" + cliente + "\n     Pessoa Fisica \n" + spf
					+ "\n         Pessoa Juridica\n" + spj);
		}
	}

