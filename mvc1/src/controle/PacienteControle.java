package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.PacienteDAO;
import modelo.Paciente;
import visao.JanelaPaciente;

public class PacienteControle implements ActionListener {

	private JanelaPaciente janela;
	private Paciente paciente;
	private PacienteDAO pacDAO;

	public PacienteControle(JanelaPaciente jan, Paciente pac) {
		janela = jan;
		paciente = pac;
		pacDAO = new PacienteDAO();
		registraListeners();
	}

	public void registraListeners() {
		janela.getBtnCadastrar().addActionListener(this);
		janela.getBtnlimpar().addActionListener(this);
	}

	public void cadastraViventes() {
		String nome = janela.getTextNome().getText();
		String cpf = janela.getTextCPF().getText();
		String endereco = janela.getTextEndereco().getText();

		try {

			Integer idade = Math.abs(Integer.parseInt(janela.getTextIdade().getText()));

			paciente.setCpf(cpf);
			paciente.setNome(nome);
			paciente.setEndereco(endereco);
			paciente.setIdade(idade);

			if (paciente.verificaAtributos().isEmpty()) {
				if (Paciente.isCPF(cpf)) {
					if(pacDAO.gravaPaciente(paciente)) {
						JOptionPane.showMessageDialog(janela, "Paciente cadastrado!");
						janela.limpaCampos();
					} else {
						JOptionPane.showMessageDialog(janela, "Erro ao cadastrar");
					}
					
				} else {
					JOptionPane.showMessageDialog(janela, "Número informado não é CPF!");
				}

			} else {

				JOptionPane.showMessageDialog(janela, paciente.verificaAtributos() + " em branco!");
				// System.out.println(paciente.verificaAtributos() + " em branco!");
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(janela, "Preencha a idade!");

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Limpar")) {
			janela.limpaCampos();
		} else if (e.getActionCommand().equals("Cadastrar")) {
			cadastraViventes();
		}

	}

}
