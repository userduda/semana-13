package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Paciente;
import visao.JanelaPaciente;

public class PacienteControle implements ActionListener {

	private JanelaPaciente janela;
	private Paciente paciente;
	
	public PacienteControle(JanelaPaciente jan, Paciente pac) {
		janela = jan;
		paciente = pac;
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
		int idade = Integer.parseInt(janela.getTextIdade().getText());
		
		paciente.setCpf(cpf);
		paciente.setEndereco(endereco);
		paciente.setNome(nome);
		paciente.setIdade(idade);
		
		if(paciente.verificaCampos().isEmpty()) {
			System.out.println("Paciente Cadastrado");
		} else {
			System.out.println(paciente.verificaCampos() + " em branco!");
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Limpar")) {
			janela.limpaCampos();
		} else if (e.getActionCommand().equals("Cadastrar")) {
				cadastraViventes();
			}
		
	}
	
}
