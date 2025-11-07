package controle;

import modelo.Paciente;
import visao.JanelaPaciente;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		JanelaPaciente jan = new JanelaPaciente();
		jan.setVisible(true);
		
		Paciente pac = new Paciente();
		
		PacienteControle pcon = new PacienteControle(jan, pac);
		
	}
	
}
